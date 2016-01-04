package example.Singleton;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

/**
 * Created by Olga Pavlova on 12/24/2015.
 */
@Singleton
public class StatusBean {
    private String status;

   /* @PostConstruct
    void init {
        status = "Ready";
    }
    //...*/
}
