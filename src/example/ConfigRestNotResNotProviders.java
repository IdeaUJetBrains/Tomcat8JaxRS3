package example;

import example.toApplicatonClass.*;

import javax.annotation.Priority;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Priorities;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


//@ApplicationPath("/")
public class ConfigRestNotResNotProviders extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        // NotOK
        //h.add( HelloWorldResource1.class ); //notOK
        //h.add( IHello.class ); //notOK
        h.add( Empty.class ); //notOK


        //==========================================//
        // OK
        //===========================================//
        //resource classes
        //h.add( HelloWorldResource.class ); //Ok
        //h.add( MyBeanResource.class ); //OK

        //providers
        //h.add( MyDynamicFeature.class ); //OK
        //h.add( PoweredByResponseFilter.class ); //OK
        //h.add( GZIPWriterInterceptor.class ); //OK
        //h.add( AuthorizationRequestFilter.class ); //OK
        //h.add( MyBeanMessageBodyWriter.class ); //OK

        return h;
    }

}
