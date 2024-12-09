package POMOdell;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;




   public class Runn
    {
    @Test
	public void Flipkart()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com/");
	    POModel.Flipkart f = new POModel.Flipkart(driver);
	    f.search("oppo");
	    f.button();
	    f.phone();
	    Set<String>all=driver.getWindowHandles();
	    for(String wn:all)
	    {
	    	driver.switchTo().window(wn);
	    }
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1000)");
	}

}
