package ir.co.sadad.eb.resource.v1;

import ir.co.sadad.eb.service.api.IInvoiceStatusHistoryService;
import ir.co.sadad.eb.service.dto.InvoiceStatusHistoryDto;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/InvoiceStatusHistory")
public class InvoiceStatusHistoryResource {
    @Inject
    private IInvoiceStatusHistoryService iInvoiceStatusHistoryService;

    @Timed
    @Operation(summary = "create  invoice status history")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @Path("/create")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response create(@RequestBody(description = "تاریخچه وضعیت صورتحساب"
            ,content = @Content(mediaType = "application/json"
            ,schema = @Schema(implementation = InvoiceStatusHistoryDto.class)))InvoiceStatusHistoryDto invoiceStatusHistoryDto) {
        return Response.ok().entity(iInvoiceStatusHistoryService.createInvoiceStatusHistory(invoiceStatusHistoryDto)).build();
    }


}
