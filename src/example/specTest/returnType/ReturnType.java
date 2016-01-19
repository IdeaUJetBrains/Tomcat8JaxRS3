package example.specTest.returnType;

import javax.persistence.PersistenceUnits;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

import static javax.ws.rs.core.Response.ok;

@Path("ReturnType")
public class ReturnType {

    @GET
    @Path("foo first") //ReturnType/foo first
    public String foo(){

        return "bla";
    }

    @GET
    @Path("foo%20first/1")
    public String foo1(){

        return "bla1";
    }

    @GET  //  {path:.+} = any number of segments
    @Path("foo%20first/2/{path:.+}") // ReturnType/foo first/2/ttt/rr
    public String foo2(){

        return "bla2";
    }

    @GET  //  {path:.+} = any number of segments
    @Path("foo/3") // ReturnType/foo/3
    public Response foo3(){
        return ok().build();
    }

    @GET
    @Path("foo/4") // ReturnType/foo/4
    public String foo4(){
        List<String> list = new ArrayList<String>();
        for(int i=1; i<11; i++) list.add( "bla" + i );
        GenericEntity<List<String>> entity = new GenericEntity<List<String>>(list) {};

        Response rs = Response.ok(entity).build();

        System.out.println(rs.getEntity().toString() );
        return Response.ok(entity).build().toString();
    }


}
