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


//@WebServlet(urlPatterns = {"/simplesse"})
public class SSEEchoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        // set content type
        res.setContentType("text/event-stream");
        res.setCharacterEncoding("UTF-8");
        String msg = req.getParameter("msg");
        PrintWriter writer = res.getWriter();
        // send SSE
        writer.write("data: " + msg + "\n\n");
    }


    //The client side JavaScript will setup a EventSource as follows:
    //<html>  <body>    <script>      function setupEventSource() {         var output = document.getElementById("output");         if (typeof(EventSource) !== "undefined") {           var msg = document.getElementById("textID").value;           var source = new EventSource("simplesse?msg=" + msg);           source.onmessage = function(event) {             output.innerHTML += event.data + "<br>";           };         } else {           output.innerHTML = "Sorry, Server-Sent Event is not supported in your browser";         }         return false;       }     </script>     <h2>Simple SSE Echo Demo</h2>    <div>      <input type="text" id="textID" name="message" value="Hello World">      <input type="button" id="sendID" value="Send" onclick="setupEventSource()"/>    </div>    <hr/>    <div id="output"></div>  </body></html>
}
