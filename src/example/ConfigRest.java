package example;




import example.RESTClient.MsgRestExampleWithClient.MessageResource;
import example.RESTClient.beanparam.MyResourcesBean;
import example.beanparam.BeanParamResource;
import example.beanvalidation.MyConstrainsResource1;
import example.checkInspections.CheckInspectionsChild;
import example.checkInspections.DefaultValueInspection;
import example.checkInspections.InspectionWrongProduces;
import example.fileupload.FileUploadResource;
import example.servernegotiation.MyResourceClientNegotiation;
import example.servernegotiation.MyResourceServerNegotiaton;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Olga Pavlova on 22/09/2015.
 */

@ApplicationPath("/")
public class ConfigRest extends Application {

   /* @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( HelloWorldResource.class );
        h.add( GZIPWriterInterceptor.class);
        h.add( AuthorizationRequestFilter.class);

        return h;
    }*/

    //NameBinding testing
   /* @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( HelloWorldResource.class );
        h.add( GZIPWriterInterceptor.class );
        h.add( PoweredByResponseFilter.class );

        return h;
    }*/
    //===================================================
    //Priority filters interceptors testing
    /*
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( HelloWorldResourcePriority.class );
        h.add( ResponseFilterPriority1000.class );
        h.add( ResponseFilterPriority2000.class );
        h.add( WriterInterceptorPriority1000.class );
        h.add( WriterInterceptorPriority2000.class );

        return h;
    }*/

    //Priority Dynamic feature testing
    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        //h.add( HelloWorldResourcePriorityDinFeature.class );
        //h.add( MyDynamicFeaturePriority1000.class );
        //h.add( MyDynamicFeaturePriority2000.class );
        h.add( BeanParamResource.class );
        h.add( MyConstrainsResource1.class );
        h.add( MyResourcesBean.class );
        h.add( BeanParamResource.class );
        h.add( MessageResource.class );
        h.add( HelloWorld.class );
        h.add( InspectionWrongProduces.class );


        return h;
    }

    /*@Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        *//*h.add(HelloWorld1.class);

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
        *//*

       *//* h.add(SingletonEager.class);
        h.add(StaticFinalFieldsExample.class);
        h.add(DefaultValueAnnotation.class);


        h.add(example.constructors.NoDefaultNoAnnotated.class);
        h.add(example.constructors.NotAllParamsAnnotated.class);
        h.add(example.constructors.WithoutPublicConstructor.class);
        //h.add(example.constructorMore.NotAllParamsAnnotated.class);
        h.add(StatusResource.class);
        h.add(StatusWithDefaultValue.class);

        h.add(WithStaticClass.StaticTest.class);
        h.add(StaticMethod.class);
        h.add(Child1.class);
        h.add(Child2.class);
        h.add(Parent2.class);

        h.add(ResourceSingleton.class);

        h.add(EncodedMethodParam.class);
        h.add(MyResources.class);
        h.add(ReturnType.class);
        h.add(WidgetsResource.class);*//*

        //h.add(HelloWorldResource.class);
        //h.add(HelloWorldResource.class);
        //h.add(new HelloWorldResource());
        //h.add(GZIPWriterInterceptor.class);
        //h.add(GZIPWriterInterceptor.class);     // Rejected by runtime.
        //h.add(new GZIPWriterInterceptor());     // Rejected by runtime.


        *//*config.register(GZIPWriterInterceptor.class, WriterInterceptor.class);
        config.register(GZIPWriterInterceptor.class);       // Rejected by runtime.
        config.register(new GZIPWriterInterceptor());       // Rejected by runtime.
        config.register(GZIPWriterInterceptor.class, 6500); // Rejected by runtime.*//*



        *//*h.add(SSEEchoServlet.class);*//*


        return h;
    }*/

}
