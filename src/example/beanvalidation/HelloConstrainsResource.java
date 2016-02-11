package example.beanvalidation;


import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;


@Path("HelloConstrainsResource")
public class HelloConstrainsResource {


    @NotNull  //  HelloConstrainsResource/foo;str=constr
    public HelloConstrainsResource(@NotNull @MatrixParam("str") String str) {
        System.out.println("Constructor @MatrixParam(\"str\"): " + str);

    }

    @GET
    @Path("foo")  //  HelloConstrainsResource/foo?str1=foo
    @Produces("text/plain")
    public String foo(@NotNull @QueryParam("str1") String str1) {
        System.out.println("@QueryParam(\"str1\"): " + str1);
        return "foo";
    }

    @GET
    @Produces("text/plain") // HelloConstrainsResource?str=constr&str1=foo
    public String listQueryParamNames(@NotNull @Context UriInfo uriInfo) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String param : uriInfo.getQueryParameters().keySet()) {
            stringBuilder.append(" querParameter: ");
            stringBuilder.append(param);
            stringBuilder.append(",\n");

        }
        return stringBuilder.toString();
    }



}
