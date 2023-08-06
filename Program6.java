//********************************************************************
//
//  Author:        Summer Davis
//
//  Program #:     Six
//
//  File Name:     Program6.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Description:   This program calculates and displays the average
//                 of six test scores, all integers, after the lowest
//                 score has been dropped.
//  
//
//********************************************************************
import java.util.Scanner; 

public class Program6
{
   Scanner input = new Scanner(System.in);
   
   //***************************************************************
   //
   //  Method:       main
   // 
   //  Description:  The main method of the program.
   //
   //  Parameters:   A String Array
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public static void main(String[] args)
   {
      Program6 object = new Program6();
	  
      int test1 = 0;
	  int test2 = 0;
      int test3 = 0;
      int test4 = 0;
      int test5 = 0;
      int test6 = 0;
	  int lowest = 0;
	  double average = 0.0;
		 
      developerInfo();
      displayMessage();

      // Call getScore once for each of the six test scores
      test1 = object.getScore("Please enter the 1st test scores: ");
      test2 = object.getScore("Please enter the 2nd test scores: ");
      test3 = object.getScore("Please enter the 3rd test scores: ");
      test4 = object.getScore("Please enter the 4th test scores: ");
      test5 = object.getScore("Please enter the 5th test scores: ");
      test6 = object.getScore("Please enter the 6th test scores: ");
	  
	  // Call findLowest to find and return the lowest
      lowest = object.findLowest(test1, test2, test3, test4, test5, test6);

      // Call calcAverage to calculate and return the average
      average = object.calcAverage(test1, test2, test3, test4, test5, test6, lowest);
   
      // Print the average to two decimal places
      object.printAverage(lowest, average);

   } // End of the main method

   //***************************************************************
   //
   //  Method:       displayMessage
   // 
   //  Description:  This method displays a message to screen 
   //
   //  Parameters:   None
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public static void displayMessage()
   {
      System.out.print("This program calculates and displays ");
      System.out.println("the average of six test");
      System.out.print("scores, all integers, after the lowest ");
      System.out.println("score has been dropped. \n");
   }
   
      //***************************************************************
   //
   //  Function:     getScore
   // 
   //  Description:  collects a score from the user
   //
   //  Parameters:   String
   //
   //  Returns:      int
   //
   //**************************************************************
   public int getScore(String prompt)
   {   // collect score from user
	   System.out.print(prompt);
	   int score = input.nextInt();
	   
	   // validate that the score is between 0-100
	   while (score < 0 || score > 100) {
		   // remind user of score requirements
		   System.out.println("\nScores must be between 0-100\n");
		   // ask user to resubmit score
		   System.out.print(prompt);
		   score = input.nextInt();
	   }
	   
	   // return score
	   return score;
	   
   }// end of the getScore method
   
   //***************************************************************
   //
   //  method:       calcAverage
   // 
   //  Description:  calculates the average of the five highest scores
   //				 (the lowest score is dropped)
   //
   //  Parameters:   int (7)
   //
   //  Returns:      double
   //
   //**************************************************************
   public double calcAverage(int s1, int s2, int s3, int s4, int s5, int s6, int lowest)
   {   // create array of scores
	   double average = ((s1 + s2 + s3 + s4 + s5 + s6) - lowest) / 5;
	   
	   // calculate average and use cast to return as a double
	   return average;
 
   } // end of calcAverage method

   //***************************************************************
   //
   //  method:       findLowest
   // 
   //  Description:  finds the lowest int from six int arguments passed
   //
   //  Parameters:   int (6)
   //
   //  Returns:      int 
   //
   //**************************************************************
   public int findLowest(int s1, int s2, int s3, int s4, int s5, int s6)
   {   // create an array of the passed scores
	   int[] scores = {s1, s2, s3, s4, s5, s5};
	   // set lowest score to the zeroth index
	   int lowest = scores[0];
	   
	   // loop through scores array to find lowest score
	   for (int counter = 0; counter < scores.length; counter++) {
		   if (scores[counter] < lowest) {
			   lowest = scores[counter];
		   }
	   }
	   
	   // return lowest score
	   return lowest;

   } // end of the findLowest method
   
   //***************************************************************
   //
   //  Method:       printAverage
   // 
   //  Description:  This method prints the average of the test scores 
   //
   //  Parameters:   average
   //                lowest
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public void printAverage(int lowest, double average)
   {
	   System.out.printf("%n%-35s %-5d", "Lowest Test Score (Dropped):", lowest);
	   System.out.printf("%n%-35s %-5.1f", "Average Test Score:", average);

   } // end of printAverage method

   
   //***************************************************************
   //
   //  Method:       developerInfo
   // 
   //  Description:  The developer information method of the program
   //
   //  Parameters:   None
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public static void developerInfo()
   {
      System.out.println("Name:    Summer Davis");
      System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
      System.out.println("Program: Six \n");

   } // End of the developerInfo method

} // End of Program6

