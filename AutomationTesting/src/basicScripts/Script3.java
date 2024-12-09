package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("srilakshmi.mg01@gmail.com");
		driver.findElement(By.name("password")).sendKeys("9606764183");
		Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	//	driver.close();
	}

}