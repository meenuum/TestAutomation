package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptAdd {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.facebook.com/");
	      WebElement ele=driver.findElement(By.id("email"));
	       int h=  ele.getSize().getHeight();
	       System.out.println(h);
	       int w=ele.getSize().getWidth();
	       System.out.println(w);
	       driver.get("https://www.youtube.com/");
	       
         WebElement ele1=driver.findElement(By.id("search"));
         Thread.sleep(2000);
         String fsize=ele1.getCssValue("font-size");
         System.out.println(fsize);
         driver.quit();
	}

}
