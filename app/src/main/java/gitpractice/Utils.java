package gitpractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
  public void x() {
    System.out.println("Hello, World!");
  }

  public void x(String name) {
    System.out.printf("Hello, %s!\n", name);
  }

  public Date y() {
    return new Date();
  }

  public String yy() {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss.SSS");
    return sdf.format(y());
  }

}
