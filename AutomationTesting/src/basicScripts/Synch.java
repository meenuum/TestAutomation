package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synch {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");
		 WebDriverWait wait=new WebDriverWait(driver, 5);
		WebElement ele = driver.findElement(By.xpath("//button[.='Start']"));
		ele.click();
     // WebDriverWait wait=new WebDriverWait(driver, 5);
		//wait.until(ExpectedConditions.visibilityOf(ele));
		//ele.click();
		//ele.sendKeys("Start");
		driver.findElement(By.xpath("//button[.='Reset']")).click();
	
		
//		driver.get("https://demoapps.qspiders.com/ui/progress/element?sublist=2");
//		WebDriverWait wait=new WebDriverWait(driver, 5);
//      	WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']"));
//		wait.until(ExpectedConditions.visibilityOf(ele));
//		ele.sendKeys("5");
//		WebElement el = driver.findElement(By.xpath("//button[.='Start']"));
//		el.click();
//		WebDriverWait wait1=new WebDriverWait(driver, 5);
//		
//		wait.until(ExpectedConditions.visibilityOf(el));
//		
//		WebElement ele1 = driver.findElement(By.xpath("//section[@class='py-3 border-t-[1px]']"));
//		
//		
//		wait.until(ExpectedConditions.visibilityOf(ele1));
//
//		File src=el.getScreenshotAs(OutputType.FILE);
//		File dst=new File("./photos/image.jpg");
//		FileHandler.copy(src, dst);
//		
		
	}

}
