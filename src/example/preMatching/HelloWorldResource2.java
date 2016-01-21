package example.preMatching;

import example.BindingAnnotation.Compress;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.PreMatching;

@PreMatching
@Path("HelloWorldResource2")
public class HelloWorldResource2 {

    @GET
    @Produces("text/plain")
    public String getHello() {
        return "Hello World!";
    }

    @GET
    @Path("too-much-data")  //HelloWorldResource2/too-much-data
    @Compress
    public String getVeryLongString() {
        String str = "Hello World!Hello World!Hello World!"; // very long string
        return str;
    }
}
