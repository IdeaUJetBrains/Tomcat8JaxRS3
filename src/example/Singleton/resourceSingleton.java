package example.Singleton;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Singleton
@Path("ResourceSingleton")
public class ResourceSingleton {


    @GET
    @Path("foo") //  ResourceSingleton/foo
    public String foo() {
        return "foo";
    }


}
