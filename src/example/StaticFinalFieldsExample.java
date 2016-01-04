package example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.status;

@Path("/hello/{t}")
public class StaticFinalFieldsExample {

    @QueryParam("staticfinal")
    public static final String finalStaticField = "staticfinalValue";

    @QueryParam("static")
    public static String staticField = "staticValue";

    @QueryParam("final")
    public final String finalField = "finalValue";

    /*
    @PathParam("t")
    public String ttt = "ttt"; //  hello/t/query

    @QueryParam("ttt")
    public String ttt = "ttt"; //  hellow/t/query?ttt=2300*/

    @GET
    @Path("/query") // /hello/t/query
    public Response getEmployees() {
        return Response.status(200).entity( "test" ).build();
    }
}
