package example.checkInspections;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by Olga Pavlova on 2/8/2016.
 */
@Path("InspectionWrongProduces")
public class InspectionWrongProduces {
    @GET
    @Produces("tedsfxt/plasdfdsfin")
    public String foo() {    return "bla"; }

    @Path("{id1}/ee")
    @GET
    @Produces("text/plain; charset=UTF-8")
    public String foo1(@PathParam("id1") String id, @PathParam("id1") String id1) {
        return "bla"; }
}
