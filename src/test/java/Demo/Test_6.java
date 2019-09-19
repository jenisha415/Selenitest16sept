package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_6 {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Jenisha\\new chrome driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  String sText=js.executeScript("return document.title;").toString();
	  System.out.println(sText);
	  driver.findElement(By.linkText("SignIn")).click();
	  WebElement user=driver.findElement(By.name("userName"));
	  Actions action=new Actions(driver);
	  action.moveToElement(user).click().keyDown(user,Keys.SHIFT).sendKeys(user,"sha")
	  .keyUp(user,Keys.SHIFT)
	  .doubleClick(user)
	  .contextClick()
	  .build().perform();
  }
}
