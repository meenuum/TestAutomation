package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotS {
       
	

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		Robot r=new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_D);
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://www.google.com/");
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_ALT);
		r1.keyPress(KeyEvent.VK_F4);
		r1.keyRelease(KeyEvent.VK_ALT);
		r1.keyRelease(KeyEvent.VK_F4);
		
		
		
		
		
		
		
		
	}
}
