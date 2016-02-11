package example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Olga Pavlova on 2/4/2016.
 */
@Path("TestLinks")
public class TestLinks {
    private final String[] response = { "one", "two", "three" };

    @GET
    public String getList() {
        System.out.println("end");
        return response[0];
    }

    @Path("links")
    @GET
    public Response get() throws URISyntaxException {
         Response rs = Response.ok().link("http://google.com", "google").
                link(new URI("http://maps.google.com"), "googlemaps").
                links(  Link.fromUri("test1").rel("test1").build(),
                        Link.fromUri("test2").rel("test2").build() ).build();
        System.out.print(rs);
        System.out.print(rs.getLinks().toString());
        System.out.print(rs.getEntity().toString());
        return rs;
    }
}
