package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_2 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Jenisha\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
	  WebElement resize=driver.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
	  Actions action=new Actions(driver);
	  action.dragAndDropBy(resize, 400, 200).build().perform();
	  driver.close();
  }
}
