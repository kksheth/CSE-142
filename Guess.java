//This program is an interactive guessing game
//After each guess, it will tell you if the number is higher or lower
//than your guess. 

import java.util.*;

public class Guess {

   public static void main(String[] args) {
      giveIntro();
      Scanner console = new Scanner(System.in);
      playGame(console);
          
   }
   
   //introduces the program to the user
   public static void giveIntro(){
      System.out.println("This program allows you to play a guessing game.");
      System.out.println("I will think of a number between 1 and");
      System.out.println("100 and will allow you to guess until");
      System.out.println("you get it. For each guess, I will tell you");
      System.out.println("whether the right answer is higher or lower");
      System.out.println("than your guess.");
      System.out.println();
   }
   
   //prompts until a number in the proper range is entered 
   public static int getGuess(Scanner console){
      int guess = getInt(console, "Your guess? ");
      while (guess < 0 || guess >= 101) {
         System.out.println("Out of range. Try again!");
         guess = getInt(console, "Your guess? ");
      }
      
      return guess;
   }
   
   //prompts until a valid number is entered
   public static int getInt(Scanner console, String prompt) {
      System.out.print(prompt); 
      while (!console.hasNextInt()) {
         console.next(); //to discard the input
         System.out.println("Not an integer. Try again!");
         System.out.print(prompt);
         
      }
      return console.nextInt();
   }
  
   public static void playGame(Scanner console){
      //pick a random number from 0 to 100 inclusive
      Random rand = new Random(); 
      int number = rand.nextInt(101); 
      
      //get first guess
      System.out.println("I'm thinking of a number between 1 and 100...");
      System.out.print("Your guess? ");
      int guess = console.nextInt();
      int numGuesses = 1; 
      
      //hints 
      while (guess != number) {
          if (guess < number) {
            System.out.println("It's higher");
          }
          else if (guess > number) {
            System.out.println("It's lower");
          }
         guess = getGuess(console);
         numGuesses++;
      }
      
      System.out.println("You got it right in " + numGuesses + " guesses.");
      //ask if they want to play again
      System.out.println("Do you want to play again? ");
      String answer = console.next();
      if (answer.equalsIgnoreCase("yes")){
         playGame(console);
      } else {
         System.out.println("You have finished playing.");
      }

  }

}
