package example.priority.dynamicFeature;

import example.toApplicatonClass.GZIPWriterInterceptor;
import org.glassfish.jersey.filter.LoggingFilter;

import javax.annotation.Priority;
import javax.ws.rs.GET;
import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;
import java.lang.reflect.Method;

@Priority(2000)
@Provider
public class MyDynamicFeaturePriority2000 implements DynamicFeature {
 
    @Override
    public void configure(final ResourceInfo resourceInfo,
                          final FeatureContext context) {
 
        final String resourcePackage = resourceInfo.getResourceClass()
                .getPackage().getName();
        final Method resourceMethod = resourceInfo.getResourceMethod();
 
        if ("example.priority.dynamicFeature".equals(resourcePackage)
                && resourceMethod.getAnnotation(GET.class) != null) {
            context.register(GZIPWriterInterceptor.class);

        }
        System.out.print("MyDynamicFeaturePriority2000 with GZIPWriterInterceptor works!");
    }
}