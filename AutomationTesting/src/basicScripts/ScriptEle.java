package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptEle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     Thread.sleep(2000);
    WebElement ele= driver.findElement(By.xpath("//a[text()='Payments']"));
      String text=ele.getText();
      System.out.println(text);
      WebElement ele1=driver.findElement(By.xpath("//a[text()='Shopsy']"));
      String title=ele1.getAttribute("aria-label");
      System.out.println(title);
      WebElement ele2=driver.findElement(By.xpath("//a[text()='Cancellation & Returns']"));
      Point p=ele2.getLocation();
      Thread.sleep(3000);
     
	}
}

