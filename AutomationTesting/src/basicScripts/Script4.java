package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("raja telugu movie");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='search-icon-legacy")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
		Thread.sleep(2000);
		//driver.close();
	
		
		
	}

}
