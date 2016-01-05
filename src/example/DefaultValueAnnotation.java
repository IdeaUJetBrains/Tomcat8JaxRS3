package example;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/DefaultValueAnnotation/{t}")
public class DefaultValueAnnotation {

    @DefaultValue("DefaultValue6") //TODO Here for @DefaultValue "is never used" warning should be displayed
    public String str6;


    //Ok
    @DefaultValue("DefaultValue1")
    @PathParam("t")
    public String str1;

    //Ok
    @DefaultValue("DefaultValue2")
    @QueryParam("ttt")
    public String str2;

    //Ok
    @DefaultValue("DefaultValue3")
    @MatrixParam("ttt")
    public String str3;

    //Ok
    @DefaultValue("DefaultValue4")
    @CookieParam("ttt")
    public String str4;

    //Ok
    @DefaultValue("DefaultValue5")
    @HeaderParam("ttt")
    public String str5;



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
                        + "\n str7: " + str7
                        + "\n str8: " + str8
                        + "\n str9: " + str9 ).build();
    }


    @Context
    @DefaultValue("DefaultValue8") //TODO Here for @DefaultValue "is never used" warning should be displayed
    public String str8 = "DefaultValue8";

    @BeanParam
    @DefaultValue("DefaultValue9") //TODO Here for @DefaultValue "is never used" warning should be displayed
    public String str9 = "DefaultValue9";

}
