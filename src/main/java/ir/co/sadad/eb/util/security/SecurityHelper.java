package ir.co.sadad.eb.util.security;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.security.enterprise.SecurityContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Utility class for Security.
 */
@RequestScoped
@Path("/restclientapi")
public class SecurityHelper {

    @Inject
    private SecurityContext securityContext;

    @Path(value = "/current-user")
    @GET
    public String getCurrentUserLogin() {
        if (securityContext == null || securityContext.getCallerPrincipal() == null) {
            return null;
        }
        return securityContext.getCallerPrincipal().getName();
    }
}
