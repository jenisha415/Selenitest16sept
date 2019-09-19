package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_3 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Jenisha\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  WebElement allcategories=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"));
	  Actions act=new Actions(driver);
	  act.moveToElement(allcategories).click().build().perform();
	  WebDriverWait wait=new WebDriverWait(driver,100);
	  WebElement electronics=driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a"));
	  wait.until(ExpectedConditions.elementToBeClickable(electronics));
	  act.moveToElement(electronics).click().build().perform();
	  wait=new WebDriverWait(driver,100);
	  WebElement headphones=driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"));
	  wait.until(ExpectedConditions.elementToBeClickable(headphones));
	  act.moveToElement(headphones).click().build().perform();
	  
  }
}
