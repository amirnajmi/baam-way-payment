package ir.co.sadad.eb.resource.v1;

import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.service.api.ILadingBillStatusHistoryService;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ladingOfBillStatusHistory")
public class LadingBillStatusHistoryResource {

    @Inject
    private ILadingBillStatusHistoryService iLadingBillStatusHistoryService;

    @Timed
    @Operation(summary = "create lading of bill status history")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @APIResponse(responseCode = "404", description = "NotFound")
    @Path("/create")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response create(LadingBillStatusHistoryDto ladingBillStatusHistoryDto) throws BusinessException {
        return Response.ok().entity(iLadingBillStatusHistoryService.createLadingBillStatusHistory(ladingBillStatusHistoryDto)).build();
    }
}
