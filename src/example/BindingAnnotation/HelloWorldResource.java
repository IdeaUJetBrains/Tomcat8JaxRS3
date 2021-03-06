package example.BindingAnnotation;

import javax.annotation.Priority;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("HelloWorldResource")
public class HelloWorldResource {

    @GET
    @Produces("text/plain")
    public String getHello() {
        return "Hello World!";
    }

    @GET
    @Path("too-much-data")  //HelloWorldResource/too-much-data
    @Compress
    public String getVeryLongString() {
        String str = "Hello World!Hello World!Hello World!"; // very long string
        return str;
    }
}
