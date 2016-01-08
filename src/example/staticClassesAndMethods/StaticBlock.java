package example.staticClassesAndMethods;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

/**
 * Created by Olga Pavlova on 1/7/2016.
 */
@Path("dd")
public class StaticBlock {

    //@Context()
    static{
        System.out.println("static block of parent class");
    }
}
