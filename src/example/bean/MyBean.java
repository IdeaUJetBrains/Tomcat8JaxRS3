package example.bean;

import javax.ws.rs.*;

//@Path("/")
public class MyBean {
    /*@FormParam("myData")
    private String data;*/

    @HeaderParam("myHeader")
    private String header;


    @Encoded
    @DefaultValue("t")
    @PathParam("id")
    public void setResourceId( String id) {System.out.println( "id=" + id );}

    /*@Encoded
    @DefaultValue("ttt")
    @PathParam("id")
    public void getResourceId( ) {System.out.println( "getResourceId" );}*/


    public String getHeader() {
        String str =  this.header;
        System.out.print( str );
        return str;
    }
}
