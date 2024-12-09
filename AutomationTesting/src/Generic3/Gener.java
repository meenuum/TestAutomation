package Generic3;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class Gener {
	 public WebDriver driver;
	@BeforeClass
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	public void login()
	{
		driver.get("https://www.facebook.com/");
		}
	@AfterMethod
	public void Screenshot() throws IOException
	{
		//public static void getPhoto(WebDriver driver) throws IOException
		
		String photo="./photos/";
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":","-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+d2+"j.png");
		FileHandler.copy(src, dst);
	}
    
		
	
	@AfterClass
    public void close()
    {
    	driver.close();
    	
    }
 
}
