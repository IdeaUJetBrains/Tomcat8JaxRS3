package example;



import example.Singleton.*;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Olga Pavlova on 22/09/2015.
 */
@ApplicationPath("/")
public class ConfigRest extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add(HelloWorld.class);
       /*
        h.add(TestForm.class);
        h.add(SuperClass.class);
        h.add(TestMethods.class);
        h.add(TestMethods1.class);
        h.add(Child.class);
        h.add(InjectURIDetails.class);
        h.add(SingletonOnDemand.class);
        h.add(SingletonEnum.class);
        h.add(SingletonStaticBlock.class);
        h.add(SingletonLazy.class);
        */

        h.add(SingletonEager.class);
        h.add(StaticFinalFieldsExample.class);
        h.add(DefaultValueAnnotation.class);


        return h;
    }

}
