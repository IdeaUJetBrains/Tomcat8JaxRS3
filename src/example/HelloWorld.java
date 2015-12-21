package example;


import javax.ws.rs.*;
import javax.ws.rs.core.Context;

// The Java class will be hosted at the URI path "/helloworld"


@Path("/helloworld/{t}")
public class HelloWorld {



    public HelloWorld(@Context String t1,
                      @HeaderParam("user-agent") String t2,
                      @CookieParam("sessionid") String t3,
                      @MatrixParam("name") String t4,
                      @QueryParam("t") @DefaultValue("3QueryParam") String t5,
                      @PathParam("t") String t6
            /*,
                      @FormParam("name") @DefaultValue("name1") String name,
                      @FormParam("age") @DefaultValue("age1") String age*/
    ) {
        System.out.println( t1);
        System.out.println( t2);
        System.out.println( t3);
        System.out.println( t4);
        System.out.println( t5);
        System.out.println( t6);
        /*System.out.println( name);
        System.out.println( age);*/
    }

   /* @FormParam("name")
    public String namefield;*/


    // The Java method will process HTTP GET requests
    @POST
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    public String getClichedMessage(
            @FormParam("name") String name,
            @FormParam("age") String age
    ) {
        return "POST: Hello World, " // + name + ", " + age
                ;
    }


    @GET
    @Produces("text/plain")
    public String getClichedMessage1(
            @QueryParam("name") String name,
            @QueryParam("age") String age
    ) {
        return "GET: Hello World, "  + name + ", " + age   ;
    }



    @GET
    @Path("test1") ///helloworld/t1/test1
    public String form(){
        return "<html>\n" +
                "<body>\n" +
                "\t<h1>JAX-RS @FormQuery Testing</h1>\n" +
                "\n" +
                "\t<form action=\"/helloworld/t\" method=\"post\">\n" +
                "\t\t<p>\n" +
                "\t\t\tName : <input type=\"NUM\" name=\"name\" />\n" +
                "\t\t</p>\n" +
                "\t\t<p>\n" +
                "\t\t\tAge : <input type=\"text\" name=\"age\" />\n" +
                "\t\t</p>\n" +
                "\t\t<input type=\"submit\" value=\"Add User\" />\n" +
                "\t</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }

    /*@Path("/delete/{id}")
    @DELETE
    public void delete(@PathParam("id") long id) {

    }
*/
}
