package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
   By signin=By.partialLinkText("SignIn");
   By name=By.name("userName");
   By password=By.name("password");
   By login=By.name("Login");
 
public Login(WebDriver driver) {
	 this.driver=driver;
   }
   public void loginuser(String user,String pass)
   {
    driver.findElement(signin).click();
    driver.findElement(name).sendKeys(user);
    driver.findElement(password).sendKeys(pass);
    driver.findElement(login).click();
   }
}
