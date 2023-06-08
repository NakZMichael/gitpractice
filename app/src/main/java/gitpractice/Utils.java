package gitpractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
  public void greeting() {
    System.out.println("Hello, World!");
  }

  public void greeting(String name) {
    System.out.printf("Hello, %s!\n", name);
  }

  public Date getCurrentDateObject() {
    return new Date();
  }

  public String getCurrentDateTimeString() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss.SSS");
    return sdf.format(getCurrentDateObject());
  }

}
