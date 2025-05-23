package by.andd3dfx.aspect;

import by.andd3dfx.dto.User;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomUserAspectTest {

    @Test
    public void testAspects() {
        User user = new User();
        user.setName("Andrei");
        user.setAge(37);
        user.printHello();

        assertThat(CustomUserAspect.getWriter().toString()).isEqualTo(EXPECTED_LOG);
    }

    private final String EXPECTED_LOG = "BEFORE setName() method call" +
        "AROUND setAge() method call - first part" +
        "Parameter is 37" +
        "AROUND setAge() method call - second part" +
        "BEFORE printHello() method call" +
        "Hello, Andrei! You are 37 years old!" +
        "AFTER printHello() method call";
}
