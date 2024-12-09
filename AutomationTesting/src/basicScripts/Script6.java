package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
		driver.get("https://www.youtube.com/watch?v=f5SWgUiY5_Q");
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("manju true tech");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='yt-spec-button-shape-next yt-spec-button-shape-next--tonal yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m yt-spec-button-shape-next--icon-leading yt-spec-button-shape-next--segmented-start yt-spec-button-shape-next--enable-backdrop-filter-experiment']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer'and@aria-label='Magic chair video editing in kannada-Tiktok video editing tutorial on kinemaster-Magic video kannda by Manju true tech 1,051 views 4 years ago 2 minutes, 2 seconds']")).click();
		}

}
