package ir.co.sadad.eb.exception.exceptionmappers;

import ir.co.sadad.eb.exception.StudentCreationException;
import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;


@Provider
public class StudentCreationExceptionMapper implements ResponseExceptionMapper<StudentCreationException> {

//    @Inject
//    private Logger log;



    @Override
    public StudentCreationException toThrowable(Response response) {
        return new StudentCreationException();
    }

    @Override
    public boolean handles(int status, MultivaluedMap<String, Object> headers) {
//        log.error("status = " + status);
        return status == 500;
    }



}
