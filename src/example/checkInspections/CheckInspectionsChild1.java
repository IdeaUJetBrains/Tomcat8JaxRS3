package example.checkInspections;

import javax.ws.rs.Path;

/**
 * Created by Olga Pavlova on 2/8/2016.
 */
@Path("CheckInspectionsChild1")
public class CheckInspectionsChild1 {


    public CheckInspections1 foo(){
        return new CheckInspections1();
    }

}
