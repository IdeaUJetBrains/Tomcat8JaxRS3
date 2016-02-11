package example.checkInspections;

import javax.ws.rs.*;

/**
 * Created by Olga Pavlova on 2/8/2016.
 */
@Path("DefaultValueInspection")
public class DefaultValueInspection {


    @GET
    public String get(){
        return "Hello";
    }
}
