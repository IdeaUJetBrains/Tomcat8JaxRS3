package example;

import javax.ws.rs.*;

/**
 * Created by Olga Pavlova on 12/15/2015.
 */
@Path("/form")
public class TestForm {

    @POST
    @Path("/test")
    public String getClichedMessage( @FormParam("name") String name ){
        return "Hello, " + name;
    }


    @GET
    @Produces("text/html")
    @Path("test1") //  form/test1
    public String form(){
        return "<html>\n" +
                "<body>\n" +
                "\t<h1>JAX-RS @FormQuery Testing</h1>\n" +
                "\n" +
                "\t<form action=\"/super/sub/test\" method=\"post\">\n" +
                "\t\t<p>\n" +
                "\t\t\tName : <input type=\"text\" name=\"name\" />\n" +
                "\t\t</p>\n" +
                "\t</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }

    @GET
    @Path("test2") //  form/test1
    public String form1() {
        return "<form action=\"/form\" method=\"post\">" +
                "Name : <input type=\"text\" name=\"name\" /></form>";
    }

}


