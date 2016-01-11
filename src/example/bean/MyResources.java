package example.bean;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;

@Path("myresources")
public class MyResources {
    @Encoded @DefaultValue("test") @BeanParam MyBean myBean;
    @Encoded @DefaultValue("test") @Context String context;

    @GET
    @Path("{id}")  //  myresources/23
    public String get1() {
        return "bla";

    }



    /*@GET
    @Path("t/{id}")  //  myresources/t/23
    public MyBean get() {
        //this.myBean.setResourceId("про");
        //this.myBean.setResourceId("7");
        return this.myBean; //( this.myBean.getHeader() );

    }*/


}