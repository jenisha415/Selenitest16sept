package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_1 {
	WebDriver driver;
	String ExpectedResult="selenium";
  @BeforeClass
  public void beforeClass()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Jenisha\\chromedriver.exe");
	  driver=new ChromeDriver();
  }
  @Test
  public void f() {
	  //System.out.println("Logged in successfully");
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  driver.findElement(By.name("q")).submit();
	  //driver.findElement(By.linkText("Gmail")).click();
	  Assert.assertEquals(ExpectedResult,driver.getTitle());
  }
  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }
}
