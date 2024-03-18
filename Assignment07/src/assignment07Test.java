import org.junit.Test;
import static org.junit.Assert.*;

public class assignment07Test {

    @Test
    public void testMain() {
        // Test case 1: Check if "Hello, World!" is printed
        assertEquals("Hello, World!", getOutput());
    }

    private String getOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        assignment07.main(null);

        return outputStream.toString().trim();
    }
}