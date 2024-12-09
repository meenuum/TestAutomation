package POMOdell;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POModel.Script;

public class Run {
	@Test
	public void FB()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Script s=new Script(driver);
		s.user("admin");
		s.password("@123");
		s.click();
		
		
		
	}

}
