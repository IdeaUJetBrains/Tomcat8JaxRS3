package example;


import example.sse.SSEEchoServlet;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.List;

import static javax.ws.rs.client.Entity.xml;


/**
 * Created by Olga Pavlova on 12/11/2015.
 */
public class HelloWorldClient {
  public static void main(String[] argv) {
    //server = Main.startServer();

    Client client = ClientBuilder.newClient(new ClientConfig());
    WebTarget service = client.target(getBaseURI());
     /* service.path("widgets1").request().accept("text/html; q=1,application/widgets+xml; q=0.8").get();

      Response res = client.target("http://example.org/hello").queryParam("MyParam","...")
              .request("text/plain")
      .header("MyHeader", "...")
      .get();*/


      TestForm c = service.path("form/test1").request("application/xml").get(TestForm.class);
      String newId = service.path("form").request().post(xml(c), String.class);

    //target = c.target(getBaseURI());
    //server.stop();


    /*ClientConfig config = new DefaultClientConfig();
    Client client = Client.create(config);
    WebResource service = client.resource(getBaseURI());
*/

    /*TestForm tForm = service.path("form").path("test1").request().get(TestForm.class);
    System.out.println(" = " + tForm);
*/
    /*  Client client = ClientBuilder.newBuilder().register(SseFeature.class).build();
      WebTarget target = client.target("http://localhost:8080/events");

      EventInput eventInput = target.request().get(EventInput.class);
      while (!eventInput.isClosed()) {
          final InboundEvent inboundEvent = eventInput.read();
          if (inboundEvent == null) {
              // connection has been closed
              break;
          }
          System.out.println(inboundEvent.getName() + "; "
                  + inboundEvent.getData(String.class)
          );
      }*/
  }


  private static URI getBaseURI() {
    return UriBuilder.fromUri("http://localhost:8080/").build();
  }




  }
