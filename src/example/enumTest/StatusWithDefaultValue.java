package example.enumTest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

//todo  an inspecton for enum values in @DefaultValue should be added
@Path("StatusWithDefaultValue/{id}")
public class StatusWithDefaultValue {

    @GET
    @Path("/foo") //  StatusWithDefaultValue/foo?animal=BIG_BIRD
    public Response foo(@QueryParam("animal") @DefaultValue( "MEDIUM_DOG") Status status, @PathParam("id") String str){
        return Response.status(200).entity(" " + status).build();
    }

    public enum Status {
        BIG_BIRD,
        SMALL_CAT,
        MEDIUM_DOG;

    }
}
