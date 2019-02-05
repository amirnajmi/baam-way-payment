package ir.co.sadad.eb.exception.exceptionmappers;

import ir.co.sadad.eb.exception.BaseRestClientException;
import ir.co.sadad.eb.util.HttpStatusCode;
import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class RestClientResponseExceptionMapper implements ResponseExceptionMapper<BaseRestClientException> {


    @Override
    public BaseRestClientException toThrowable(Response response) {
        switch (response.getStatus()){
            case 400:
                return new BaseRestClientException(HttpStatusCode.BAD_REQUEST, "moneyTransfer.badRequest");
            case 401:
                return new BaseRestClientException(HttpStatusCode.UN_AUTHORIZE, "moneyTransfer.unAuthorized");
            case 404:
                return new BaseRestClientException(HttpStatusCode.NOT_FOUND, "moneyTransfer.notFound");
            case 412:
                return new BaseRestClientException(HttpStatusCode.PRECONDITION_FAILED, "moneyTransfer.preconditionFailed");
        }
        return null;
    }

    @Override
    public boolean handles(int status, MultivaluedMap<String, Object> headers) {
        return status == 400
                || status == 401
                || status == 404
                || status == 412;
    }
}
