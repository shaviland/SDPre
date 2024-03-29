import java.util.Scanner;

public class BMICategories {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double bmi, heightft, heightin, weight, m, kg, in;

    System.out.print( "Enter your height (feet only): ");
    heightft = keyboard.nextDouble();

    System.out.print( "Enter your height (inches): ");
    heightin = keyboard.nextDouble();

    System.out.print( "Enter your weight: ");
    weight = keyboard.nextDouble();

    in = heightft * 12 + heightin;

    m = in * 0.0254;

    kg = weight * 0.453592;

    bmi = kg / (m*m);

    System.out.print( "BMI category: ");
    if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
    }
    else if (bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
    }
    else if (bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    else if (bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }
    else if (bmi < 30.0 ) {
      System.out.println( "overweight" );
    }
    else if (bmi < 35.0 ) {
      System.out.println( "moderately obese" );
    }
    else if (bmi < 40.0 ) {
      System.out.println( "severely obese" );
    }
    else {
      System.out.println( "very severely/\"morbidly\" obese" );
    }
  }
}
