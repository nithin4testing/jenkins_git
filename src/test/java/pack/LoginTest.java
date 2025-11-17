package pack;

import org.testng.annotations.Test;

public class LoginTest {
WebDriver Driver;
  @Test
  public void show() {
	  System.out.println("Jenkins Introducing");
  }
  @Test
  public void launchBrowser() {
	  driver=new EdgeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
  }
}
