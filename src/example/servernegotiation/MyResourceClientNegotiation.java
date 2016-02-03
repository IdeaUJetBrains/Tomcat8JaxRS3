
package example.servernegotiation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;


@Path("MyResourceClientNegotiation")
public class MyResourceClientNegotiation {
    @GET
    @Produces({ "application/xml", "application/json" })
    public List<Person> getList() {
        People people = new People();
        people.add(new Person("Penny", 1));
        people.add(new Person("Leonard", 2));
        people.add(new Person("Sheldon", 3));
        return people;
    }
}
