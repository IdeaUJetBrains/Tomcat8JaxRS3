package example.enumTest;

import example.Child;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("StatusResource")
public class StatusResource {

    @GET
    @Path("/foo")   //  StatusResource/foo?animal=BIG_BIRD
    public String foo( @QueryParam("animal")  StatusEnum status ) { return "bla"; }


    public enum StatusEnum {
        BIG_BIRD,
        SMALL_CAT,
        MEDIUM_DOG;
    }
}
