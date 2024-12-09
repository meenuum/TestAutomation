package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screens {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.id("email"));
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ele.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\Admin\\Documents\\New folder\\image1.png");
		FileHandler.copy(src, dst);
		driver.close();
		

	}

	
}
