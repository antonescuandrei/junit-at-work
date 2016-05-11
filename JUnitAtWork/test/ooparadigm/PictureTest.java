package ooparadigm;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test the methods of the Picture class.
 */
public class PictureTest {
    private Picture picture;
    
    /**
     * Create a Picture instance for testing.
     */
    @Before
    public void initialization() {
        picture = new Picture(100, 80);
    }

    /**
     * Test the getter for the picture's width.
     */
    @Test
    public void testGetWidth() {
        int expResult = 100;
        int result = picture.getWidth();
        
        assertEquals(expResult, result);
    }

    /**
     * Test the getter for the picture's height.
     */
    @Test
    public void testGetHeight() {
        int expResult = 80;
        int result = picture.getHeight();
        
        assertEquals(expResult, result);
    }
    
}
