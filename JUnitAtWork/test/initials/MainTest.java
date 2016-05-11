package initials;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test the methods inside the Main class.
 */
public class MainTest {
    /**
     * Test the method used for showing the initials of names.
     */
    @Test
    public void testShowInitials() {
        String name = "User Name";
        char[] expResult = {'U', 'N'};
        char[] result = Main.showInitials(name);
        
        assertArrayEquals(expResult, result);
    }
}