package ir.co.sadad.eb.resource;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.HealthCheckResponseBuilder;

import javax.inject.Inject;

@Health
public class HealthResource implements HealthCheck {

    @Inject
    @ConfigProperty(name = "context.path")
    private String contextPath;

    @Override
    public HealthCheckResponse call() {
        HealthCheckResponseBuilder builder = HealthCheckResponse.named(contextPath);
        if (!System.getProperty("wlp.server.name").equals("defaultServer")) {
            return builder.withData("services", "not available").down().build();
        }
        return builder.withData("services", "available").up().build();
    }

}
