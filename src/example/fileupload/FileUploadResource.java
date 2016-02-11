package example.fileupload;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.*;


@Path("/FileUploadResource")
public class FileUploadResource {



    @POST
    @Path("/upload")
    @Consumes(MediaType.APPLICATION_OCTET_STREAM)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postOctetStream(InputStream content) {
        try (Reader reader = new InputStreamReader(content)) {
            int totalsize = 0;
            int count = 0;
            final char[] buffer = new char[256];
            while ((count = reader.read(buffer)) != -1) {
                totalsize += count;
            }
            return Response.ok(totalsize).build();
        } catch (IOException e) {
            e.printStackTrace();
            return Response.serverError().build();
        }
    }



}
