package example.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//Static block initialization
@Path("SingletonStaticBlock")
public class SingletonStaticBlock {
    private static final SingletonStaticBlock instance;

    static {
        try {
            instance = new SingletonStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Darn, an error occurred!", e);
        }
    }

    @Path("t")
    @GET
    public static SingletonStaticBlock getInstance() {
        return instance;
    }

    private SingletonStaticBlock() {
        // ...
    }

}
