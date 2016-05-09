/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduction;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test the methods of the Main class.
 */
public class MainTest {
    /**
     * Test for the sum method.
     */
    @Test
    public void testSum() {
        int expResult = 5050;
        int result = Main.sum();
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test for the smallest method.
     */
    @Test
    public void testSmallest() {
        int[] numbers = {16, 3, 9, 85};
        int expResult = numbers[1];
        int result = Main.smallest(numbers);
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test for the maxDigit method.
     */
    @Test
    public void testMaxDigit() {
        int number = 472;
        int expResult = 7;
        int result = Main.maxDigit(number);
        
        assertEquals(expResult, result);
    }
    
    /**
     * Test for the isPalindrome method.
     */
    @Test
    public void testIsPalindrome() {
        int number = 34143;

        assertTrue(Main.isPalindrome(number));
    }
    
    /**
     * Test for the getPrimeNumbers method.
     */
    @Test
    public void testGetPrimeNumbers() {
        int[] expResult = {2, 3, 5, 7, 11};
        int[] result = Main.getPrimeNumbers(12);

        assertTrue(Arrays.equals(expResult, result));
    }
}
