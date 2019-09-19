package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_4 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Jenisha\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  WebElement search=driver.findElement(By.id("myInput"));
	  search.sendKeys("c");//(Or) search.sendKeys("car");
	  search.sendKeys("a");
	  search.sendKeys("r");
	  Actions act=new Actions(driver);
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Handy carry')]"))).click().build().perform();
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	  String text=driver.findElement(By.xpath("//h4[contains(text(),'Handy carry')]")).getText();
	  Assert.assertTrue(text.contains("Handy carry")); 
      System.out.println(text);
	    //WebElement search=driver.findElement(By.id("myInput"));
		//search.sendKeys("b");
		//search.sendKeys("a");
		//search.sendKeys("g");
		//Actions act1=new Actions(driver);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
		//driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		//String text=driver.findElement(By.xpath("//h4[contains(text(),'Hand bag')]")).getText();
		//Assert.assertTrue(text.contains("Hand bag")); 
		//System.out.println(text);
 }
}
