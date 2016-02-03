
package example.servernegotiation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;


@Path("MyResourceServerNegotiaton")
public class MyResourceServerNegotiaton {
    @GET
    //@Produces({ "application/xml; qs=1.0", "application/json; qs=0.75" })
    @Produces({ "application/xml; qs=1.5", "application/json; qs=1.0" })
    //    @Produces({"application/xml", "application/json"})
        public List<Person> getList() {
        People list = new People();
        list.add(new Person("Penny", 1));
        list.add(new Person("Leonard", 2));
        list.add(new Person("Sheldon", 3));

        return list;
    }
}
