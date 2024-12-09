package basicScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptPo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://skpatro.github.io/demo/links/");
	       Thread.sleep(2000);
	       driver.findElement(By.name("NewWindow")).click();
	       String p_id=driver.getWindowHandle();
	       Set<String> allw=driver.getWindowHandles();
	       System.out.println(allw.size());
	       allw.remove(p_id);
	       System.out.println(allw.size());
	       for (String wh: allw) {
	       driver.switchTo().window(wh);
	       
	       for (String w : allw) {
	    	   driver.switchTo().window(wh);
	    	   String title=driver.getTitle();
			   if(title.equals("Browser Windows")) {
				   driver.close();
			   }
		}
	       
	      
			
		}
	}

}
