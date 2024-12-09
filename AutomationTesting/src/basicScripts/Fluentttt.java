package basicScripts;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.math3.fraction.ProperBigFractionFormat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentttt {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/progress/element?sublist=2");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("1");
		driver.findElement(By.xpath("//button[.='Start']")).click();
		Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement ele=wait.until(new  Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) 
			{
				return driver.findElement(By.xpath("(//select)[2]"));
			}
				
				
			
			
		});
							
				ele.click();
				
	}

	
		
	}


