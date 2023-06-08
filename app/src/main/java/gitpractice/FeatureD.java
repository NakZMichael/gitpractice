package gitpractice;

import java.util.stream.IntStream;

public class FeatureD {
  public void fizzbuzzFrom0To1000() {
    IntStream.range(0, 1000).forEach(i -> Utils.fizzbuzz(i));
  }
}
