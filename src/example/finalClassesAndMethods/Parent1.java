package example.finalClassesAndMethods;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


/**
 * ERROR
 * There is no public constructorMore in the resource class
 */
public class Parent1 {

        @GET
        @Path("fooFinalParent") //  Child1/fooFinalParent
        public final String foo1() { return "fooFinalParent"; }

        public String foo2() {
                return "fooNotFinalParent";
        }
}
