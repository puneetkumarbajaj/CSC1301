import java.util.Arrays;
import java.util.Scanner;

/** Add class comment and @tags
 * This program takes a certain number of student names as instructed by the user and sorts them 
 * alphabetically. It also finds the shortest and longest names among the student names and displays
 * them.
 * @author Puneet Bajaj
 * @version 6 November, 2020
 */
public class StudentNamesUsingArrays 
{
    /**
     * @param args not used
     */
    public static void main(String[] args) 
    {
        String[] students = getStudentNames();
        System.out.println();              
        System.out.println("Original student list: ");
        printStudents(students);
        System.out.println("Sorted student list: ");
        printStudents(alphaSort(students));
        
        System.out.println("The longest name is: " + longestName(students));
        System.out.println("The shortest name is: " + shortestName(students));
        System.out.println();
    }
    
    /**
     * This method prompts the user to enter the number of student names s/he wants to enter.
     * Then, it prompts the user to enter the names of student and stores and returns them in the 
     * form of an array.
     * @param
     * @return array of student names entered by user
     */
    public static String[] getStudentNames()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many students would you like to enter? ");
        
        //Use a while loop to validate input is an integer
        while (!in.hasNextInt())
        {
            System.out.print("Not valid: Please enter an integer: ");
            in.next();
        }
        //Read in number of students
        int numberOfStudents = in.nextInt();
        //Create an array for the number of names and use a for loop to add names to the array
        String[] students = new String[numberOfStudents];
        for(int i = 0; i < students.length; i++)
        {
            System.out.printf("Please enter the name of student %d: ", i+1);
            students[i] = in.next();
        }
        //Return array of student names
        return students;
    }
     
    /**
     * This method takes an array of Strings and sorts it alphabetically
     * @param students - Takes an array of student names as an input
     * @return sorted array of student names
     */
    public static String[] alphaSort(String[] students)
    {
        //Make a copy of original student name array and then sort
        String[] sorted = students;
        Arrays.sort(sorted);
        //Return sorted array
        return sorted;
    }
	
    /**
     * This method finds the longest student name.
     * @param students - Takes an array of student names as an input
     * @return Longest name among the student names
     */
    public static String longestName(String[] students)
    {
        int indexOfLongest = 0;
        int longestLength = students[0].length();
        for(int i = 0; i < students.length; i++)
        {
            if(students[i].length() > longestLength)
            {
                indexOfLongest = i;
                longestLength = students[i].length();
            }
        }
        return students[indexOfLongest];
    }	
    
    /**
     * This method finds the shortest student name.
     * @param  students - Takes an array of student names as an input
     * @return Shortest name among the student names
     */
    public static String shortestName(String[] students)
    {
        int indexOfShortest = 0;
        int shortestLength = students[0].length();
        for(int i = 0; i < students.length; i++)
        {
            if(students[i].length() < shortestLength)
            {
                indexOfShortest = i;
                shortestLength = students[i].length();
            }
        }
        return students[indexOfShortest];
    }

    /**
     * This method takes an array of Strings and prints its content in  form of seperate arrays.
     * @param students - Takes an array of student names as an input
     */
    public static void printStudents(String[] students)
    {
        //Use an enhanced for loop to output student names
        for(String student : students)
        {
            System.out.print(student + "\n");
        }
        System.out.println();
    }
}