package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptWebA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		WebElement ele1=driver.findElement(By.id("email"));
		Thread.sleep(2000);
		boolean b=ele1.isEnabled();
		if(b)
		{
			System.out.println("element enabled");
		}
		else {
			System.out.println("element disabled");
		}
		WebElement ele=driver.findElement(By.xpath("//section[text()='Popups']"));
		
		Thread.sleep(2000);
	    boolean b1= ele.isDisplayed();
		if(b1)
		{
			System.out.println("element displayed");
		}
		else
		{
			System.out.println("element not displayed");
		}
		WebElement ele2=driver.findElement(By.id("password"));
		boolean b2=ele2.isSelected();
		if(b2)
		{
			System.out.println("element selected");
		}
		else
		{
			System.out.println("element not selected");
		}
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		Dimension d=new Dimension(500,500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		Point p=new Point(500,200);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
}

