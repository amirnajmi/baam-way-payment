package ir.co.sadad.eb.util.interceptor;

import ir.co.sadad.eb.util.qualifier.TransactionDebugger;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@TransactionDebugger
public class TransactionInterceptor {
    @Inject
    private Logger logger;

    public Object runInTransaction(InvocationContext invocationContext) throws Exception {
        try {
            return invocationContext.proceed();
        } catch (Exception e) {
            logger.debug(e.getMessage());
            throw e;
        }
    }

}
