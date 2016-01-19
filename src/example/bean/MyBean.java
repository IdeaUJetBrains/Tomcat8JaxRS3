package example.bean;

import javax.ws.rs.*;

//@Path("/")
class MyBean {
    /*@FormParam("myData")
    private String data;*/

    @HeaderParam("myHeader")
    private String header;


    //@Encoded
    //@DefaultValue("t")
    @PathParam("id")
    @DefaultValue("ttt") @QueryParam("qp")
    public void setResourceId( String id, String id1, String id2, String qp) {
        System.out.println( "id=" + id );
        System.out.println( "id1=" + id1 );
        System.out.println( "id2=" + id2 );
    }


    @QueryParam("q")
    public void setResourceId1( String q) {
        System.out.println( "q=" + q );
    }

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
