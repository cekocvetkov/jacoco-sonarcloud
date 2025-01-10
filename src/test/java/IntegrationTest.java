import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class IntegrationTest {
    @Inject
    Service service;

    @Test
    void testOne(){
        String result = service.method("one");

        assertEquals("One", result);
    }
    @Test
    void testTwo(){
        String result = service.method("two");

        assertEquals("Two", result);
    }
}
