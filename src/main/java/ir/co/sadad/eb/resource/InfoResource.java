package ir.co.sadad.eb.resource;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;
import java.util.Optional;

/**
 * Controller for profile information.
 */
@Path("/restclientapi/info")
public class InfoResource {

    @Inject
    @ConfigProperty(name = "display.ribbon")
    private Optional<String> displayRibbonOnProfiles;

    @Inject
    @ConfigProperty(name = "active.profiles")
    private List<String> activeProfiles;



    @GET
    public JsonObject getInfo() {
        JsonObjectBuilder buider = Json.createObjectBuilder()
                .add("activeProfiles", Json.createArrayBuilder(activeProfiles));
        displayRibbonOnProfiles.ifPresent(value -> buider.add("display-ribbon-on-profiles", value));
        return buider.build();
    }

}
