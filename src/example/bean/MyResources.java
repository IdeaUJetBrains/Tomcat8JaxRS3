package example.bean;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;

@Path("myresources")
public class MyResources {
    @Encoded @DefaultValue("test") @BeanParam MyBean myBean;

    @GET
    @Path("{id}")  //  myresources/23
    public String get1(@DefaultValue("q1_DefaultValue") @QueryParam("q1") String q1) {
        System.out.println( "q1=" + q1 );
        return "bla";
    }

    @GET
    @Path("{id}/test")  //  myresources/2/test
    public String get2() {
        System.out.println( "id2" );
        return "bla";

    }



    /*@GET
    @Path("t/{id}")  //  myresources/t/23
    public MyBeanWithPathParams get() {
        //this.myBean.setResourceId("про");
        //this.myBean.setResourceId("7");
        return this.myBean; //( this.myBean.getHeader() );

    }*/


}