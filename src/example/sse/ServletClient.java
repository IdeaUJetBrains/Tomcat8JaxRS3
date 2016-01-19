package example.sse;

import example.TestForm;
import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

/**
 * Created by Olga Pavlova on 1/12/2016.
 */
public class ServletClient {
        public static void main(String[] argv) {

            Client client = ClientBuilder.newClient(new ClientConfig());
            WebTarget service = client.target(getBaseURI());


            SSEEchoServlet tForm = service.path("simplesse").path("test1").request().get(SSEEchoServlet.class);

            System.out.println(" = " + tForm);

        }
        private static URI getBaseURI() {
            return UriBuilder.fromUri("http://localhost:8080/").build();
        }




}
