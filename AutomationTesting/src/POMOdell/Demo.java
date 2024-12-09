package POMOdell;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POModel.PomScript1;

public class Demo {
@Test
public void validData()
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	PomScript1 p=new PomScript1(driver);
	p.PassData();
	driver.navigate().refresh();
	p.PassData();
	
}
}
