package example.servernegotiation;


import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class AppClientNegotiation {


    public static void main(String[] argv) {
        Client client = ClientBuilder.newClient(new ClientConfig());
        WebTarget service = client.target(getBaseURI());

        WebTarget service0 = service.path("MyResourceClientNegotiation");
        //clientNegotiation
        System.out.println("1");
        System.out.println(service0.request("application/json").get(String.class));
        System.out.println("2");
        System.out.println(service0.request("application/xml").get(String.class));

        //serverNegotiation
        WebTarget service1 = service.path("MyResourceServerNegotiaton");
        System.out.println("3");
        System.out.println(service1.request().accept("application/*").get(String.class));
        System.out.println("4");
        System.out.println(service1.request().get(String.class));


    }


    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/").build();
    }

}
