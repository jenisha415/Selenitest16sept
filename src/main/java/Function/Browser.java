package Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Browser {
	static WebDriver driver;
  @Test
  public static WebDriver startBrowser(String browsername,String url) {
	  if(browsername.equals("firefox"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Jenisha\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  else if(browsername.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Jenisha\\new chrome driver\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  driver.manage().window().maximize();
	  driver.get(url);
	  return driver;
  }
}
