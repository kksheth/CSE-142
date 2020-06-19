public class Homework1{

    public static void dog(){
      System.out.println("She swallowed the dog to catch the cat,");
      cat();
   } 

   public static void cat(){
      System.out.println("She swallowed the cat to catch the bird,");
      bird();
   } 
   
   public static void bird(){
      System.out.println("She swallowed the bird to catch the spider,");
      spider();
   }
   
   public static void spider(){
      System.out.println("She swallowed the spider to catch the fly,");
      whySheSwallowedThatFly();
   }
   
   public static void whySheSwallowedThatFly(){
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      System.out.println();
   }

   public static void main(String[] args){
      System.out.println("There was an old woman who swallowed a fly.");
      whySheSwallowedThatFly();
      System.out.println("There was an old woman who swallowed a spider, \nThat wriggled and iggled and jiggled inside her.");
      spider();
      System.out.println("There was an old woman who swallowed a bird, \nHow absurd to swallow a bird.");
      bird();
      System.out.println("There was an old woman who swallowed a cat, \nImagine that to swallow a cat.");
      cat();
      System.out.println("There was an old woman who swallowed a dog, \nWhat a hog to swallow a dog.");
      dog();
      System.out.println("There was a woman who swallowed a horse, \nShe died of course.");
      
   
   }
}
