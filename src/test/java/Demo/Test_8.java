package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Test_8 {
  @Test
  public void f() throws IOException  {
	  File src=new File("C:\\Jenisha\\Book1.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	for(int itr=4;itr<6;itr++) {
	  sheet1.getRow(0).createCell(itr).setCellValue("jass");
	  sheet1.getRow(1).createCell(itr).setCellValue("rose");}
	  FileOutputStream fo=new FileOutputStream(src);
	  wb.write(fo);
	  wb.close();
 }
}
