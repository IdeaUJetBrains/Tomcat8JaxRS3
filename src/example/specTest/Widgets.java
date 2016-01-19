package example.specTest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("Widgets")
public class Widgets {
    @GET
    public String Hz(){return "<t1>Hzs</t1><t2>Hzs</t2>";}
}
