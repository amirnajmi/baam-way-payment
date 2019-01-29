package ir.co.sadad.eb.config.restconfig;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.enums.SecuritySchemeIn;
import org.eclipse.microprofile.openapi.annotations.enums.SecuritySchemeType;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.annotations.security.SecurityScheme;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

//@LoginConfig(
//        authMethod = "MP-JWT",
//        realmName = "MP-JWT"
//)
//@DeclareRoles({ADMIN, USER})
@ApplicationPath("resources")
@OpenAPIDefinition(
        info = @Info(
                title="baam-way-payment service",
                version = "1.0",
                contact = @Contact(name = "baamsan-group")
        ),
        security = @SecurityRequirement(name = "bearerAuth")
)
@SecurityScheme(
        securitySchemeName = "bearerAuth",
        description = "authentication needed to access User service app",
        type = SecuritySchemeType.HTTP,
        in = SecuritySchemeIn.HEADER,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class ApplicationConfig extends Application {
}
