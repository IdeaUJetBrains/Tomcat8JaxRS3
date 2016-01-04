package example.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//Initialization-on-demand holder idiom
@Path("SingletonOnDemand")
public class SingletonOnDemand {
    // Private constructor. Prevents instantiation from other classes.
    private SingletonOnDemand() { }

    /**
     * Initializes singleton.
     *
     * {@link SingletonHolder} is loaded on the first execution of {@link SingletonOnDemand#getInstance()} or the first access to
     * {@link SingletonHolder#INSTANCE}, not before.
     */
    private static class SingletonHolder {
        private static final SingletonOnDemand INSTANCE = new SingletonOnDemand();
    }

    @Path("t")
    @GET
    public static SingletonOnDemand getInstance() {
        return SingletonHolder.INSTANCE;
    }
}