package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_5 {
	WebDriver driver;
  @Test
  public void f() throws AWTException {
	  Robot robot = new Robot();
		System.setProperty("webdriver.chrome.driver","C:\\Jenisha\\new chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
	
		driver.get("file:///C:/Jenisha/fileupload.html");
		System.out.println("text");
		driver.findElement(By.name("resumeupload")).click();
		robot.setAutoDelay(1000);
		String path="C:\\Jenisha\\Sept_17.txt";
		StringSelection sel = new StringSelection(path);
	
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
  }
}
