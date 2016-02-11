package example.fileupload;

import org.glassfish.jersey.client.ClientConfig;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;


public class FileUploadClient {

    private static File tempFile;
    public static void main(String[] argv) throws IOException {
        Client client = ClientBuilder.newClient(new ClientConfig());
        WebTarget service = client.target(getBaseURI()).path("FileUploadResource");

        generateSampleFile();
        try {
            System.out.println( service.path("/upload").request()
                    .post(Entity.entity(tempFile, MediaType.APPLICATION_OCTET_STREAM), Long.class) );
        } catch (Exception e) {
            System.out.println("exeption1");
        }
    }


    public static void generateSampleFile() throws IOException {
        tempFile = File.createTempFile("sample", ".png");
        // fill the file with 1KB of content
        try (FileOutputStream outputStream = new FileOutputStream(tempFile)) {
            for (int i = 0; i < 1000; i++) {
                outputStream.write(0);
            }
        }
    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/").build();
    }

}
