package basicScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://skpatro.github.io/demo/links/");
	       Thread.sleep(2000);
	       driver.findElement(By.name("NewWindow"));
	       Thread.sleep(2000);
	      Set<String>allwh= driver.getWindowHandles();
	      System.out.println(allwh.size());
	      for (String wh : allwh) {
	    	  System.out.println(wh);
	    	  
	      }  
	       Thread.sleep(2000);
		   driver.findElement(By.name("NewWindow")).click();
		   Thread.sleep(2000);
		    Set<String>allw= driver.getWindowHandles();
		    for (String wh : allwh) {
		    driver.switchTo().window(wh);
		    System.out.println(driver.getTitle());
		    Thread.sleep(2000);
		    } 
		    
		    String p_id=driver.getWindowHandle();
			Set<String>all =driver.getWindowHandles();	
			for (String wh: all) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		    Thread.sleep(2000);
		    if(wh.equals(p_id)) {
		    driver.close();
		    }
			}
			}
	    	  
	}
		
	


