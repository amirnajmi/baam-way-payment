package ir.co.sadad.eb.restclient.restclientapi;

import ir.co.sadad.eb.exception.exceptionmappers.RestClientResponseExceptionMapper;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransferbatch.BatchPerTransferResponseDto;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransferbatch.BatchTransferRequestDto;
import ir.co.sadad.eb.restclient.restclientmodel.moneytransferbatch.BatchTransferResponseDto;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Dependent
@RegisterRestClient
//@RegisterProvider(RestClientResponseExceptionMapper.class)
@Path("/api/transfer")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface BatchTransferRestClient {
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
}
