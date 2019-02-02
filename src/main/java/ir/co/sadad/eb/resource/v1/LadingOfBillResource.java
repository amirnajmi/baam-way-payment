package ir.co.sadad.eb.resource.v1;

import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.service.api.ILadingOfBillService;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;
import ir.co.sadad.eb.service.dto.LadingOfBillDto;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ladingOfBill")
public class LadingOfBillResource {

    @Inject
    private ILadingOfBillService iLadingOfBillService;

    @Timed
    @Operation(summary = "create lading of bill")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @APIResponse(responseCode = "404", description = "NotFound")
    @Path("/create")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response create(@RequestBody(description = "Create new ladingOfBill"
            ,content = @Content(mediaType = "application/json"
            ,schema = @Schema(implementation = LadingOfBillDto.class))) LadingOfBillDto ladingOfBillDto) throws BusinessException {
        return Response.ok().entity(iLadingOfBillService.createLadingOfBill(ladingOfBillDto)).build();
    }


    @Timed
    @Operation(summary = "update lading of bill")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @APIResponse(responseCode = "404", description = "NotFound")
    @Path("/update")
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response update(@RequestBody(description = "update lading of bill history"
            ,content = @Content(mediaType = "application/json",schema = @Schema(implementation = LadingOfBillDto.class))) LadingOfBillDto ladingOfBillDto) throws BusinessException{
        return Response.ok().entity(iLadingOfBillService.updateLadingOfBill(ladingOfBillDto)).build();
    }
}
