package gitpractice;

public class Utils {
  public static String fizzbuzz(int num) {
    if (num % 15 == 0) {
      return "fizzbuzz";
    } else if (num % 3 == 0) {
      return "fizz";
    } else if (num % 5 == 0) {
      return "buzz";
    } else {
      return String.valueOf(num + 1);
    }
  }
}
