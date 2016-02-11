package example.RESTClient.MsgRestExampleWithClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;
import java.util.List;


@Path("message")
public class MessageResource {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> getAllMessages() {

        List<Message> messages = Data.getData();
        if (messages == null) {
            throw new RuntimeException("Can't load all messages");
        }
        return messages;
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_XML)
    public Message getMessageById(@PathParam("id") long id) {
        System.out.println("MediaType.APPLICATION_XML");
        Message message = Data.findMessageById(id);
        if (message == null) {
            throw new RuntimeException("\"MediaType.APPLICATION_XML\" can't find mesage with id = " + id);
        }
        return message;
    }


    /*@GET
    @Path("{id}")
    @Produces("text/xml")
    public Message getMessageById1(@PathParam("id") long id) {
        System.out.println("text/xml");
        Message message = Data.findMessageById(id);
        if (message == null) {
            throw new RuntimeException("\"text/xml\" can't find mesage with id = " + id);
        }
        return message;
    }*/

    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void addMessage(JAXBElement<Message> message) {
        if (Data.addMesage(message.getValue()) != true) {
            throw new RuntimeException("can't add mesage with id = "
                    + message.getValue().getMessageId());
        }
    }

    @DELETE
    @Path("{id}")
    public void deleteMessage(@PathParam("id") long id) {
        if (Data.deleteMessageById(id) != true) {
            throw new RuntimeException("can't delete mesage with id = " + id);
        }
    }



    @POST
    @Consumes(MediaType.APPLICATION_XML)
    public void updateMessage(JAXBElement<Message> message) {
        System.out.println("MediaType.APPLICATION_XML");
        if (Data.updateMessage(message.getValue()) != true) {
            throw new RuntimeException("can't update mesage with id = "
                    + message.getValue().getMessageId());

        }
    }

    /*@POST
    @Consumes("application/xml")
    public void updateMessage1(JAXBElement<Message> message) {
        System.out.println("application/xml");
        if (Data.updateMessage(message.getValue()) != true) {
            throw new RuntimeException("can't update mesage with id = "
                    + message.getValue().getMessageId());
        }
    }*/

   /* @POST
    @Consumes(MediaType.APPLICATION_XML)
    public void updateMessage1(JAXBElement<Message> message, String r) {
        if (Data.updateMessage(message.getValue()) != true) {
            throw new RuntimeException("1can't update mesage with id = "
                    + message.getValue().getMessageId());
        }
    }*/

    @GET
    @Path("test1") //  message/test1
    public String form(){
        return "<html>\n" +
                "<body>\n" +
                "\t<h1>JAX-RS @FormQuery Testing</h1>\n" +

                "\t<form action=\"del\" method=\"post\">\n" +
                "\t\t<p>\n" +
                "\t\t\tName : <input type=\"number\" id=\"id\" />\n" +
                "\t\t<input type=\"submit\" value=\"Delete User\" />\n"+
                "\t</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }

   /* @POST
    @Path("del")
    public void deleteMessage1(@FormParam("id") long id) {
        //throw new RuntimeException("id = " + id);
        if (Data.deleteMessageById(id) != true) {
            throw new RuntimeException("can't delete mesage with id = " + id);
        }
    }*/

    @GET
    @Path("/foo/mm/{PathParam}") //  message/23
    @Produces(MediaType.APPLICATION_XML)
    public String foo(@PathParam("PathParam") String pathParam) {
        return pathParam;
    }
    @GET
    @Path("QueryParam")  //  message/QueryParam?QueryParam=queryParam
    @Produces(MediaType.APPLICATION_XML)
    public String foo1(@QueryParam("QueryParam") String queryParam) {
        return queryParam;
    }

    @GET
    @Path("MatrixParam")  //  message/MatrixParam;MatrixParam=matrixParam
    public String foo2(@MatrixParam("MatrixParam") String matrixParam) {
        return matrixParam;
    }

    @POST
    @Path("FormParam")  //  message?FormParam=formParam1
    public String foo3(@FormParam("FormParam") String formParam) {
        return formParam;
    }

    @GET
    @Path("testFormParam") //  message/testFormParam
    public String form1(){
        return "<html>\n" +
                "<body>\n" +
                "\t<h1>JAX-RS @FormQuery Testing</h1>\n" +

                "\t<form action=\"message/FormParam\" method=\"post\">\n" +
                "\t\t<p>\n" +
                "\t\t\tName : <input type=\"text\" name=\"FormParam\" />\n" +
                "\t\t<input type=\"submit\" value=\"FormParam\" />\n"+
                "\t</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
    }
}
