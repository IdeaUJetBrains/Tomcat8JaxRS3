package example.constructors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


/**
 * ERROR
 * There is no public constructorMore in the resource class
 */
@Path("WithoutPublicConstructor")
public class WithoutPublicConstructor{

        private WithoutPublicConstructor(int i, boolean t1) {}

        @GET
        @Path("foo")
        public String foo(){ return "bla" ; }
        //static public String foo(){ return "bla" ; }

}
