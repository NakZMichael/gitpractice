package gitpractice;

import java.util.stream.IntStream;

public class FeatureA {
  public void fizzBuzzFrom0To100() {
    IntStream.range(0, 100).forEach(i -> Utils.fizzbuzz(i));
  }
}
