public class ClubBouncer {
  public static void main( String[] args ) {
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
      System.out.println("You are allowed to enter the club.");
    }
    else {
      System.out.println("You are not allowed to enter the club.");
    }
  }
}
//It doesn't compile because the else doesn't make sense without an if statement immediately before it.
