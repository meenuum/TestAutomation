package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("input[id='email']")).sendKeys("srilakshmi.mg01@gmail.com");
	    driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("9606764183");
	    driver.findElement(By.cssSelector("button[name='login']")).click();
	    
	    
	    
	    

	}

}
