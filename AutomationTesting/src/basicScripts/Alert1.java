package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		driver.findElement(By.id("buttonAlert5")).click();
		Alert b = driver.switchTo().alert();
		System.out.println(b.getText());
		a.accept();
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		driver.findElement(By.id("buttonAlert1")).click();
		Alert c = driver.switchTo().alert();
		c.sendKeys("yes");
		c.accept();
		driver.close();
	}

}
