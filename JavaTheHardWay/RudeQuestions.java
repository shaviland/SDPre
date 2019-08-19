import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name;
    int age, pets;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name?");
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you?");
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old.");
    System.out.print( "How much do you weigh, " + name + "?");
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!");
    System.out.print( "Finally, what's your income, " + name + "?");
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour");
    System.out.println( " and not per year!");
    System.out.println( "I lied, one more. How many pets do you have?");
    pets = keyboard.nextInt();

    System.out.println( pets + "? Well that's not nearly enough. You need more.");
    System.out.print( "Well, thanks for answering my rude questions, ");
    System.out.println( name + ".");
    // line 18 didn't blow up when I put 110 instead of 110.0. I believe it's because doubles can work with intergers or doubles
    // line 1 didn't blow up when I typed in 17 because string puts the interger into the string. it reads it as if it's in "".
    /* question 1 blew up with ronnin 4571.3345!$ because it can't handle both a string and a double
      question 2 blew up with 31.5 because intergers can't handle doubles
      question 3 blew up with 130lbs because doubles can't handle strings
      question 3 blew up with 55.5K because doubles can't handle strings*/
  }
}
