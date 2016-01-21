package example.toApplicatonClass;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("ddd")
public interface IHello {
    @GET
    @Produces("text/plain")
    @Path("foo1")
    public String getHello();
}
