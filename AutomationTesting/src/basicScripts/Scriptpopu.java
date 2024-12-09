package basicScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptpopu {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	      driver.get("https://www.google.com/");
	      driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']")).click();
	      Set<String>s=driver.getWindowHandles();
	      System.out.println(s);
	      
	       
	}

}
