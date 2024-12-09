package basicScripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchro {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/pageLoad");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();
		String p_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		System.out.println(allwh);
		allwh.remove(p_id);
		System.out.println(allwh);
		for(String s: allwh) {
			driver.switchTo().window(s);	
		 driver.findElement(By.id("email")).sendKeys("srilakshmi.mg01@gmail.com");
		 driver.findElement(By.xpath("//button[.='Subscribe']")).click();
	}

}
}
