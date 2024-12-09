package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptMultQspi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
         Thread.sleep(2000);
         WebElement fra=driver.findElement(By.xpath("//iframe[1]"));
         driver.switchTo().frame(fra);
         Thread.sleep(2000);
         driver.findElement(By.id("email")).sendKeys("Srilakshmi.mg01");
         driver.findElement(By.id("password")).sendKeys("9606764183");
         driver.findElement(By.id("confirm-password")).sendKeys("9606764183");
         driver.switchTo().defaultContent();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//iframe[@class='w-1/2'][2]"));
         driver.findElement(By.id("username")).sendKeys("srilakshmi");
         driver.findElement(By.id("password")).sendKeys("9606764183");

         
         		}

}
