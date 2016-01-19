package example.bugIDEA148599;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


public class Parent2 {

        @GET
        @Path("fooParent") //  Child2/fooParent
        public String foo1() { return "fooParent"; }
}
