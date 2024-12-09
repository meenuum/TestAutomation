package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child {
	public static void main(String[] args) throws AWTException {
		
	
	 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://demoapps.qspiders.com/ui?scenario=1");
     Robot r=new Robot();
     r.keyPress(KeyEvent.VK_T);
     r.keyRelease(KeyEvent.VK_T);
     
     driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
	String s=driver.getWindowHandle();
    Set<String>all=	driver.getWindowHandles();
    for(String wn:all) {
    	driver.switchTo().window(wn);
    }
    driver.switchTo().window(s);	
    }

}
