package ir.co.sadad.eb.exception.handler;



import org.apache.deltaspike.core.api.exception.control.ExceptionHandler;
import org.apache.deltaspike.core.api.exception.control.Handles;
import org.apache.deltaspike.core.api.exception.control.event.ExceptionEvent;
import org.slf4j.Logger;

import javax.inject.Inject;

@ExceptionHandler
public class CustomExceptionHandler {

    @Inject
    private Logger logger;

    void printExceptions(@Handles ExceptionEvent<Throwable> event){
        logger.error("Something bad happened : "+ event.getException().getMessage());
        event.handledAndContinue();
    }

}
