package ir.co.sadad.eb.util.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 * Logging producer for injectable log4j logger
 *
 */

public class LoggerProducer {

    /**
     * @param injectionPoint
     * @return logger
     */
    @Produces @Dependent
    public Logger producer(InjectionPoint injectionPoint) {
        return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }

}
