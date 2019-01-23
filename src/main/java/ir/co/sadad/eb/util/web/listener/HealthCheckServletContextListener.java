package ir.co.sadad.eb.util.web.listener;

import com.codahale.metrics.health.HealthCheck;
import com.codahale.metrics.health.HealthCheckRegistry;
import com.codahale.metrics.servlets.HealthCheckServlet;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.ServletContextEvent;

/**
 * Created by kahmadi on 9/21/2016.
 */

public class HealthCheckServletContextListener extends HealthCheckServlet.ContextListener {

    @Inject
    private EntityManager em;

    public static final HealthCheckRegistry HEALTH_CHECK_REGISTRY = new HealthCheckRegistry();

    @Override
    protected HealthCheckRegistry getHealthCheckRegistry() {
        return HEALTH_CHECK_REGISTRY;
    }

    @Override
    public void contextInitialized(ServletContextEvent event) {
        super.contextInitialized(event);
        HEALTH_CHECK_REGISTRY.register("Database", new HealthCheck() {
            @Override
            protected Result check() throws Exception {
                try {
                    Query query = em.createNativeQuery("SELECT CURRENT TIMESTAMP FROM sysibm.sysdummy1");
                    query.getSingleResult();
                    return HealthCheck.Result.healthy();
                } catch (Throwable e) {
                    return HealthCheck.Result.unhealthy(e);
                }
            }
        });
    }
}
