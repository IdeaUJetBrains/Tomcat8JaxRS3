package example.constructors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


/**
 * ERROR
 * Among public constructorMore:
 * there is (no Default constructor) && (no any annotated constructor)
 * Note: if t (here is default constructor) && ( there is no annotated constructorMore) - all is Ok deployed
 */
@Path("NoDefaultNoAnnotated")
public class NoDefaultNoAnnotated{

        private NoDefaultNoAnnotated(int i, boolean t1) {}

        public NoDefaultNoAnnotated(int i) {System.out.print(i);}

        public NoDefaultNoAnnotated(int i, int i1) {System.out.print(i + " " + i1);}

        @GET
        @Path("foo")
        public String foo(){ return "bla" ; }
        //static public String foo(){ return "bla" ; }

}
