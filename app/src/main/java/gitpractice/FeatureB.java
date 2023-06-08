package gitpractice;

public class FeatureB {
  public void execB(String name) {
    Utils utils = new Utils();
    utils.x();
    utils.x(name);
    String currentTime = utils.yy();
    System.out.println(currentTime);
  }
}
