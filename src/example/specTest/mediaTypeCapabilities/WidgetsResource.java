package example.specTest.mediaTypeCapabilities;

import example.specTest.Widget;
import example.specTest.Widgets;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Path("widgets1")
@Produces("application/widgets+xml")
public class WidgetsResource {

    @GET
    public Widgets getAsXML() {
        return new Widgets();
    }

    @GET
    @Produces("text/html")
    public String getAsHtml() {
        return "<html>haha ha</html>";
    }

    // @Produces("application/xml; qs=1", "application/json; qs=0.75")
    @POST
    @Consumes("application/widgets+xml")
    public void addWidget(Widget widget) {

    }
}

@Provider
@Produces("application/widgets+xml")
class WidgetsProvider implements MessageBodyWriter<Widgets> {
    @Override
    public boolean isWriteable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return false;
    }

    @Override
    public long getSize(Widgets widgets, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return 0;
    }

    @Override
    public void writeTo(Widgets widgets, Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> multivaluedMap, OutputStream outputStream) throws IOException, WebApplicationException {

    }
}

@Provider
@Consumes("application/widgets+xml")
class WidgetProvider implements MessageBodyReader<Widget> {
    @Override
    public boolean isReadable(Class<?> aClass, Type type, Annotation[] annotations, MediaType mediaType) {
        return false;
    }

    @Override
    public Widget readFrom(Class<Widget> aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> multivaluedMap, InputStream inputStream) throws IOException, WebApplicationException {
        return null;
    }
}

