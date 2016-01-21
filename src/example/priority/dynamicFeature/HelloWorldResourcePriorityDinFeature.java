package example.priority.dynamicFeature;

import example.BindingAnnotation.Compress;

import javax.annotation.Priority;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("HelloWorldResourcePriorityDinFeature")
public class HelloWorldResourcePriorityDinFeature {

    @GET
    @Produces("text/plain")
    public String getHello() {
        return "Hello World!";
    }

    @GET
    @Path("too-much-data")  //HelloWorldResourcePriorityDinFeature/too-much-data
    @Compress
    public String getVeryLongString() {
        String str = "Hello World!Hello World!Hello World!"; // very long string
        return str;
    }
}
