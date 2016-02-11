package example.RESTClient.MsgRestExampleWithClient;

/*import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.List;*/

public class RestClient {
    public static void main(String[] args) {
       /* ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        WebResource service = client.resource(getBaseURI());

		*//*
		 * Get list of messages
		 *//*
        GenericType<List<Message>> genericType = new GenericType<List<Message>>() { };
        List<Message> messages = service.path("message").accept(MediaType.APPLICATION_XML).get(genericType);

        for (Message temp : messages) {
            System.out.println(temp);
        }

		*//*
		 * Get message by ID
		 *//*
        long id = 4;
        Message message = service.path("message").path(String.valueOf(id))
                .accept(MediaType.APPLICATION_XML).get(Message.class);
        System.out.println("Message with ID = " + id);
        System.out.println(message);

		*//*
		 * Update message
		 *//*

        message.setMessageTitle("udated title");
        message.setMessageText("updated text");
        service.path("message").post(message);
        message = service.path("message").path(String.valueOf(id))
                .accept(MediaType.APPLICATION_XML).get(Message.class);
        System.out.println("Message with ID = " + id);
        System.out.println(message);

		*//*
		 * Delete message
		 *//*
        System.out.println("delete message with ID = " + id);
        service.path("message").path(String.valueOf(id)).delete();
        messages = service.path("message")
                .accept(MediaType.APPLICATION_XML).get(genericType);

        for (Message temp : messages) {
            System.out.println(temp);
        }

		*//*
		 * Put message
		 *//*

        System.out.println("puttin' message");
        message = new Message();
        message.setMessageText("PUT MESSAGE!");
        message.setMessageTitle("Put message");
        service.path("message")
                .accept(MediaType.APPLICATION_XHTML_XML).put(message);

        messages = service.path("message")
                .accept(MediaType.APPLICATION_XML).get(genericType);

        for (Message temp : messages) {
            System.out.println(temp);
        }*/

    }

    /*private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/RestExample1_war_exploded").build();
    }*/




}
