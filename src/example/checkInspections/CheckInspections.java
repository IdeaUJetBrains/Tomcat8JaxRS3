package example.checkInspections;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Olga Pavlova on 2/8/2016.
 */
//@Path("CheckInspections")
public class CheckInspections {

    @GET
    public String get(){
        return "Hello";
    }
}
