package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scriptpop {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
	        Thread.sleep(2000);
	        driver.manage().window().maximize();
	        WebElement rclick=driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	        Actions act=new Actions(driver);
	        act.contextClick(rclick).perform();
	        Thread.sleep(2000);
	        Robot r=new Robot();
	        r.keyPress(KeyEvent.VK_T);
	        r.keyPress(KeyEvent.VK_CONTROL);
	        r.keyPress(KeyEvent.VK_SHIFT);
	        r.keyPress(KeyEvent.VK_TAB);
	        r.keyRelease(KeyEvent.VK_T);
	        r.keyRelease(KeyEvent.VK_CONTROL);
	        r.keyRelease(KeyEvent.VK_SHIFT);
	        r.keyRelease(KeyEvent.VK_TAB);
	     //  String s= driver.getWindowHandle();
	       //System.out.println(s);
	       
		Set< String> d=driver.getWindowHandles();
         System.out.println(d);
         int count=d.size();
         System.out.println(count);
	}

}
