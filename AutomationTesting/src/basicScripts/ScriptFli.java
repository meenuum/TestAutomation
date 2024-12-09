package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScriptFli {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("oppo mobiles");
	     Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//img[@alt='OPPO K12x 5G with 45W SUPERVOOC Charger In-The-Box (Breeze Blue, 128 GB)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}
