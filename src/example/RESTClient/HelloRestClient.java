package example.RESTClient;

import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.*;
import java.io.IOException;
import java.net.URI;

@Path("/HelloRestClient")
public class HelloRestClient {
    @GET
    @Produces("application/json; qs=1.0")
    @Path("GET")
    public String get() {         return "Hello World";    }

    @POST
    @Produces("application/json; qs=1.0")
    @Path("POST")
    public String post() {        return "Hello World";    }

    @PUT
    @Produces("application/json; qs=1.0")
    @Path("PUT")
    public String put() {        return "Hello World";    }

    @DELETE
    @Produces("application/json; qs=1.0")
    @Path("DELETE")
    public String delete() {        return "Hello World";    }

    @HEAD
    @Produces("application/json; qs=1.0")
    @Path("HEAD")
    public String head() {        return "Hello World";    }

    @OPTIONS
    @Produces("application/json; qs=1.0")
    @Path("OPTIONS")
    public String options() {        return "Hello World";    }

     /*@PATCH
    @Produces("application/json; qs=1.0")
    @Path("DELETE")
    public String patch() {
        return "Hello World";
    }*/
}
