package example.beanparam;

import javax.ws.rs.PathParam;


public class MyBeanWithPathParams {
        @PathParam("id1")
        private String id1;

        public String getId1() {
            return id1;
        }

        public void setId1(String id1) {
            this.id1 = id1;
        }
}
