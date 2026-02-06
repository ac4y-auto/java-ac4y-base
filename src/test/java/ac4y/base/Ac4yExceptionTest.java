package ac4y.base;

import org.junit.Test;
import static org.junit.Assert.*;

public class Ac4yExceptionTest {

    @Test
    public void testExceptionWithMessage() {
        String message = "Test error message";
        Ac4yException exception = new Ac4yException(message);

        assertEquals(message, exception.getMessage());
    }

    @Test
    public void testGetStackTraceAsString() {
        Ac4yException exception = new Ac4yException("Test exception");
        Throwable testThrowable = new RuntimeException("Test throwable");

        String stackTrace = exception.getStackTraceAsString(testThrowable);

        assertNotNull(stackTrace);
        assertTrue(stackTrace.contains("RuntimeException"));
        assertTrue(stackTrace.contains("Test throwable"));
    }
}
