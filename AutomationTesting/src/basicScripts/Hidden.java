package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='dateText']")).click();
		driver.findElement(By.xpath("//span[text()='21']")).click();
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("srilakshmi");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("srilakshmi.mg01@gmail.com");
		driver.findElement(By.id("hiddendiv")).click();
		
        driver.get("https://demoapps.qspiders.com/ui/fileUpload");
        Thread.sleep(2000);
       WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
       ele.sendKeys("C:\\Users\\Admin\\Desktop\\FacebookCredientals.xlsx\\");
        
	}

}
