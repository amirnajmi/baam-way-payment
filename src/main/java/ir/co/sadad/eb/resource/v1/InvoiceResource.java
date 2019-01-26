package ir.co.sadad.eb.resource.v1;

import ir.co.sadad.eb.service.InvoiceService;
import ir.co.sadad.eb.service.dto.InvoiceDTO;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("bill")
public class InvoiceResource {

    @Inject
    private InvoiceService invoiceService;

    @Timed
    @Operation(summary = "authenticate the credential")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @Path("/authenticate")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response createBill(@Valid InvoiceDTO invoiceDTO) {
        return null;
    }
    @Timed
    @Operation(summary = "authenticate the credential")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @Path("/authenticate")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response getBill(@Valid InvoiceDTO invoiceDTO) {
        return null;
    }

}
