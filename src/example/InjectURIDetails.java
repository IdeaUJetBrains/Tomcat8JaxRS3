package example;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

@Path("test") //localhost:8080/<root-context>/test/httpheaders
public class InjectURIDetails{
    public InjectURIDetails(@Context UriInfo uriDetails) {
        System.out.println("Constructor uriDetails");
    }
    public InjectURIDetails(@Context HttpHeaders headers) {
        System.out.println("Constructor HttpHeaders");
    }
    public InjectURIDetails(@QueryParam("t") String str) {
    }

    @GET
    @Path("httpheaders")
    public String test(@Context HttpHeaders headers){
        return headers.getRequestHeaders().toString();
    }

    @GET
    @Path("uriinfo")
    public void test(@Context UriInfo uriDetails){
        System.out.println("ALL query parameters -- "+ uriDetails.getQueryParameters().toString());
        System.out.println("'id' query parameter -- "+ uriDetails.getQueryParameters().get("id"));
        System.out.println("Complete URI -- "+ uriDetails.getRequestUri());
    }

    @GET
    @Path("securitycontext")
    public void test(@Context SecurityContext secContext){
        System.out.println("Caller -- "+ secContext.getUserPrincipal().getName());
        System.out.println("Authentication Scheme -- "+ secContext.getAuthenticationScheme());
        System.out.println("Over HTTPS ? -- "+ secContext.isSecure());
        System.out.println("Belongs to 'admin' role? -- "+ secContext.isUserInRole("admin"));
    }

    @GET
     @Produces( {"text/plain"})
     public String listQueryParamNames(@Context UriInfo info) {
         StringBuilder buf = new StringBuilder();
         for (String param: info.getQueryParameters().keySet()) {
             buf.append(param);
             buf.append("\n");
             }
         return buf.toString();
         }




}