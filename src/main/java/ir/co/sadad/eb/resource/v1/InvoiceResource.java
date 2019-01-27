package ir.co.sadad.eb.resource.v1;

import ir.co.sadad.eb.service.InvoiceService;
import ir.co.sadad.eb.service.dto.InvoiceDTO;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/invoice")
public class InvoiceResource {

    @Inject
    private InvoiceService invoiceService;

    @Timed
    @Operation(summary = "create invoice")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @Path("/create")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response createInvoice(@Valid InvoiceDTO invoiceDTO) {
        return Response.ok(invoiceService.createInvoice(invoiceDTO)).build();
    }
    @Timed
    @Operation(summary = "get invoice by its code")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @Path("/getInvoiceByCode")
    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    public Response getInvoice(@Valid String invoiceCode) {
        return null;
    }

}
