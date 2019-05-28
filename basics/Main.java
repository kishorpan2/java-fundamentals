public class Main{
  // this is the main method rhat runs when we compile or run the code
  public static void main (String [] args){
    System.out.println("Hello World");
    int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
  }
public static String pluralize(String args, int potato){
  if (potato > 1){
    args = args+ "s";
  }
 return args;
}
}