package example;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


public class Child extends TestMethods{
    @GET
    @Produces(MediaType.TEXT_XML)
    public String foo5() {    return "bla5"; }

}
