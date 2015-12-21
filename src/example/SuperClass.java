package example;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * Created by Olga Pavlova on 12/15/2015.
 */

@Path("/super")
public class SuperClass {


    @Path("sub")
    public TestForm test(){
        System.out.print("go go");
        return new TestForm();
    }
}
