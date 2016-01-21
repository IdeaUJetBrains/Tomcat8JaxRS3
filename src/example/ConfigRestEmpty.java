package example;

import example.BindingAnnotation.HelloWorldResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


//@ApplicationPath("/")
public class ConfigRestEmpty extends Application {

    @Override
    public Set<Object> getSingletons() {
        HashSet h = new HashSet<Object>();
        return h;
    }

   /* @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        return h;
    }*/

    /* @Override
    public Map<String,Object> getProperties() {
        HashMap h = new HashMap<String,Object>();
        return h;
    }*/

}
