package example.constructors;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;


/**
 * ERROR
 * Among public constructorMore:
 * there is annotated constructorMore, but there is no any constructor with ALL annotated params )
 */
@Path("NotAllParamsAnnotated")
public class NotAllParamsAnnotated {
    public NotAllParamsAnnotated() {System.out.print("default"); }

    public NotAllParamsAnnotated(@QueryParam("i") int i, @QueryParam("i1") int i1, boolean d) { System.out.print(i);}

    private NotAllParamsAnnotated(int i, boolean t1) { }


    @GET
    @Path("foo")
    public String foo(){ return "bla" ; }
    //static public String foo(){ return "bla" ; }

}
