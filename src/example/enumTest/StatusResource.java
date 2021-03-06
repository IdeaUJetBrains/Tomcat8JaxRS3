package example.enumTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


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
