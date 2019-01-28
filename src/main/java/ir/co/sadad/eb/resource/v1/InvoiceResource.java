package ir.co.sadad.eb.resource.v1;

import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.service.InvoiceService;
import ir.co.sadad.eb.service.dto.InvoiceDTO;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.joda.time.LocalDate;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
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
    @Produces({MediaType.APPLICATION_JSON})
    public Response createInvoice(InvoiceDTO invoiceDTO) {
        return Response.ok(invoiceService.createInvoice(invoiceDTO)).build();
    }
    @Timed
    @Operation(summary = "get invoice by its code")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @Path("/getInvoiceByCode")
    @GET
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response getInvoice(@Valid @QueryParam("invoiceCode") String invoiceCode) {
        return Response.ok(LocalDate.now()).build();
    }

}
