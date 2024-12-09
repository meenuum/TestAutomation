package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demopop {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
          driver.get("https://demoapps.qspiders.com/ui/scroll");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
          Set<String>allwh=driver.getWindowHandles();
	      ArrayList<String>a=new ArrayList<String>(allwh);
	      String val=a.get(1);
	      driver.switchTo().window(val);
	      Thread.sleep(2000);
           WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
          ele.sendKeys(Keys.SPACE);
          Thread.sleep(2000);
          driver.findElement(By.xpath("//button[.='Accept Our Policy']")).click();
          TakesScreenshot ts=(TakesScreenshot)driver;
          File src=ts.getScreenshotAs(OutputType.FILE);
          File dst=new File("./photos/image.jpg");
          FileHandler.copy(src, dst);
          driver.quit();
          

	}

}
