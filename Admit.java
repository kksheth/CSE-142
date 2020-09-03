//This program compares two applicants using SAT and ACT scores to see which applicant is better.

import java.util.*;

public class Admit{

   public static void main(String[] args) {
      giveIntro();
      Scanner console = new Scanner(System.in); 
      System.out.println("Information for applicant #1:");
      double score1 = ExamScores(console);
      double GPAScore1 = GPA(console);
      double overallScore1 = score1 + GPAScore1;
      System.out.println("\nInformation for applicant #2:");
      double score2 = ExamScores(console);
      double GPAScore2 = GPA(console);
      double overallScore2 = score2 + GPAScore2;
      reportResults(overallScore1, overallScore2);
   }
   
   //introduces the program to the user
   public static void giveIntro() {
      System.out.println("This program compares two applicants to");
      System.out.println("determine which one seems like the stronger");
      System.out.println("applicant. For each candidate I will need");
      System.out.println("either SAT or ACT scores plus a weighted GPA");
      System.out.println();
   }
   
   //Figures out statistics for SAT or ACT scores and returns score
   public static double ExamScores(Scanner console) {
      System.out.print("\tdo you have 1) SAT scores or 2) ACT scores? ");
      int SatOrAct = console.nextInt();
      if (SatOrAct == 1){
         System.out.print("\tSAT math? ");
         int SatMath = console.nextInt();
         System.out.print("\tSAT critical reading? ");
         int SatCR = console.nextInt();
         System.out.print("\tSAT writing? ");
         int SatWriting = console.nextInt();
         double SATScore = SatScore(SatMath, SatCR, SatWriting);
         System.out.printf("\texam score = %3.1f", SATScore);
         return SATScore;
      } else {
         System.out.print("\tACT English? ");
         int ActEnglish = console.nextInt();
         System.out.print("\tACT Math? ");
         int ActMath = console.nextInt();
         System.out.print("\tACT Reading? ");
         int ActReading = console.nextInt();
         System.out.print("\tACT Science? ");
         int ActScience = console.nextInt();
         double ACTScore = ActScore(ActEnglish, ActMath, ActReading, ActScience);
         System.out.printf("\texam score = %3.1f", ACTScore);
         return ACTScore;
      }
       
   }
   
   //figures out statistics for GPA and returns GPA score
   public static double GPA(Scanner console){
      System.out.print("\n\toverall GPA? ");
      double OverallGPA = console.nextDouble();
      System.out.print("\tmax GPA? ");
      double MaxGPA = console.nextDouble();
      System.out.print("\tTranscript Multiplier? ");
      double TranscriptMultiplier = console.nextDouble();
      double GPAScore = GpaScore(OverallGPA, MaxGPA, TranscriptMultiplier);
      System.out.printf("\tGPA score = %3.1f", GPAScore);
      return GPAScore;
   }
   
   //Calculation for SAT score
   public static double SatScore(int SatMath, int SatCR, int SatWriting) {
      return (2 * SatMath + SatCR + SatWriting) / 32;
   }
   
   //Calculation for ACT score
   public static double ActScore(int ActEnglish, int ActMath, int ActReading, int ActScience) {
      return (ActEnglish + (2 * ActMath) + ActReading + ActScience) / 1.8;
   }   
   
   //Calculation for GPA score
   public static double GpaScore(double OverallGPA, double MaxGPA, double TranscriptMultiplier) {
      return (OverallGPA/ MaxGPA) * TranscriptMultiplier * 100;
   }
   
   //Reports overall score results (Exam score + GPA score) and reports status
   //on which applicant is better
   public static void reportResults(double overallScore1, double overallScore2){
      System.out.printf("\nFirst applicant overall score = %3.1f\n", overallScore1);
      System.out.printf("Second applicant overall score = %3.1f\n", overallScore2);
      reportStatus(overallScore1, overallScore2);
   }
   
   //figures out which applicant is better based on overall score
   public static void reportStatus(double overallScore1, double overallScore2){
      if (overallScore1 > overallScore2) {
         System.out.println("The first applicant seems to be better");
      } else {
         System.out.println("The second applicant seems to be better");
      }
   }
   

}
