package example;




import example.BindingAnnotation.Compress;
import example.BindingAnnotation.GZIPWriterInterceptor;
import example.BindingAnnotation.HelloWorldResource;
import example.Encoded.EncodedMethodParam;
import example.Singleton.ResourceSingleton;
import example.Singleton.SingletonEager;
import example.bean.MyResources;
import example.bugIDEA148599.Child2;
import example.bugIDEA148599.Parent2;
import example.enumTest.StatusResource;
import example.enumTest.StatusWithDefaultValue;
import example.finalClassesAndMethods.Child1;
import example.specTest.mediaTypeCapabilities.WidgetsResource;
import example.specTest.returnType.ReturnType;
import example.staticClassesAndMethods.StaticMethod;
import example.staticClassesAndMethods.WithStaticClass;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.ext.WriterInterceptor;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Olga Pavlova on 22/09/2015.
 */

//@ApplicationPath("/")
public class ConfigRest extends Application {

    @Override
    public Set<Object> getSingletons() {
        HashSet h = new HashSet<Object>();
        h.add( HelloWorldResource.class );
        h.add( GZIPWriterInterceptor.class);
        return h;
    }

    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( new HelloWorldResource() );
        h.add( new GZIPWriterInterceptor() );
        return h;
    }



    /*@Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        *//*h.add(HelloWorld.class);

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
