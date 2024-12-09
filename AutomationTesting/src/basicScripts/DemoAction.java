package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
		 driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
	        Thread.sleep(2000);
	        WebElement candhold= driver.findElement(By.id("circle"));
	        Thread.sleep(2000);
	        Actions act4=new Actions(driver);
	        act4.clickAndHold(candhold).perform();

	}

}
