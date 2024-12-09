package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptTF {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/html/textfield.html");
		driver.findElement(By.id("a1")).sendKeys("selenium");
		driver.findElement(By.id("a2")).sendKeys("selenium");
		driver.findElement(By.id("a3")).sendKeys("selenium");
		driver.findElement(By.id("a4")).sendKeys("selenium");
		driver.findElement(By.id("a5")).sendKeys("selenium");
	
	    WebElement ele1=driver.findElement(By.id("a1"));
		ele1.sendKeys(Keys.CONTROL+"ax");
		WebElement ele2=driver.findElement(By.id("a2"));
		ele2.sendKeys(Keys.CONTROL+"ax");
		WebElement ele3=driver.findElement(By.id("a3"));
		ele3.sendKeys(Keys.CONTROL+"ax");
		WebElement ele4=driver.findElement(By.id("a4"));
		ele4.sendKeys(Keys.CONTROL+"ax");
		WebElement ele5=driver.findElement(By.id("a5"));
		ele5.sendKeys(Keys.CONTROL+"ax");
		
		

	}

}
