package example.toApplicatonClass;

import org.glassfish.jersey.filter.LoggingFilter;

import javax.ws.rs.GET;
import javax.ws.rs.container.DynamicFeature;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.Provider;
import java.lang.reflect.Method;

@Provider
public class MyDynamicFeature implements DynamicFeature {

    @Override
    public void configure(final ResourceInfo resourceInfo,
                          final FeatureContext context) {

        final String resourcePackage = resourceInfo.getResourceClass()
                .getPackage().getName();
        final Method resourceMethod = resourceInfo.getResourceMethod();

        if ("my.package.admin".equals(resourcePackage)
                && resourceMethod.getAnnotation(GET.class) != null) {
            context.register(LoggingFilter.class);
        }
        System.out.print("MyDynamicFeature works!");
    }
}