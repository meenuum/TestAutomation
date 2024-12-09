package basicScripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptdemopop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//a[.='Open in new window']")).click();
	       Thread.sleep(2000);
	   ////  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("srilakshmi.mg01");
	     //Thread.sleep(2000);
	      
	       Set<String>allwh=driver.getWindowHandles();
		      ArrayList<String>a=new ArrayList<String>(allwh);
		      String val=a.get(1);
		      driver.switchTo().window(val);
	      	   Thread.sleep(2000);
	    	   driver.close();
	    	   Thread.sleep(2000);
	    	   
	    	   String p_id=driver.getWindowHandle();
	    	   driver.switchTo().window(p_id);
	    	   driver.findElement(By.xpath("//a[.='New Tab']")).click();
	    	  
	    	   
			
		}
	       

	}


