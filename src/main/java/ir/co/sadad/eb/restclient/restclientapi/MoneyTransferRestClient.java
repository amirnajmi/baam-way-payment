package ir.co.sadad.eb.restclient.restclientapi;

import ir.co.sadad.eb.exception.BaseRestClientException;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransfer.MoneyTransferRequestDto;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransfer.MoneyTransferResponseDto;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Dependent
@RegisterRestClient
@RegisterProvider(BaseRestClientException.class)
@Path("/api/transfer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface MoneyTransferRestClient {

    @POST
    @Path("/single/create")
    MoneyTransferResponseDto createMoneyTransfer(@HeaderParam("Authorization") String authorizationToken,
                                                 @QueryParam("submit") Boolean submit,
                                                 @QueryParam("ignoreHints") Boolean ignoreHints,
                                                 @QueryParam("channel") String channel,
                                                 MoneyTransferRequestDto moneyTransferRequestDto);

    @GET
    @Path("/{id}")
    MoneyTransferResponseDto inquiryMoneyTransfer(@HeaderParam("Authorization") String authorizationToken,
                                  @PathParam("id") String id);
}
