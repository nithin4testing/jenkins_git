package pack;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
WebDriver driver;
  @Test
  public void show() {
	  System.out.println("Introducing Github");
  }
  @Test
  public void launchBrowser() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
  }
}
