package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("srilakshmi.mg01@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9606764183");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    		
				
				

	}

}
