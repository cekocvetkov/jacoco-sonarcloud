import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
    @Test
    void testThree(){
        Service service = new Service();

        String result = service.method("three");

        assertEquals("Three", result);
    }
    @Test
    void testDefault(){
        Service service = new Service();

        String result = service.method("something");

        assertEquals("default", result);
    }
}
