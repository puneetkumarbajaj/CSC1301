import java.util.Scanner; // Needed for the Scanner class

/** Add a class comment and @tags
This program take the first and last name of the user as input and outputs various details like full name, initials, standard username and switching the first and last character of first name.
@author Puneet bajaj
@version October 5,2020
 */

 
public class StringFun
{
    /**
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        String firstName = in.next();
        System.out.print("Please enter your last name: ");
        String lastName = in.next();
	
        //Output the welcome message with name
        System.out.print("\n\\\\// Hello " + firstName + " " + lastName + " //\\\\\n"); //We need to write '\' twice to get it printed once. Here we needed to print it twice so we used it four times
        
        //Output the length of the name
        int fullNameLength = firstName.length() + lastName.length();
        System.out.println("\nThe length of your full name is " + fullNameLength + " characters\n");
        
        //Output the username
        String firstNameInitial = firstName.substring(0, 1);
        System.out.println("Your standard username is: " + firstNameInitial + lastName);
	
        //Output the initials
        String lastNameInitial = lastName.substring(0, 1);
        System.out.println("\nYour initials are: " + firstNameInitial + "." + lastNameInitial + ".\n");
	
        //Find and output the first name with switched characters
        int totalCharacters = firstName.length();
        String lastCharacter = firstName.substring(totalCharacters - 1, totalCharacters);
        String convertedFirstName = lastCharacter + firstName.substring(1, totalCharacters - 1) + firstNameInitial;
        System.out.println("If we switch the first and last characters of your first name, we get: " + convertedFirstName);
        //All Done!
    }
}