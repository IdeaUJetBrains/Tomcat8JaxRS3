package example.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//Lazy initialization
@Path("SingletonLazy")
public class SingletonLazy {
    private static volatile SingletonLazy instance;
    private SingletonLazy() { }

    @Path("t")
    @GET
    public static SingletonLazy getInstance() {
        if (instance == null ) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }

        return instance;
    }

    /*private static volatile SingletonLazy instance = null;
    private SingletonLazy() { }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }

        return instance;
    }*/
}