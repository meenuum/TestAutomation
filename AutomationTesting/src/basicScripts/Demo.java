package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/html/Testing.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.tagName("a"));
		ele.click();		
    driver.findElement(By.tagName("a")).click()	;
    driver.findElement(By.id("a1")).click()	;
    driver.findElement(By.name("n1")).click();
    }
	

}
