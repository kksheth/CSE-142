public class Homework2_6 {

   public static void main(String[] args){
      drawBase();
      drawLine();
      drawTop();
      drawBottom();
      drawLine();
      drawBottom();
      drawTop();
      drawLine();
      drawBase();
   }
   
   public static void drawLine(){
      System.out.print("+");
      for (int i = 1; i <= 6; i++){
         System.out.print("=*");
      }
      System.out.print("+");
      System.out.println();
   }
   
   public static void drawBase(){
      for (int line = 1; line <= 5; line++){
         for (int i = 1; i <= (6-line); i++){
            System.out.print(" ");
         }
         for (int i = 1; i <= line; i++){
            System.out.print("/");
         } 
         System.out.print("**");
         for (int i = 1; i <= line; i++){
            System.out.print("\\");
         }
         for (int i = 1; i <= (6-line); i++){
            System.out.print(" ");
         }
         System.out.println();
      }
      
   }
   
   public static void drawTop(){
      for (int line = 1; line <=3; line++){
         System.out.print("|");
         for (int i = 1; i <= (3-line); i++){
            System.out.print(".");
         }
         for (int i = 1; i <= line; i++){
            System.out.print("/\\");
         }
         for (int i = 1; i <= (6 - 2 * line); i++){
            System.out.print(".");
         }
         for (int i = 1; i <= line; i++){
            System.out.print("/\\");
         }
         for (int i = 1; i <= (3-line); i++){
            System.out.print(".");
         }
         System.out.print("|");
         System.out.println();
      }
      
   }
   
   public static void drawBottom(){
      for (int line = 1; line <=3; line++){
         System.out.print("|");
         for (int i = 1; i <= (line-1); i++){
            System.out.print(".");
         }
         for (int i = 1; i <= (4 - line); i++){
            System.out.print("\\/");
         }
         for (int i = 1; i <= (2 * line - 2); i++){
            System.out.print(".");
         }
         for (int i = 1; i <= (4 - line); i++){
            System.out.print("\\/");
         }
         for (int i = 1; i <= (line - 1); i++){
            System.out.print(".");
         }
         System.out.print("|");
         System.out.println();
      }
      
   }
  
   
}
