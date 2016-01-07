package example.enumTest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

//todo  an inspecton for enum values in @DefaultValue should be added
@Path("StatusWithDefaultValue")
public class StatusWithDefaultValue {

    @GET
    @Path("/foo") //  StatusWithDefaultValue/foo?animal=BIG_BIRD
    public Response foo(@QueryParam("animal") @DefaultValue("DOG") Status status ){
        return Response.status(200).entity(" " + status).build();
    }

    public enum Status {
        BIG_BIRD,
        SMALL_CAT,
        MEDIUM_DOG;

    }
}
