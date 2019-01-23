package ir.co.sadad.eb.exception.exceptionmappers;

import ir.co.sadad.eb.exception.HotelException;
import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

public class HotelExceptionMapper implements ResponseExceptionMapper<HotelException> {

    @Inject
    private Logger log;


    @Override
    public HotelException toThrowable(Response response) {
        return new HotelException();
    }

    @Override
    public boolean handles(int status, MultivaluedMap<String, Object> headers) {
        log.error("status = " + status);
        return status == 500;
    }

}
