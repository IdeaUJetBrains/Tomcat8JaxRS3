package example.Singleton;

import javax.inject.Singleton;

//@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Singleton
public class ExampleSingletonBean {
    private String state;

    //@Lock(LockType.READ)
    public String getState() {
        return state;
    }

    //@Lock(LockType.WRITE)
    public void setState(String newState) {
        state = newState;
    }
}
