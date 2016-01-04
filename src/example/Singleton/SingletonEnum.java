package example.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//The enum way
@Path("SingletonEager")
public enum SingletonEnum {

        INSTANCE;
        @Path("t")
        @GET
        public String execute (String arg) {
            return "ttt";
        }

}
