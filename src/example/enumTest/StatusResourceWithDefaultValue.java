package example.enumTest;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

//todo  an inspecton for enum values in @DefaultValue should be added
@Path("StatusResourceWithDefaultValue")
public class StatusResourceWithDefaultValue {


    @GET
    @Path("/zoo1") //  StatusResource/zoo1?animal=BIG_BIRD
    public Response zoo1(@QueryParam("animal") @DefaultValue("MEDIUM_DOG") Status status ){
        return Response.status(200).entity(" " + status).build();
    }

    public enum Status {
        BIG_BIRD,
        SMALL_CAT,
        MEDIUM_DOG;

    }
}
