package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Main class holds the main() method which start program execution.
 */
class Main {
    /**
     * The methods below are executed here.
     * @param args command-line parameters
     */
    public static void main(String[] args) {
        System.out.printf("%s %d.%n", "The sum of the first 100 numbers higher than 0 is", sum());
        
        int[] numbers = {16, 3, 9, 85};
        
        System.out.printf("%s %s is %d.%n", "The smallest number from", Arrays.toString(numbers), smallest(numbers));
        
        int number = 472;
        
        System.out.printf("%s %d %s %d.%n", "The max digit of", number, "is", maxDigit(number));
        
        number = 34143;
        
        if (isPalindrome(number))
            System.out.printf("%s %d %s.%n", "The number", number, "is a palindrome");
        else
            System.out.printf("%s %d %s.%n", "The number", number, "is not a palindrome");
        
        number = 12;
        
        System.out.printf("%s %d %s %s.%n", "The prime numbers lower than", number, "are", Arrays.toString(getPrimeNumbers(number)));
    }
    
    // calculate the sum of the first 100 numbers higher than 0
    static int sum() {
        int sum = 0;
		
        for (int i = 1; i <= 100; i++)
            sum += i;
			
	return sum;
    }
    
    // get the smallest number from a collection of numbers
    static int smallest(int[] numbers) {
        int smallest = numbers[0];
		
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest)
		smallest = numbers[i];
        }
				
	return smallest;
    }
    
    // get the max digit of a number
    static int maxDigit(int number) {
        int maxDigit = 0;
		
	while (number > 0) {
            int digit = number % 10 ;
			
            if (digit > maxDigit)
		maxDigit = digit;
			
            number /= 10;
        }
        
        return maxDigit;
    }
    
    // check if a number is a palindrome
    static boolean isPalindrome(int number) {
        int numberCopy = number;
	int numberReversed = 0;
		
	while (number > 0) {
            int digit = number % 10;
            numberReversed = numberReversed * 10 + digit;
            number /= 10;
	}
		
        return numberCopy == numberReversed;
    }
    
    // get all the prime numbers lower than a given number
    static int[] getPrimeNumbers(int number) {
        List<Integer> primes = new ArrayList<>();
        
        for (int i = 2; i < number; i++) {
            int divisors = 0;
			
            for (int j = 2; j <= i / 2; j++)
		if (i % j == 0)
                    divisors++;
			
            if (divisors == 0)
		primes.add(i);
	}
        
        int[] result = new int[primes.size()];
        for (int i = 0; i < result.length; i++)
            result[i] = primes.get(i);
        
        return result;
    }
}