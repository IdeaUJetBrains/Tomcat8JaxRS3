package example.toApplicatonClass;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("MyBeanResource")
public class MyBeanResource {

    @GET
    @Path("foo")  //  MyBeanResource/foo
    public MyBean foo(){
        return new MyBean();
    }
}
