//This program creates a figure using * and $ 

public class DollarFigure {
    
   public static void main(String[] args){
      for (int line = 1; line <= 7; line++) {
         for (int i = 1; i <= (2 * line - 2); i++) {
            System.out.print("*");
         }
         
         for (int i = 1; i <= (8 - line); i++) {
            System.out.print("$");
         }
         
         for (int i = 1; i <= (16 - 2 * line); i++) {
            System.out.print("*");
         }
         
         for (int i = 1; i <= (8 - line); i++) {
            System.out.print("$");
         }
         
         for (int i = 1; i <= (2 * line - 2); i++) {
            System.out.print("*");
         }
         
      System.out.println();
      
      }
   }
}
