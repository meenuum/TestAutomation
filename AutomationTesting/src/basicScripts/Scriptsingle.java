package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scriptsingle {

	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Users/Admin/Desktop/html/single.html");
	  WebElement ele = driver.findElement(By.id("nandanas"));
	 
	Select s=new Select(ele);
	s.selectByIndex(1);
	Thread.sleep(2000);
	s.selectByValue("2");
	Thread.sleep(2000);
	s.selectByVisibleText("pualo");
	Thread.sleep(2000);
	//s.deselectAll();
	
	Thread.sleep(2000);
	driver.get("file:///C:/Users/Admin/Desktop/html/multiple.html");
	 
     Thread.sleep(2000);
     boolean b= s.isMultiple();
    
    if(b)
    {
    	System.out.println("This is multi select dropdown");
    }
    else {
    	System.out.println("This is not multi select dropdown");
    }
	}

}
