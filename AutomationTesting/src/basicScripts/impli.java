package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class impli {
	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));
		driver.findElement(By.id("email")).sendKeys("srilakshmi.mg01@gmail.com");
		driver.close();*/
		
	/*	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		WebDriverWait wait1=new WebDriverWait(driver1, 10);
		wait1.until(ExpectedConditions.urlContains("https://www.facebook.com/"));
		WebElement ele = driver1.findElement(By.id("email"));
		ele.sendKeys("srilakshmi.mg01@gmail.com");*/
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		WebElement ele = driver1.findElement(By.id("email"));
		WebDriverWait wait1=new WebDriverWait(driver1, 10);
		wait1.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys("srilakshmi.mg01@gmail.com");
		
		
		
		
	}
	
	

}
