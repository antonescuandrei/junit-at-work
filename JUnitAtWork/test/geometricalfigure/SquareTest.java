package geometricalfigure;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for the Square class.
 */
public class SquareTest {
    /**
     * Test of toString method, of class Square.
     */
    @Test
    public void testToString() {
        Square square = new Square();
        
        String expResult = "SQUARE: a plane figure with four equal straight " + 
            "sides and four right angles.";
        
        String result = square.toString();
        
        assertEquals(expResult, result);
    }
}