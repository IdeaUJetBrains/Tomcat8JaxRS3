package example.staticClassesAndMethods;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;


/**
 * ERROR
 * There is no public constructorMore in the resource class
 */
@Path("StaticMethod")
public class StaticMethod {
       /* static int iSt;
        public StaticMethod() { System.out.println("created!"); }*/

        int i;

        public StaticMethod(@QueryParam("i") int i) {
                this.i = i;
        }

        @GET
        @Path("foo") //  StaticMethod/foo
        public static String method1() {
                return "An example string that doesn't depend on i (an instance variable):";
        }

        @GET
        @Path("foo1") //  StaticMethod/foo
        public int method2() {
                return this.i+1; // Depends on i
        }




}
