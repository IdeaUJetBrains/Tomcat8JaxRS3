package example.beanvalidation;


import org.glassfish.jersey.client.ClientConfig;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class AppClient {


    public static void main(String[] argv) {
        Client client = ClientBuilder.newClient(new ClientConfig());
        WebTarget service = client.target(getBaseURI()).path("endpoint");
        try {
            System.out.println( service.request().post(Entity.text("fo"), String.class) );
        } catch (Exception e) {
            System.out.println("exeption1");
        }

        System.out.println(service.request().post(Entity.text("foo"), String.class));


        //------------------//
        MultivaluedHashMap<String, String> map = new MultivaluedHashMap<String, String>();
        map.add("name", "Penny");
        map.add("age", "1");
        System.out.println(service.request().post(Entity.form(map)));

        map.clear();
        map.add("name", "Leonard");
        map.add("age", "2");
        System.out.println(service.request().post(Entity.form(map)));


        map.clear();
        map.add("name", "Penny");
        map.add("age", "0");
        try {
            System.out.println(service.request().post(Entity.form(map)));
        } catch (Exception e) {
            System.out.println("exeption2");
        }

        map.clear();
        map.add("name", null);
        map.add("age", "1");
        try {
            System.out.println(service.request().post(Entity.form(map)));
        } catch (Exception e) {
            System.out.println("exeption3");
        }
        map.clear();
        map.add("name", "Penny");
        map.add("age", "11");
        try {
            System.out.println(service.request().post(Entity.form(map)));
        } catch (Exception e) {
            System.out.println("exeption4");
        }

    }


    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/").build();
    }

}
