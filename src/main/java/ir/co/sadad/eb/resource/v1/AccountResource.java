package ir.co.sadad.eb.resource.v1;

import ir.co.sadad.eb.service.AccountService;
import ir.co.sadad.eb.service.dto.AccountDto;
import ir.co.sadad.eb.service.dto.InvoiceDTO;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameters;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.joda.time.LocalDate;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/account")
public class AccountResource {

    @Inject
    AccountService accountService;

    @Timed
    @Operation(summary = "create account")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "201", description = "Created")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @APIResponse(responseCode = "500", description = "InternalError")
    @APIResponse(responseCode = "")
    @Parameters()
    @Path("/create")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response createAccount(AccountDto accountDto) {
        return Response.ok(accountService.createAccount(accountDto)).build();
    }
}