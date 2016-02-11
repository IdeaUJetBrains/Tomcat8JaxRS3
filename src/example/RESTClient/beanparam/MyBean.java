package example.RESTClient.beanparam;

import javax.ws.rs.CookieParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;

public class MyBean {

    @PathParam("id")
    private String id;

    @FormParam("myData")
    private String data;

    @HeaderParam("myHeader")
    private String header;

    @CookieParam("myCookie")
    private String cookie;

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public String getCookie() {

        return cookie;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setData(String data) {

        this.data = data;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getHeader() {
        return header;
    }

    public String getData() {

        return data;
    }

    public String getId() {

        return id;
    }
}
