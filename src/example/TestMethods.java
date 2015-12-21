package example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("TestMethods")
@Produces(MediaType.APPLICATION_JSON)
public class TestMethods {

    @GET
    @Produces("text/plain")
    public String foo() {    return "bla"; }

    @POST
    @Produces("text/plain")
    public String foo1(){    return "bla1"; }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String foo3(){    return "bla3"; }

    @POST
    @Produces({"application/jsonn"})
    public String foo2(){    return "bla2"; }



    @GET
    @Produces("text/html")
    @Path("test1") //  form/test1
    public String form(){
        return "<html>\n" +
                "<body>\n" +
                "\t<h1>JAX-RS @FormQuery Testing</h1>\n" +
                "\n" +
                "\t<form action=\"/TestMethods\" method=\"post\">\n" +
                "\t\t<p>\n" +
                "\t\t\tName : <input type=\"text\" name=\"name\" />\n" +
                "\t\t</p>\n" +
                "\t</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }
}
