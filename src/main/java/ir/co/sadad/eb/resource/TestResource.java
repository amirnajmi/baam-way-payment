package ir.co.sadad.eb.resource;

import ir.co.sadad.eb.domain.Status;
import ir.co.sadad.eb.restclient.restclientapi.HotelRestClient;
import ir.co.sadad.eb.restclient.restclientapi.TestRestClient;
import ir.co.sadad.eb.service.StatusService;
import ir.co.sadad.eb.util.qualifier.TransactionDebugger;
import org.eclipse.microprofile.opentracing.Traced;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Optional;

@Path("/test")
@Traced

@Stateless
//@Transactional
public class TestResource {

    @Inject
    private Logger log;
    @Inject
    @RestClient
    private HotelRestClient hotelRestClient;
    @Inject
    private TestRestClient testRestClient;


    @Inject
    private StatusService statusService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testMethod() {
        log.info("ADFJAKJFKALSFJASKLDJFKLASDFASDLFJASLDFJASJDFJASDKL:FJL:ASDJFKL:ASJFKL:SDJAKL:FJASDKL:FJASKL:DFJKL:");
        return "Hello ";
    }

    @Traced
    @GET
    @Path("getStatusByCode/{statusCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStatus(@PathParam("statusCode") Short statusCode) {
        Status statusByTitle = statusService.getStatusByCode(statusCode);
        log.info("*********************************");
        return Response.ok().entity(statusByTitle).build();
    }

    @Traced
    @GET
    @Path("getStatus1/{title}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStatus1(@PathParam("title") String title) {
        Optional<Status> statusByTitle1 = statusService.getStatusByTitle1(title);
        log.info("*********************************");
        return Response.ok().entity(statusByTitle1).build();
    }

    @GET
    @Path("testRestClient")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHotels() {
        System.out.println("medhod");
        return Response.ok(testRestClient.hello()).build();
    }
    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        System.out.println("medhod");
        return "Hello";
    }

    @GET
    @Path("findAll")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        return Response.ok(statusService.findAll()).build();
    }

    @POST
    @Path("create")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Status status){
        return Response.ok(statusService.createStatus(status)).build();
    }

    @DELETE
    @Path("deleteStatus")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteStatus(Status status){
        statusService.deleteStatus(status);
    }

}
