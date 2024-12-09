package basicScripts;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptSe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/html/text.html");
		Thread.sleep(2000);
		
	    WebElement ele=driver.findElement(By.id("a1"));
	    Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.id("a3"));
		ele1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement ele2=driver.findElement(By.id("a2"));
		ele2.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement ele3=driver.findElement(By.id("a1"));
		ele3.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		WebElement ele4=driver.findElement(By.id("a3"));
		ele4.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);
		WebElement ele5=driver.findElement(By.id("a2"));
		ele5.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.close();
	}

}
