// This program takes a String and an integer and prints the String the given number of times in the output

import java.util.*;
import java.io.*;

public class printStrings {
	public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      System.out.print("What do you want to print? ");
      String text = console.nextLine();
      System.out.print("How many times do you want to print it? ");
      int number = console.nextInt();
      PrintStream output = new PrintStream(new File("printStrings.txt")); 
      
      //prints the String a certain number of times
      for (int i = 0; i < number; i++) {
         output.println(text);
      }
   }
}
