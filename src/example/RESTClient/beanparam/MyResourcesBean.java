package example.RESTClient.beanparam;

import javax.ws.rs.*;
import javax.ws.rs.core.Cookie;

@Path("MyResourcesBean")
public class MyResourcesBean {

    //@HeaderParam("Content-Type")
    @POST
    @Path("{id}")  //   MyResourcesBean/23
    public String get(@BeanParam MyBean myBean) {
        //Cookie
        String str = myBean.getData() + "\n"
                + myBean.getHeader() + "\n"
                + myBean.getId() + "\n"
                + myBean.getCookie();

        System.out.print( str );
        return str;
    }


}
