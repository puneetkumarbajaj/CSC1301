import java.util.Scanner; // Needed for the Scanner class


/** Add a class comment and @tags
This program calculates the quantities of ingredients needed to make cookies based on the number of cookies user enters
@author Puneet Bajaj
@version October 5, 2020
*/
 
public class CookieAmount
{
   /** 
     * @param args not used 
     */
    public static void main(String[] args)
    {
        // The four named constants for the original recipe.
        final double COOKIE_COUNT   = 48;
        final double CUPS_OF_SUGAR  = 1.5;
        final double CUPS_OF_BUTTER = 1.0;
        final double CUPS_OF_FLOUR  = 2.75;
      
        // Create a Scanner object for console input.
        Scanner in = new Scanner(System.in);

        // Get the number of cookies.
        System.out.print("Enter the number of cookies you want to make: ");
        int cookies = in.nextInt();
       
        // Calculate the adjusted cups of sugar.
        double adjustedCupsOfSugar = CUPS_OF_SUGAR * (cookies/COOKIE_COUNT); //(cookies/COOKIE_COUNT) finds the net change in form of quotient which then make it easy to calculate the adjusted ingredients. 
      
        // Calculate the adjusted cups of butter.
        double adjustedCupsOfButter = CUPS_OF_BUTTER * (cookies/COOKIE_COUNT);
      
        // Calculate the adjusted cups of flour.
        double adjustedCupsOfFlour = CUPS_OF_FLOUR * (cookies/COOKIE_COUNT);
      
        // Display the adjusted amounts using printf.
        System.out.printf("\nTo make %d cookies, you will need:\n", cookies); 
        System.out.printf("%10.2f cups of sugar\n", adjustedCupsOfSugar);
        System.out.printf("%10.2f cups of Butter\n", adjustedCupsOfButter);
        System.out.printf("%10.2f cups of Flour\n", adjustedCupsOfFlour);
        //All done!
    }
}