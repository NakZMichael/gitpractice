package gitpractice;

public class FeatureA {
  public void execA(String name) {
    Utils utils = new Utils();
    utils.greeting();
    utils.greeting(name);
    String currentTime = utils.getCurrentDateTimeString();
    System.out.println(currentTime);
  }
}
