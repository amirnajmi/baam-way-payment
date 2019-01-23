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

@Dependent
@RegisterRestClient
@RegisterProvider(HotelException.class)
@Path("/test")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface TestRestClient {

    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    String hello();

}
