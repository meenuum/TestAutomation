package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptShopp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(25000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[text()='100% Natural Premium| Premium Badam...']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@id='Buy Now']")).click();
	
//		driver.findElement(By.xpath("//span[text()='add to cart']")).click();)
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("srilakshmi@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9606764183");
		driver.findElement(By.xpath("//button[@id='login']")).click();
	    
	}

}
