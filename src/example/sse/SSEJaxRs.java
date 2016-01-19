package example.sse;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.PrintWriter;

@Path("simplesse1")
public class SSEJaxRs {

    @GET
    public Response foo(@QueryParam("msg") String msg) {
        return Response.status(200).entity(msg).build();
    }

    @GET
    @Produces("text/html")
    @Path("test1") //  simplesse/test1
    public String form1() {
        return "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<script>      function setupEventSource() {\n" +
                "    var output = document.getElementById(\"output\");\n" +
                "    if (typeof(EventSource) !== \"undefined\") {\n" +
                "        var msg = document.getElementById(\"textID\").value;\n" +
                "        var source = new EventSource(\"simplesse?msg=\" + msg);\n" +
                "        source.onmessage = function (event) {\n" +
                "            output.innerHTML += event.data + \"<br>\";\n" +
                "        };\n" +
                "    } else {\n" +
                "        output.innerHTML = \"Sorry, Server-Sent Event is not supported in your browser\";\n" +
                "    }\n" +
                "    return false;\n" +
                "}     </script>\n" +
                "<h2>Simple SSE Echo Demo</h2>\n" +
                "<div><input type=\"text\" id=\"textID\" name=\"message\" value=\"Hello World\">\n" +
                "    <input type=\"button\" id=\"sendID\" value=\"Send\" onclick=\"setupEventSource()\"/>\n" +
                "</div>\n" +
                "<hr/>\n" +
                "<div id=\"output\"></div>\n" +
                "</body>\n" +
                "</html>";
    }


}


