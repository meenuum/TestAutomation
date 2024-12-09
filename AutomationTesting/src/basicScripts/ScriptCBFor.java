package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptCBFor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/html/cb.html");
		Thread.sleep(2000);
	  List<WebElement>ints=	driver.findElements(By.xpath("//input"));
	    int count =ints.size();
        for(int i=0;i<count;i++)
	 {
	   ints.get(i).click();
		 Thread.sleep(2000);
		 
	 }
        for(int i=count-1;i>=0;i--)
   	 {
   	   ints.get(i).click();
   		 Thread.sleep(2000);
   		 
   	 }
        
        
	}

}
