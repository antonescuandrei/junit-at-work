package geometricalfigure;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for the Circle class.
 */
public class CircleTest {
    /**
     * Test of toString method, of class Circle.
     */
    @Test
    public void testToString() {
        Circle circle = new Circle();
        
        String expResult = "CIRCLE: a round plane figure whose boundary (the " +
            "circumference) consists of points equidistant from a fixed point " +
            "(the centre).";
        
        String result = circle.toString();
        
        assertEquals(expResult, result);
    }
}
