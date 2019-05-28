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
flipNHeads(5);
  }
// this method pluralize the animals
public static String pluralize(String args, int potato){
  if (potato > 1){
    args = args+ "s";
  }
 return args;
}
// this method will count the heads in a row 
public static void flipNHeads(int n){
int count =0;
int temp =n;
do {//https://www.mkyong.com/java/java-generate-random-integers-in-a-range/
double randomNum = (Math.random() * ((1 - 0) + 1)) + 0;
String apple;
// need a random number generator function to generate numbers from 0 - 1
if (randomNum >=0.5){
apple = "head";
temp--;
count++;
}
else{
apple = "tail";
temp = n;
count++;
}
System.out.println(apple);
}
  
while(temp!=0);
System.out.println("It took" +" "+count +" flips to get " + n + " heads in a row.");
}


}