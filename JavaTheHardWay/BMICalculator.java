import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double inches, in, feet, pounds, m, kg, bmi;

    System.out.print( "your height (feet only): ");
    feet = keyboard.nextDouble();

    System.out.print( "Your height (inches): " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();

    in = feet * 12 + inches;

    m = in * 0.0254;
    kg = pounds * 0.453592;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " +bmi);
  }
}
