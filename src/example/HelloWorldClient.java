package example;


import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.List;



/**
 * Created by Olga Pavlova on 12/11/2015.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    //server = Main.startServer();

    Client client = ClientBuilder.newClient(new ClientConfig());
    WebTarget service = client.target(getBaseURI());
    //target = c.target(getBaseURI());
    //server.stop();


    /*ClientConfig config = new DefaultClientConfig();
    Client client = Client.create(config);
    WebResource service = client.resource(getBaseURI());*/


    TestForm tForm = service.path("form").path("test1").request().get(TestForm.class);
    System.out.println(" = " + tForm);

  }
  private static URI getBaseURI() {
    return UriBuilder.fromUri("http://localhost:8080/").build();
  }




  }
