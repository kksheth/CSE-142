/*This program processes an input file of data for a personality test known
as the Keirsey Temperament Sorter. It outputs a 4 letter personality sequence.
*/

import java.util.*;
import java.io.*;

public class Personality {
	public static void main(String[] args) throws FileNotFoundException {
      printIntro();
      Scanner console = new Scanner(System.in);
      System.out.print("input file name? ");
      Scanner input = new Scanner(new File(console.nextLine()));
      System.out.print("output file name? ");
      PrintStream output = new PrintStream(new File(console.nextLine())); 
      
      while(input.hasNextLine()){
         String writeToken = input.nextLine();
         output.print(writeToken + ": ");
         
         writeToken = input.nextLine();
         String FinalInput = writeToken.toUpperCase();
         int[] TotalCounts = getTotalCounts(FinalInput);
         int[] CountB = getCountsB(FinalInput);
         int[] PercentageTotal = calculatePercentageB(TotalCounts, CountB);
         output.print(Arrays.toString(PercentageTotal)); 
         
         String personalityOutput = calculatePersonalityType(PercentageTotal);
         output.print(" = " + personalityOutput);
         output.println();
         
         
      }
      
   }
   
   //print an intro about the program
   public static void printIntro() {
      System.out.println("This program processes a file of answers to the");
      System.out.println("Keirsey Temperament Sorter. It converts the");
      System.out.println("various A and B answers for each person into");
      System.out.println("a sequence of B-percentages and then into a");
      System.out.println("four-letter personality type.");
   }
   
   //gets the number of total counts (which is counts of A and counts of B)
   //excludes answers that were dashes
   public static int[] getTotalCounts(String FinalInput){
      int[] totalCounts = new int[4];
      for (int i = 0; i < FinalInput.length(); i++) {
         if (FinalInput.charAt(i) == 'A' || FinalInput.charAt(i) == 'B') {
                  if (i % 7 == 0) {
                     totalCounts[0]++;
                  }
                  if (i % 7 == 1 || i % 7 == 2) {
                     totalCounts[1]++;
                  }
                  if (i % 7 == 3 || i % 7 == 4) {
                     totalCounts[2]++;
                  }
                  if (i % 7 == 5 || i % 7 == 6) {
                     totalCounts[3]++;
                  }
          }

      }
      //System.out.println(Arrays.toString(totalCounts));
      return totalCounts;
   }
   
   //gets the count of B answers 
   public static int[] getCountsB(String FinalInput){
      int[] countB = new int[4];
      for (int i = 0; i < FinalInput.length(); i++) {
         if (FinalInput.charAt(i) == 'B') {
                  if (i % 7 == 0) {
                     countB[0]++;
                  }
                  if (i % 7 == 1 || i % 7 == 2) {
                     countB[1]++;
                  }
                  if (i % 7 == 3 || i % 7 == 4) {
                     countB[2]++;
                  }
                  if (i % 7 == 5 || i % 7 == 6) {
                     countB[3]++;
                  }
          }

      }
      //System.out.println(Arrays.toString(countB));
      return countB;
   }
  
  //takes total counts and counts of B answers and calculate the percentages of B answers
  public static int[] calculatePercentageB(int[] TotalCounts, int[] CountB){
      int[] percentageTotal = new int[4];
   
   int questionTotal = 10;
   for(int i = 0; i < 4; i++){
      if( i != 0){
         questionTotal = 20;
      }
      percentageTotal[i] = (int) Math.round((100 * (CountB[i]* 1.0 / (TotalCounts[i]))));
      
   }  
   //System.out.println(Arrays.toString(percentageTotal));
   return percentageTotal;
   
   }
   
   //looks at the percentages of B to designate the letter for personality type
   public static String calculatePersonalityType(int[] PercentageTotal){
      String personalityResult = "";
      String[] ifSmallerThan50 = {"E", "S", "T", "J"}; 
      String[] ifBiggerThan50 = {"I", "N", "F", "P"};
      for (int i = 0; i < 4; i++) {
         if (PercentageTotal[i] < 50) {
            personalityResult += ifSmallerThan50[i];
         } else if (PercentageTotal[i] > 50){
            personalityResult += ifBiggerThan50[i];
         } else {
            personalityResult += "X";
         }
      
      }
      return personalityResult;
   }
   
   
}



   
  