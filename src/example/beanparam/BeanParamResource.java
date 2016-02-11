package example.beanparam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("/BeanParamResource")
public class BeanParamResource {

    @GET()
    @Path("/{id1}")  // BeanParamResource/id1var
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@BeanParam MyBeanWithPathParams pathParams ) {
        return  pathParams.getId1();
    }


/*
    // id1 is not resolved without @BeanParam
    @GET()
    @Path("/test/{id1}")  // BeanParamResource/test/id1var
    @Produces(MediaType.TEXT_PLAIN)
    public String get2( MyBeanWithPathParams pathParams ) {
        return "/" + pathParams.getId1() + "/";
    }*/
}
