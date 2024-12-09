package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot1 {

 


static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	 driver.manage().window().maximize();
    Thread.sleep(2000);
     WebElement rclick=driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
 	Thread.sleep(2000);
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

}


	



	
}
