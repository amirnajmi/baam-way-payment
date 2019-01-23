package ir.co.sadad.eb.exception.handler;

import org.slf4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Inject
    private Logger logger ;


    @Override
    public void uncaughtException(Thread t, Throwable e) {
        logger.debug(t.getName() + " : " + e.getMessage());
    }
}
