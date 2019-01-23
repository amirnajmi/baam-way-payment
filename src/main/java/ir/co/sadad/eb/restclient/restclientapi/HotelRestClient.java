package ir.co.sadad.eb.restclient.restclientapi;

import ir.co.sadad.eb.exception.HotelException;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.Dependent;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Dependent
@RegisterRestClient
@RegisterProvider(HotelException.class)
@Path("/v1/hotels")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface HotelRestClient {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Response getHotels();

}
