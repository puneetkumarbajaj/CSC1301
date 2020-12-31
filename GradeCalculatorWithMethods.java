import java.util.Scanner;

/** Add class comment and @tags
 * This program calculates the Final Grade Average and Grade Letter based on the averages of
 * Homework grades, test scores, midterm exam score, and final exam score and their weightage.
 * @author Puneet Bajaj
 * @version October 29, 2020
 */

public class GradeCalculatorWithMethods
{    
    /**
     * @param args not used
     */
    public static void main(String[] args) 
    {      
        //NOTE: *Write all class methods and complete the main method last*
        
        //Call method to introduce application to user
        giveIntro();
        //Call four methods to get averages/grades and assign the return to variables 
        double homeworkAvg = getHomeworkAvg();
        double testAvg = getTestAvg();

        double midtermGrade = getMidtermExamGrade();

        double finalGrade = getFinalExamGrade();
        //Call method to calculate average passing all four averages/grades and assign it to a variable     
        double gradeAvg = calculateGradeAvg(homeworkAvg, testAvg, midtermGrade, finalGrade);
        
        //Output the formatted final grade
        System.out.printf("Your final grade is: %4.2f", gradeAvg);
        System.out.println();
        
        //Call the method to get the letter grade and pass the average
        //Note: We can nest method calls inside print(ln) statements - try it!
        //For ex: System.out.println(methodName(parameterVariable)); 
        //will return a value and output it simultaneously
        System.out.println(getLetterGrade(gradeAvg));
    }
   
    /**
      * This method gives the introduction to the program.
      */
    public static void giveIntro()
    {
        System.out.println("Welcome to the Grade Calculator!\n");
        System.out.println("This program will input your homework, quizzes, tests,");
        System.out.print("and final exam and calculate your average.\n");
        System.out.println();
    }

    /** 
      * This method calculates the average for homework grades.
      * @param
      * @return Calculated Average of homework grades.
      */
    public static double getHomeworkAvg()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many homework grades to be entered?: ");
        int count = in.nextInt();
        double sum = 0;

        //for loop to read in scores
        for(int i = 1; i <= count; i++)
        {
            //Prompt for grade and add to sum
            System.out.print("Grade " + i + ": " );
            double grade = in.nextDouble();
            sum += grade;
        }
        double homeworkAverage = sum/count;
        System.out.println();
        return homeworkAverage; 
    }

    /**
      * This method calculates the average for tests grades.
      * @param
      * @return Calculated Average of test grades
      */
    public static double getTestAvg()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many tests grades to be entered?: ");
        int count = in.nextInt();
        double sum = 0;

        //for loop to read in scores
        for(int i = 1; i <= count; i++)
        {
            //Prompt for grade and add to sum
            System.out.print("Grade " + i + ": ");
            double grade = in.nextDouble();
            sum += grade;
        }
        double testAverage = sum/count;
        System.out.println();
        //Return the test average
        return testAverage;
    }

    /**
      * This method gets the Midterm Exam Score
      * @param
      * @return Midterm exam score
      */
    public static double getMidtermExamGrade()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your midterm exam grade: ");
        double midtermScore = in.nextDouble();
        return midtermScore;
    }

    /**
      * This method gets the one final exam grade.
      * @param
      * @return Final Exam Score
      */
    public static double getFinalExamGrade()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your final exam grade: ");
        double finalScore = in.nextDouble();
        in.close();
        return finalScore;
    }

    /**
      * This method calculates the user's final grade based on the homework, 
      * quiz, test, and final exam weights and averages.
      *
      * @param homeworkAvg Calculated Average of Homework scores
      * @param testsAvg Calculated Average of Test scores
      * @param midtermScore Midterm score of the student
      * @param finalScore Final Score of the student
      * @return Final calculated grade
      */
    //Add method header with parameters to calculate grade average
    public static double calculateGradeAvg(double homeworkAvg, double testsAvg, double midtermScore, double finalScore)
    {
        final double HOMEWORK = .15;
        final double TESTS = 0.35;
        final double MIDTERM = 0.20;
        final double FINAL_EXAM = 0.30;

        //Calculate the grade average using parameters and constants
        double gradeAvg = (homeworkAvg * HOMEWORK) + (testsAvg * TESTS) + (midtermScore * MIDTERM) + (finalScore * FINAL_EXAM);
        System.out.println();
        return gradeAvg;
    }

    /**
      * This method determines the user's letter grade based on his/her numerical final grade.
      * @param gradeAvg Calculated Grade Average of the student
      * @return Grade Letter and a message
      */
    public static String getLetterGrade(double gradeAvg)
    {
        String letterGrade = "";
        //Use if/else statement to assign message to return
        if(gradeAvg >= 90)
        {
            letterGrade = "Great job - You earned an A";
        }
        else if(gradeAvg >= 80)
        {
            letterGrade = "Good job - You earned a B";
        }
        else if(gradeAvg >= 70)
        {
            letterGrade = "OK job - You earned a C";
        }
        else if(gradeAvg >= 60)
        {
            letterGrade = "Oh no - You earned a D";
        }
        else
        {
            letterGrade = "Sorry - You earned an F";
        }
        return letterGrade;
    }

}