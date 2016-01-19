package example;




import example.BindingAnnotation.GZIPWriterInterceptor;
import example.BindingAnnotation.HelloWorldResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Olga Pavlova on 22/09/2015.
 */

//@ApplicationPath("/")
public class ConfigRestWrongAdd extends Application {

    @Override
    public Set<Object> getSingletons() {
        HashSet h = new HashSet<Object>();
        h.add( HelloWorldResource.class );
        //h.add( GZIPWriterInterceptor.class);
        return h;
    }

    /*@Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( new HelloWorldResource() );
        //h.add( new GZIPWriterInterceptor() );
        return h;
    }*/

}
