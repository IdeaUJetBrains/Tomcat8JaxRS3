package example;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.status;

@Path("/hello/{t}")
public class StaticFinalFieldsExample {

    //-----For these fields Warnings should be displayed-------//
    @QueryParam("staticfinal")
    public static final String finalStaticField = "staticfinalValue";

    @PathParam("t")
    public static String staticField = "staticValue";

    @MatrixParam("final")
    public final String finalField = "finalValue";

    @CookieParam("final1")
    public final String finalField1 = "finalValue1";

    @HeaderParam("final2")
    public final String finalField2 = "finalValue2";

    @Context
    public final String finalField3 = "finalValue3";

    @FormParam("final4")
    public final String finalField4 = "finalValue4";


    /*
    //----- Ok fields - Without Warnings:-----------//
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
