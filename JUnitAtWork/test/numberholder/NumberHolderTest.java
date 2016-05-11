package numberholder;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for the NumberHolder class.
 */
public class NumberHolderTest {
    private NumberHolder numberHolder;
    private final int AN_INT = 100;
    private final float A_FLOAT = 2.5f;
    
    /**
     * Initializes a number holder for use in testing.
     */
    @Before
    public void initialization() {
        numberHolder = new NumberHolder();
        numberHolder.anInt = AN_INT;
        numberHolder.aFloat = A_FLOAT;
    }

    /**
     * Tests the getter for the int value.
     */
    @Test
    public void testGetAnInt() {
        int result = numberHolder.getAnInt();
        
        assertEquals(AN_INT, result);
    }

    /**
     * Tests the getter for the float value.
     */
    @Test
    public void testGetAFloat() {
        float result = numberHolder.getAFloat();
        
        assertEquals(A_FLOAT, result, 0.005);
    }
}
