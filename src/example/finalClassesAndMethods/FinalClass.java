package example.finalClassesAndMethods;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Olga Pavlova on 1/7/2016.
 */
@Path("FinalClass")
public final class FinalClass {

    @Path("StaticFinalTest")
    public static final class StaticTest {
        public StaticTest() {
            System.out.println("created!");
        }

        @GET
        @Path("/foo1")   //  StaticFinalTest/foo1
        public String foo1( String str ) { return "bla1"; }
    }

    @GET
    @Path("/foo")   //  FinalClass/foo
    public String foo( String str ) { return "bla"; }

}
