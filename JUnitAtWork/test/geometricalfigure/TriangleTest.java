package geometricalfigure;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for the Triangle class.
 */
public class TriangleTest {
    /**
     * Test of toString method, of class Triangle.
     */
    @Test
    public void testToString() {
        Triangle triangle = new Triangle();
        
        String expResult = "TRIANGLE: a plane figure with three straight sides " + 
            "and three angles.";
        
        String result = triangle.toString();
        
        assertEquals(expResult, result);
    }
}