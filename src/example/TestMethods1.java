package example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Olga Pavlova on 12/18/2015.
 */
@Path("TestMethods")
@Produces(MediaType.TEXT_XML)
public class TestMethods1 {
    @GET
    @Produces(MediaType.TEXT_XML)
    public String foo11() {    return "bla11"; }

}
