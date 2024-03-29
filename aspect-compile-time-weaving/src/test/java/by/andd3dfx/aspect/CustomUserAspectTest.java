package by.andd3dfx.aspect;

import by.andd3dfx.dto.User;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CustomUserAspectTest {

    @Test
    public void testAspects() {
        User user = new User();
        user.setName("Andrei");
        user.setAge(37);
        user.printHello();

        assertThat("Wrong output", CustomUserAspect.getWriter().toString(), is(EXPECTED_LOG));
    }

    private final String EXPECTED_LOG = "Action before setName() method call" +
        "Action around setAge() method call - first part" +
        "Parameter is 37" +
        "Action around setAge() method call - second part" +
        "Action before printHello() method call" +
        "Hello, Andrei! You are 37 years old!" +
        "Action after printHello() method call";
}
