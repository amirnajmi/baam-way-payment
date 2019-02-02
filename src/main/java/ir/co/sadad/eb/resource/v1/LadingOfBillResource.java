package ir.co.sadad.eb.resource.v1;

import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.service.api.ILadingOfBillService;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;
import ir.co.sadad.eb.service.dto.LadingOfBillDto;
import ir.co.sadad.eb.service.dto.LadingOfBillUpdateDto;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.openapi.annotations.Operation;
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
    @Path("/create")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response create(LadingOfBillDto ladingOfBillDto) {
        return Response.ok().entity(iLadingOfBillService.createLadingOfBill(ladingOfBillDto)).build();
    }


    @Timed
    @Operation(summary = "update lading of bill")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @Path("/update")
    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response update(LadingOfBillDto ladingOfBillDto) throws BusinessException {
        return Response.ok().entity(iLadingOfBillService.updateLadingOfBill(ladingOfBillDto)).build();
    }
}
