import java.util.Scanner;

public class Objective3Lab5{
  public static void main( String[] args){
  double numberA, numberB, sum;
  Scanner input = new Scanner(System.in);

  System.out.println("Please enter a number:");
  numberA = input.nextDouble();

  System.out.println("Please enter another number:");
  numberB = input.nextDouble();

  sum = numberA + numberB;
  System.out.println("The sum of " + numberA + " + " + numberB + " = " + sum);
  input.close();
  }
}
