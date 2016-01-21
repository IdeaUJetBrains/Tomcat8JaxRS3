package example;

import example.BindingAnnotation.HelloWorldResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


//@ApplicationPath("/")
public class ConfigRestDuplicateItems extends Application {

    @Override
    public Set<Object> getSingletons() {
        HashSet h = new HashSet<Object>();
        h.add( new HelloWorldResource() );
        h.add( new HelloWorldResource() );

        return h;
    }

   /* @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( HelloWorldResource.class );
        h.add( HelloWorldResource.class );
        return h;
    }*/

}
