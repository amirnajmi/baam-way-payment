package ir.co.sadad.eb.exception.exceptionmappers;

import ir.co.sadad.eb.exception.BusinessException;

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
        return Response.status(e.getStatusCode().getStatusCode()).entity(e).type("application/json; charset=UTF-8").build();
    }
}
