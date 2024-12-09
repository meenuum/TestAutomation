package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollScr {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(2000);
	  WebElement ele= driver.findElement(By.xpath("//a[text()='Careers']"));
	  Point p=ele.getLocation();
	  int x1=p.getX();
	  int y1=p.getY();
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0, "+y1+")");
	  File src=ele.getScreenshotAs(OutputType.FILE);
	  File dst=new File("./photos/im.jpg");
	  FileHandler.copy(src, dst);
	  js.executeScript("window.scrollBy(0, "+(-y1)+")");
//	  TakesScreenshot ts=(TakesScreenshot)driver;
//	  File src1=ts.getScreenshotAs(OutputType.FILE);
//	  File dst1=new File("./photos/ima.jpg");
//	  
//	  FileHandler.copy(src1, dst1);
	  }

	}


