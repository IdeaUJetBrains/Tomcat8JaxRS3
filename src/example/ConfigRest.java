package example;




import example.Singleton.SingletonEager;
import example.bugIDEA.Child2;
import example.bugIDEA.Parent2;
import example.enumTest.StatusResource;
import example.enumTest.StatusWithDefaultValue;
import example.finalClassesAndMethods.Child1;
import example.staticClassesAndMethods.StaticMethod;
import example.staticClassesAndMethods.WithStaticClass;

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
        return h;
    }

}
