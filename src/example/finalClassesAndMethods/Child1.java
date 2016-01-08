package example.finalClassesAndMethods;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("Child1/")
public class Child1 extends Parent1 {

    @GET
    @Path("fooNotFinalChild") //  Child1/fooNotFinalChild
    public String foo2() {
        return "fooNotFinalChild";
    }
}
