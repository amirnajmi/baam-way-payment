package ir.co.sadad.eb.restclient.restclientapi;

import ir.co.sadad.eb.exception.BaseRestClientException;
import ir.co.sadad.eb.exception.exceptionmappers.RestClientResponseExceptionMapper;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransfer.MoneyTransferRequestDto;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransfer.MoneyTransferResponseDto;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransferbatch.BatchPerTransferResponseDto;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransferbatch.BatchTransferRequestDto;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransferbatch.BatchTransferResponseDto;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Dependent
@RegisterRestClient
@RegisterProvider(RestClientResponseExceptionMapper.class)
@Path("/api/transfer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface MoneyTransferRestClient {

    //Batch-------------------------------------------------------------------------------------------------------------------------------
    @POST
    @Path("/batch/create")
    BatchTransferResponseDto createBatchTransfer(@HeaderParam("Authorization") String authorizationToken,
                                                 @QueryParam("submit") Boolean submit,
                                                 BatchTransferRequestDto batchTransferRequestDto);

    @GET
    @Path("/{uuid}/inquiry")
    BatchTransferResponseDto inquiryBatchTransfer(@HeaderParam("Authorization") String authorizationToken,
                                                  @PathParam("uuid") String uuid);

    @GET
    @Path("/{uuid}/transactions")
    BatchPerTransferResponseDto inquiryBatchPerTransfer(@HeaderParam("Authorization") String authorizationToken,
                                                        @PathParam("uuid") String uuid);
    //Batch-------------------------------------------------------------------------------------------------------------------------------

    //Single-------------------------------------------------------------------------------------------------------------------------------
    @POST
    @Path("/single/create")
    MoneyTransferResponseDto createMoneyTransfer(@HeaderParam("Authorization") String authorizationToken,
                                                 @QueryParam("submit") Boolean submit,
                                                 @QueryParam("ignoreHints") Boolean ignoreHints,
                                                 @QueryParam("channel") String channel,
                                                 MoneyTransferRequestDto moneyTransferRequestDto) throws BaseRestClientException;

    @GET
    @Path("/{id}")
    MoneyTransferResponseDto inquiryMoneyTransfer(@HeaderParam("Authorization") String authorizationToken,
                                                  @PathParam("id") String id) throws BaseRestClientException;
    //Single-------------------------------------------------------------------------------------------------------------------------------
}
