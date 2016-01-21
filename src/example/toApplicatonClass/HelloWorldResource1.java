package example.toApplicatonClass;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//@Path("HelloWorldResource1")
public class HelloWorldResource1 {

    //@GET
    @Produces("text/plain")
    //@Path("foo1")
    public String getHello() {
        return "Hello World!";
    }
/*
    @GET
    @Path("too-much-data1")
    @Compress
    public String getVeryLongString() {
        String str = "Hello World!Hello World!Hello World!"; // very long string
        return str;
    }*/
}
