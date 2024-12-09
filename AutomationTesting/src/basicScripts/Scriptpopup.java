package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scriptpopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.selenium.dev/");
	        WebElement ele = driver.findElement(By.xpath("//span[.='Downloads']"));
	        WebElement ele1= driver.findElement(By.xpath("//span[.='Documentation']"));
	        WebElement ele2= driver.findElement(By.xpath("//span[.='Projects']"));
	        WebElement ele3= driver.findElement(By.xpath("//span[.='Support']"));
	       
	      ArrayList<WebElement>l=new ArrayList<WebElement>();
	      l.add(ele);
	      l.add(ele1);
	      l.add(ele2);
	      l.add(ele3);
	      Actions act=new Actions(driver);
	      Robot r=new Robot();
	      for(WebElement we:l) {
	      act.contextClick(we).perform();
	      r.keyPress(KeyEvent.VK_T);
	      r.keyRelease(KeyEvent.VK_T);
	      }
	      Set<String>allwh=driver.getWindowHandles();
	      ArrayList<String>a=new ArrayList<String>(allwh);
	      String val=a.get(1);
	      driver.switchTo().window(val);
	      String s=driver.getTitle();
	      System.out.println(s);
	     
	       
	        


	}

}
