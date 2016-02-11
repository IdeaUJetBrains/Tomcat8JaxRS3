package example.priority.dynamicFeature;

import org.glassfish.jersey.filter.LoggingFilter;

import javax.annotation.Priority;
import javax.ws.rs.GET;
import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;
import java.lang.reflect.Method;

@PreMatching
@Priority(1000)
@Provider
public class MyDynamicFeaturePriority1000 implements DynamicFeature {
 
    @Override
    public void configure(final ResourceInfo resourceInfo,
                          final FeatureContext context) {
 
        final String resourcePackage = resourceInfo.getResourceClass()
                .getPackage().getName();
        final Method resourceMethod = resourceInfo.getResourceMethod();
 
        if ("example.priority.dynamicFeature".equals(resourcePackage)
                && resourceMethod.getAnnotation(GET.class) != null) {
            context.register(LoggingFilter.class);
            context.register(LoggingFilter.class);

        }
        System.out.print("MyDynamicFeaturePriority1000 with LoggingFilter works!");
    }
}