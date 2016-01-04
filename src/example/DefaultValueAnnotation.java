package example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/DefaultValueAnnotation/{t}")
public class DefaultValueAnnotation {

    @DefaultValue("DefaultValue1")
    @PathParam("t")
    public String str1;

    @DefaultValue("DefaultValue2")
    @QueryParam("ttt")
    public String str2;

    @DefaultValue("DefaultValue3")
    @MatrixParam("ttt")
    public String str3;


    @DefaultValue("DefaultValue4")
    @CookieParam("ttt")
    public String str4;

    @DefaultValue("DefaultValue5")
    @HeaderParam("ttt")
    public String str5;



    @DefaultValue("DefaultValue6") //TODO Here for @DefaultValue "is never used" warning should be displayed
    public String str6;

    @GET
    @Path("/query") // DefaultValueAnnotation/t/query
    @Produces(MediaType.TEXT_PLAIN)
    public Response getEmployees( @DefaultValue("DefaultValue7") String str7) { //TODO Here for @DefaultValue "is never used" warning should be displayed
        return Response.status(200).entity(
                "Values: \n str1: " + str1
                        + "\n str2: " + str2
                        + "\n str3: " + str3
                        + "\n str4: " + str4
                        + "\n str5: " + str5
                        + "\n str6: " + str6
                        + "\n str7: " + str7 ).build();
    }


}
