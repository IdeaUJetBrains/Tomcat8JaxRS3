package example.staticClassesAndMethods;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Olga Pavlova on 1/7/2016.
 */
@Path("WithStaticClass")
public  class WithStaticClass {

    @Path("StaticTest")
    public static class StaticTest {
        public StaticTest() {
            System.out.println("created!");
        }

        @GET
        @Path("/foo1")   //  StaticTest/foo1
        public String foo1( String str ) { return "bla1"; }
    }

    @GET
    @Path("/foo")   //  WithStaticClass/foo
    public String foo( String str ) { return "bla"; }

}
