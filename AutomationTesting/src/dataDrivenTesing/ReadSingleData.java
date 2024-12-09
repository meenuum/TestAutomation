package dataDrivenTesing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRangeCopier;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadSingleData {
  public static void main(String[] args) throws IOException, InterruptedException {
	FileInputStream fis=new FileInputStream("./Testdata/FacebookCredientals.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	XSSFRow row=sheet.getRow(1);
	XSSFCell cel=row.getCell(0);
	String val=cel.getStringCellValue();
	System.out.println(val);
	workbook.close();
	fis.close();
	Thread.sleep(2000);
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(val);
	driver.findElement(By.id("pass")).sendKeys("admin@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.close();
}
}
