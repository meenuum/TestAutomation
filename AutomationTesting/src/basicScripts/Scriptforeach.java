package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptforeach {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
        List<WebElement> links=driver.findElements(By.xpath("//a"));
        for(WebElement we:links) {
	    System.out.println(we.getText());
	    
	  List<WebElement>links1 =driver.findElements(By.xpath("//a"));
	    for(WebElement we2:links1)
	    {
	    	System.out.println(we.getAttribute("href"));
	    }
	  List<WebElement>images=driver.findElements(By.xpath("//img"));
	   for(WebElement we1:images) {
	   	System.out.println(we1.getAttribute	("src"));
	    }
	   
}
        
	}


}
