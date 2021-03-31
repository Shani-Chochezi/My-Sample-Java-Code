import java.util.Scanner;
/**
Date: March, 31, 2021
Description: This program demonstrates a case insensitive
string comparison.
 */

/**
 * @author Shani Chochezi
 */
public class SecretWord {
    public static void main(String[] args) {
        String input; //Variable to hold the user's input
        
       
        Scanner kb = new Scanner(System.in); //Scanner object for keyboard input
        System.out.println("Enter the secret word");
        input = kb.nextLine();
        
        if (input.equalsIgnoreCase("PROSPERO"))
        {
            System.out.println("Congratulations! You know the secret" +
                    "word");
        }
        else
        {
            System.out.println("Sorry, that is NOT the secret word");
        }
    }
}
