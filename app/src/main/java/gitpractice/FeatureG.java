package gitpractice;

import java.util.stream.IntStream;

public class FeatureG {
  public void fizzbuzzFrom0To100() {
    IntStream.range(0, 100).forEach(i -> Utils.fizzbuzz(i));
  }
}
