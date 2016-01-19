package example.Encoded;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;

@Path("EncodedMethodParam")
public class EncodedMethodParam {

    @GET
    @Path("foo") //  EncodedMethodParam/foo?param=парпо
    public String foo(@Encoded @QueryParam("param") String str) {    return str;   }

    @GET
    @Path("foo1") //  EncodedMethodParam/foo1?param=парпо
    public String foo1( @QueryParam("param") String str) {    return str;   }

    @GET
    @Path("foo2") //  EncodedMethodParam/foo1?param=парпо
    public String foo2( @BeanParam() @Encoded String str) {    return str;   } //todo check

    @GET
    @Path("foo3") //  EncodedMethodParam/foo1?param=парпо
    public String foo3( @Context() @Encoded String str) {    return str;   } //todo check
}
