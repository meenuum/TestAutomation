package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demoapps.qspiders.com/ui/browser");
	       Thread.sleep(2000);
	       driver.findElement(By.id("browserLink1")).click();
	       Thread.sleep(1000);
	       
	      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("srilakshmi.mg01@gmail.com");
	       Thread.sleep(2000);

	       driver.findElement(By.id("password")).sendKeys("9606764183");
	       Thread.sleep(2000);

	       driver.findElement(By.id("confirm-password")).sendKeys("9606764183");
	       Thread.sleep(2000);

	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	}

}
