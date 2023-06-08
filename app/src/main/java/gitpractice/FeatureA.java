package gitpractice;

public class FeatureA {
  public void execA(String name) {
    Utils utils = new Utils();
    utils.x();
    utils.x(name);
    String currentTime = utils.yy();
    System.out.println(currentTime);
  }
}
