package gitpractice;

import java.util.stream.IntStream;

public class FeatureE {
  public void fizzbuzzFrom0To10000() {
    IntStream.range(0, 10000).forEach(i -> Utils.fizzbuzz(i));
  }
}
