package example.bugIDEA;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("Child2/")
public class Child2 extends Parent2 {

    @GET
    @Path("fooChild") //  Child2/fooChild
    public String foo2() {
        return "fooChild";
    }
}
