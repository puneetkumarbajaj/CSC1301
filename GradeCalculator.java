import java.util.Scanner; // Needed for the Scanner class

/** Add class comment and @tags
* This program calculates the Grade average, Grade letter and shows whether the student can advance 
* to the next course based on his/her scores throughout the semester in tests, Homework and exams
* according to their weights.
* @author PUNEET BAJAJ
* @version OCTOBER 24, 2020
 */


public class GradeCalculator
{
    /**
    * @param args  not used
    */
    public static void main (String[] args)
    {
        //Declare constants for grade weights
        final double HOMEWORK_WEIGHT = 0.15;
        final double TEST_WEIGHT = 0.35;
        final double MIDTERM_WEIGHT = 0.20;
        final double FINAL_WEIGHT = 0.30;
        // Create a Scanner object for in input.
        Scanner in = new Scanner(System.in);

        // Get homework scores from the user.
        System.out.print("How many homework scores to enter?: ");
        int numberofHomeworkScores = in.nextInt();

        //Declare variables and construct while loop
        int i = 0;
        double hwSum = 0;
        while(i < numberofHomeworkScores)
        {
            System.out.print("Enter homework score #" + (i + 1) + ": ");
            //Add to the sum and increase the counter
            double homeworkScore = in.nextDouble();
            hwSum = hwSum + homeworkScore;
            i++;
        }
        //Calculate the hw average
        double hwAvg = hwSum/i;
        System.out.println();

        // Get test scores from the user.
        System.out.print("How many test scores to enter?: ");
        int numberofTestScores = in.nextInt();
		  
        //Declare variables and construct while loop
        int j = 0;
        double testSum = 0;
        while(j < numberofTestScores)
        {
            System.out.print("Enter test score #" + (j + 1) + ": ");
            //Add to sum and increase counter
            double testScore = in.nextDouble();
            testSum = testSum + testScore;
            j++;
        }
        //Calculate test average
        double testAvg = testSum/j;
        System.out.println();
		
        // Get midterm exam score from the user.
        System.out.print("Enter Midterm exam score: ");
        double midtermScore = in.nextDouble();

        // Get final exam score from the user.
        System.out.print("Enter Final exam score: ");
        double finalScore = in.nextDouble();
			
        //Calculate grade average
        double gradeAvg = (hwAvg * HOMEWORK_WEIGHT) + (testAvg * TEST_WEIGHT) + (midtermScore * MIDTERM_WEIGHT) + (finalScore * FINAL_WEIGHT);
      
        //Determine the letter grade using if/else
        char grade;
        if(gradeAvg >= 90 && gradeAvg <= 100)
        {
            grade = 'A';
        }
        else if (gradeAvg >= 80 && gradeAvg <= 90)
        {
            grade = 'B';
        }
        else if (gradeAvg >= 70 && gradeAvg <= 80)
        {
            grade = 'C';
        }

        else if (gradeAvg >= 60 && gradeAvg <= 70)
        {
            grade = 'D';
        }
        else 
        {
            grade = 'F';
        }

        //Display the average grade to 2 decimal places using printf
        System.out.printf("\nGrade Average: %4.2f", gradeAvg);
	
        //Display the letter grade.
        System.out.println("\nLetter grade: " + grade);
      
        //Output appropriate message using if/else
        if(grade == 'A' || grade == 'B' || grade == 'C')
        {
            System.out.println("Good job! You can advance to the next course.");
        }
        else
        {
            System.out.println("I'm sorry. You will have to repeat the course before advancing.");
        }
        in.close();
    }
}