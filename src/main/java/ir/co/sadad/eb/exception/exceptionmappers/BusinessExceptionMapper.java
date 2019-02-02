package ir.co.sadad.eb.exception.exceptionmappers;

import ir.co.sadad.eb.exception.BusinessException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Provider
public class BusinessExceptionMapper implements ExceptionMapper<BusinessException> {


    @Override
    public Response toResponse(BusinessException e) {
        HashMap hashMap = new HashMap<String, String>() {
            {
                put("error", e.getMessage());
                put("error_cause", String.valueOf(e.getCause()));
                put("statusCode", String.valueOf(e.getStatusCode()));
            }
        };

        return Response.status(e.getStatusCode().getStatusCode())
                .entity(hashMap).type(MediaType.APPLICATION_JSON).build();
    }
}
