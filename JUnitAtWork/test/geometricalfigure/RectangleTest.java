package geometricalfigure;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for the Rectangle class.
 */
public class RectangleTest {
    /**
     * Test of toString method, of class Rectangle.
     */
    @Test
    public void testToString() {
        Rectangle rectangle = new Rectangle();
        
        String expResult = "RECTANGLE: a plane figure with four straight sides " + 
            "and four right angles, especially one with unequal adjacent " + 
            "sides, in contrast to a square.";
        
        String result = rectangle.toString();
        
        assertEquals(expResult, result);
    }
}