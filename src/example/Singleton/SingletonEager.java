package example.Singleton;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

//Eager initialization
@Path("SingletonEager")
public class SingletonEager {


    private static final SingletonEager INSTANCE = new SingletonEager();


    /*@Inject
    public SingletonEager() {}*/

    private SingletonEager() {}

    /*@Path("t") // SingletonEager/t
    @GET*/
    public static SingletonEager getInstance() {
        return INSTANCE;
    }



    @Path("t1") // SingletonEager/t1
    @GET
    public String foo() {return "foo";}

}