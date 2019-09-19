package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Function.Browser;
import PageObject.Login;
public class Case_1 {
	WebDriver driver;
  @Test
  public void test() {
	  WebDriver driver=Browser.startBrowser("chrome","http://10.232.237.143:443/TestMeApp");
	  Login log=new Login(driver);
	  log.loginuser("lalitha","password123");
  }
}
