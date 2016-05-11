package initials;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * The program asks the user to enter his/her full name and shows his/her 
 * initials.
 * @author Andrei
 */
public class Main {
    /**
     * Starts the execution of the program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // read the user's name
        String fullName = readFullName();
        
        // if the user doesn't want to quit, show his/her initials
        if (!fullName.equals("QUIT")) {
            char[] initials = showInitials(fullName);
            System.out.printf("Your initials are: %c %c.\n", initials[0],
            initials[1]);
        }
    }
    
    /**
     * Asks the user to enter his/her name according to the pattern:
     * [a-zA-Z]+\\s[a-zA-Z]+ or QUIT to exit.
     * @return the name of the user or QUIT
     */
    static String readFullName() {
        // used to store the user's name
        String fullName = "";
        
        // read user input
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
        System.in))) {
            // keep asking for input until it matches the pattern or equals QUIT
            while (true) {
                // inform the user on what he/she has to do
                System.out.print("Write your full name in the following format:"
                    + "\nFirstName LastName"
                    + "\n... and press ENTER. Write QUIT to exit."
                    + "\n> "
                );
                
                // read user input
                fullName = reader.readLine();
                
                // check if the user wants to quit or compare input to pattern
                if (fullName.equals("QUIT") 
                    || fullName.matches("[a-zA-Z]+\\s[a-zA-Z]+"))
                    // stop asking for input
                    break;
                else
                    // inform the user that the input is invalid
                    System.out.println("Invalid input, please try again.\n");
            }
        } catch (IOException ioException) {
            System.out.println(ioException);
        }
        
        return fullName;
    }
    
    /**
     * Shows the initials of the user.
     * @param fullName the name of the user
     */
    static char[] showInitials(String fullName) {
        // split user input in two parts: first name and last name
        String[] nameParts = fullName.split("\\s");
        // get the first letter of the first name and make it uppercase
        char firstInitial = Character.toUpperCase(nameParts[0].charAt(0));
        // get the first letter of the last name and make it uppercase
        char lastInitial = Character.toUpperCase(nameParts[1].charAt(0));
        
        // return the user's initials
        char[] initials = {firstInitial, lastInitial};
        return initials;
    }
}