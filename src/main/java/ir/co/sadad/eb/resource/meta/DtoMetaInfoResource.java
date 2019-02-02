package ir.co.sadad.eb.resource.meta;

import ir.co.sadad.eb.util.file.JsonFileUtil;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import javax.inject.Inject;
import javax.json.JsonValue;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/dtoMetaInfo")
public class DtoMetaInfoResource {

    @Inject
    JsonFileUtil jsonFileUtil;

    @Timed
    @Operation(summary = "get meta of dtos")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "201", description = "Created")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @APIResponse(responseCode = "500", description = "InternalError")
    @APIResponse(responseCode = "")
    @Path("getMeta")
    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response getMeta() {
        JsonValue invoiceDto = jsonFileUtil.parseDtoMeta("invoiceDto");
        return Response.ok(invoiceDto).build();
    }

}
