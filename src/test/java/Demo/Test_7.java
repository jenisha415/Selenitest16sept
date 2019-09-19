package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Test_7 {
  @Test
  public void f() throws IOException {
	  File src=new File("C:\\Jenisha\\Book1.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	  for(int itr=0;itr<10;itr++)
	  {
	  String data0=sheet1.getRow(itr).getCell(0).getStringCellValue();
	  System.out.println("Data from excel is:"+data0);
	  String data1=sheet1.getRow(itr).getCell(1).getStringCellValue();
	  System.out.println("Data from excel is:"+data1);
	  }
	  wb.close();
  }
}
 