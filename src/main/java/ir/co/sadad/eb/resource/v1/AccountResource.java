package ir.co.sadad.eb.resource.v1;

import ir.co.sadad.eb.exception.BaseRestClientException;
import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.service.AccountService;
import ir.co.sadad.eb.service.dto.AccountDto;
import ir.co.sadad.eb.service.impl.MoneyTransferService;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameters;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;


import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/account")
public class AccountResource {

    @Inject
    AccountService accountService;

    @Inject
    MoneyTransferService moneyTransferService;

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
    public Response createAccount(@RequestBody(description = "حساب"
            ,content = @Content(mediaType = "application/json"
            ,schema = @Schema(implementation = AccountDto.class))) AccountDto accountDto) {
        return Response.ok(accountService.createAccount(accountDto)).build();
    }

    @Timed
    @Operation(summary = "test money transfer")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "201", description = "Created")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @APIResponse(responseCode = "500", description = "InternalError")
    @APIResponse(responseCode = "")
    @Parameters()
    @Path("/test")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response testMoneyTransfer() throws BusinessException, BaseRestClientException, IOException {
        return Response.ok(moneyTransferService.createMoneyTransfer("0223189148006","0348218349005", 10000d, "شهربانو غلامی")).build();
    }


    @Timed
    @Operation(summary = "test money transfer")
    @APIResponse(responseCode = "200", description = "OK")
    @APIResponse(responseCode = "201", description = "Created")
    @APIResponse(responseCode = "401", description = "Unauthorized")
    @APIResponse(responseCode = "500", description = "InternalError")
    @APIResponse(responseCode = "")
    @Parameters()
    @Path("/test/inquiry/{id}")
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response testInquiryMoneyTransfer(@PathParam("id") String id) throws BusinessException {
        return Response.ok(moneyTransferService.inquiryMoneyTransfer(id)).build();
    }
}
