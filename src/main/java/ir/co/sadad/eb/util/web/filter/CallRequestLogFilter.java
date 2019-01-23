package ir.co.sadad.eb.util.web.filter;

import ir.bmi.audit.client.infra.HttpServletRequestCopierWrapper;
import ir.bmi.audit.client.infra.HttpServletResponseCopier;

import ir.co.sadad.eb.util.legacyutil.DateUtility;
import ir.co.sadad.eb.util.web.filter.dto.RequestInfo;
import ir.co.sadad.eb.util.web.filter.dto.ResponseInfo;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.Principal;
import java.util.Calendar;
import java.util.UUID;

/**
 * Created by kahmadi on 11/13/2016.
 */
public class CallRequestLogFilter implements Filter {

    @Inject
    private Logger logger;

    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletResponseCopier responseCopier = null;
        HttpServletRequestCopierWrapper requestCopier = null;

        if (servletResponse.getCharacterEncoding() == null) {
            servletResponse.setCharacterEncoding("UTF-8");
        }

        RequestInfo requestInfo = createRequestInfo(servletRequest);
        ResponseInfo responseInfo = createResponseInfo(servletRequest, requestInfo.getId());

        if (servletResponse instanceof HttpServletResponseCopier) {
            responseCopier = (HttpServletResponseCopier) servletResponse;
        } else {
            responseCopier = new HttpServletResponseCopier((HttpServletResponse) servletResponse);
        }

        if (servletRequest instanceof HttpServletRequestCopierWrapper) {
            requestCopier = (HttpServletRequestCopierWrapper) servletRequest;
        } else {
            requestCopier = new HttpServletRequestCopierWrapper((HttpServletRequest) servletRequest, requestInfo.getId());
        }

        requestInfo.setPayload(getBody(requestCopier));

        try {
            filterChain.doFilter(requestCopier, responseCopier);
            responseCopier.flushBuffer();
        } catch (Throwable t) {
            t.printStackTrace();
        } finally {

            byte[] copy = responseCopier.getCopy();

            responseInfo.setPayload(new String(copy, StandardCharsets.UTF_8));
            responseInfo.setDate(Calendar.getInstance().getTime());
            responseInfo.setPersionDate(DateUtility.getPersionDate(Calendar.getInstance().getTime()));
            responseInfo.setTime(DateUtility.getFormatedTimeWithSeparator(Calendar.getInstance().getTime(), true));
            responseInfo.setStatus(responseCopier.getStatus());

            requestInfo.setSSN((String) requestCopier.getAttribute("SSN"));

            auditReqResp(requestInfo, responseInfo);
        }
    }

    private RequestInfo createRequestInfo(ServletRequest request) {
        String requestId = UUID.randomUUID().toString();
        RequestInfo info = new RequestInfo();
        HttpServletRequest req = (HttpServletRequest) request;
        Principal principal = req.getUserPrincipal();
        if (principal != null)
            info.setUsername(principal.getName());

        info.setId(requestId);

        String xForwardedFor = ((HttpServletRequest) request).getHeader(com.google.common.net.HttpHeaders.X_FORWARDED_FOR);
        if (xForwardedFor != null)
            info.setxForwardedFor(String.format("%.128s", xForwardedFor));
        String requestUrl = ((HttpServletRequest) request).getRequestURL().toString();
        info.setRequestURL(String.format("%.512s", requestUrl));

        String uAgent = ((HttpServletRequest) request).getHeader(HttpHeaders.USER_AGENT);
        if (uAgent != null)
            info.setUserAgent(String.format("%.256s", uAgent));

        info.setServerAddr(request.getServerName() + ":" + request.getServerPort());
        info.setQueryString(((HttpServletRequest) request).getQueryString());
        info.setDate(Calendar.getInstance().getTime());
        info.setPersionDate(DateUtility.getPersionDate(Calendar.getInstance().getTime()));
        info.setTime(DateUtility.getFormatedTimeWithSeparator(Calendar.getInstance().getTime(), true));
        info.setHttpMethod(((HttpServletRequest) request).getMethod());
        info.setRemoteHost(request.getRemoteAddr());
        return info;
    }

    private String getBody(HttpServletRequest request) throws IOException {
        String body;
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
        char[] chars = new char[128];
        int bytesRead;
        while ((bytesRead = reader.read(chars)) > 0) {
            builder.append(chars, 0, bytesRead);
        }
        reader.close();
        body = builder.toString();
        return body;
    }

    private ResponseInfo createResponseInfo(ServletRequest request, String requestId) {
        HttpServletRequest req = (HttpServletRequest) request;
        Principal principal = req.getUserPrincipal();
        ResponseInfo responseInfo = new ResponseInfo();
        if (principal != null)
            responseInfo.setUsername(principal.getName());
        responseInfo.setId(UUID.randomUUID().toString());
        responseInfo.setRequestId(requestId);
        return responseInfo;
    }

    private void auditReqResp(RequestInfo requestInfo, ResponseInfo responseInfo) {
        try {

            if (!requestInfo.getRequestURL().contains("log/viewer")) {
                ObjectWriter objectWriter = new ObjectMapper().writer().withDefaultPrettyPrinter();

                logger.debug("\r\n \r\n \r\n \r\n========= ¯\\_◉‿◉_/¯ ==================(Request)===================== ⊂(◉‿◉)つ ===========================================================");
                logger.debug("\r\n=========================== ( ͡° ͜ʖ ͡°) ===================================================================¯¯\\_(ツ)_/¯¯=============");
                logger.debug("\r\nRequest:{}", objectWriter.writeValueAsString(requestInfo));
                logger.debug("\r\n============== _へ__(‾◡◝ )> =======================================================================================================");
                logger.debug("\r\n=================================== ヽ(•‿•)ノ ========== (๑‵●‿●‵๑) ================================================================");

                logger.debug("\r\n \r\n \r\n========= ¯\\_◉‿◉_/¯ ==================(Response)===================== ⊂(◉‿◉)つ ===========================================================");
                logger.debug("\r\n=========================== ( ͡° ͜ʖ ͡°) ===================================================================¯¯\\_(ツ)_/¯¯=============");
                logger.debug("\r\nResponse:{}", objectWriter.writeValueAsString(responseInfo));
                logger.debug("\r\n============== _へ__(‾◡◝ )> =======================================================================================================");
                logger.debug("\r\n=================================== ヽ(•‿•)ノ ========== (๑‵●‿●‵๑) ================================================================");
            }

        } catch (Exception e) {
            logger.error("\r\n \r\n \r\n \r\n========= ¯\\_◉‿◉_/¯ ======================================= ⊂(◉‿◉)つ ===========================================================");
            logger.error("\r\n=========================== ( ͡° ͜ʖ ͡°) ===================================================================¯¯\\_(ツ)_/¯¯=============");
            if (e.getMessage() != null)
                logger.error("\r\nCallRequestResponseLogFilter Error Message Is =  = ", e.getMessage());
            logger.error("\r\n-------------------------------------------------------------------------------------------------------------------------------");
            logger.error("\r\nCallRequestResponseLogFilter Error Is =  = ", e);
            logger.error("\r\n \r\n \r\n========= ¯\\_◉‿◉_/¯ ======================================= ⊂(◉‿◉)つ ===========================================================");
            logger.error("\r\n=========================== ( ͡° ͜ʖ ͡°) ===================================================================¯¯\\_(ツ)_/¯¯=============");
        }
    }

    @Override
    public void destroy() {

    }
}