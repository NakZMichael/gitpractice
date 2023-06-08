package gitpractice;

public class Utils {
  public static String fizzbuzz(int num) {
    return num % 15 == 0 ? "fizzbuzz" : num % 3 == 0 ? "fizz" : num % 5 == 0 ? "buzz" : String.valueOf(num);
  }
}
