package Demo;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Sign_in {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Jenisha\\new chrome driver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://10.232.237.143:443/TestMeApp");
	  driver.findElement(By.linkText("SignIn")).click();
	  
	  File src=new File("C:\\Jenisha\\Book1.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	  String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	  driver.findElement(By.name("userName")).sendKeys(data0);
	  System.out.println("Data from excel is:"+data0);
	  String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
	  driver.findElement(By.name("password")).sendKeys(data1);
	  System.out.println("Data from excel is:"+data1);
	  driver.findElement(By.name("Login")).click();
	  //driver.findElement(By.linkText("SignOut")).click();
	  //WebDriverWait wait=new WebDriverWait(driver,100);
	  driver.navigate().back();
	  driver.findElement(By.name("userName")).clear();
	  wb.close();
  }
}
