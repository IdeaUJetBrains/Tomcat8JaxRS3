package example.specTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("Widget")
public class Widget {
    @GET
    public String Hz(){return "Hz";}
}
