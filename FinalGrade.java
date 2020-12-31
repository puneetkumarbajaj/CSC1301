import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.ArrayList;

/**
 * This program reads a file of student averages and calculates  
 * the final weighted grade using ArrayLists.
 * @author Puneet Bajaj
 * @version November 30, 2020
 */

public class FinalGrade 
{
    /**
     * @param args not used
     */
    public static void main(String[] args) throws FileNotFoundException 
    { 
        Scanner in = new Scanner(System.in);
        boolean done = false;
        //Use a while loop and try statement to read in file 
        while (!done)
        {
            try
            {
                System.out.print("Please enter the file name: ");
                String filename = in.next();
                //Create an ArrayList to hold the grade averages 
                ArrayList<Double> averages = readFile(filename);
                //Create a variable to hold the returned final grade and output the grade
                double finalGrade = calculateFinalGrade(averages);
                System.out.printf("Your final grade is: %4.2f", finalGrade);
                    
                done = true;
            }
            catch (FileNotFoundException exception)
            {
                System.out.println("File not found.");
            }
            catch (NoSuchElementException exception)
            {
                System.out.println("File contents invalid.");
            }
            catch (IOException exception)
            {
                exception.printStackTrace();
            }    
        }
        in.close();
    }

    /**
    *  Opens a file and reads a data set.
    *  @param filename the name of the file holding the data
    *  @return the data in the file
    */
    public static ArrayList<Double> readFile(String filename) throws IOException
    {
        File inFile = new File(filename);
        try (Scanner in = new Scanner(inFile))
        {
            return readGrades(in);
        }
    }

    /**
     * Reads a list of grade averages for homework, tests, midterm, and 
     * final exam from a file and returns the list of grades
     * @param in - Scanner
     * @return ArrayList containing grades extracted from the file
     */
    public static ArrayList<Double> readGrades(Scanner in) throws IOException
    {
        //Create a new Array List to hold grade averages
        ArrayList<Double> grades = new ArrayList<Double>();
        //Use a while loop to read the file and add averages to the list
        while(in.hasNextDouble())
        {
            grades.add(in.nextDouble());
        }
        if (in.hasNext())
        {
            throw new IOException("End of file expected");
        }
        //Return the list of grade averages
        
        return grades;
        
    }

    /**
     * Traverses the list of grade averages and calculates the 
     * final numeric grade.
     * @param averages - ArrayList containing the grade averages of  homework, tests, midterm, and final exam
     * @return finalGrade - final calculated grade based on weightage
     */
    
    public static double calculateFinalGrade(ArrayList<Double> averages)
    
    {
        double finalGrade = 0;
        double weight = 0.25;
        for (double average : averages)
        {
            finalGrade = finalGrade + (average * weight);
        }
        return finalGrade;
    }
    
}