package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptpassname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/html/passname.html");
    List<WebElement> inputs	=driver.findElements(By.xpath("//input"));
    Thread.sleep(2000);
    int count=inputs.size();
		for(int i=0;i<count-1;i++)
		{
			WebElement we=inputs.get(i);
			we.sendKeys("meena");
			Thread.sleep(2000);
		}
		for(int i=count-1; i>=0;i--)
		{
			
			inputs.get(i).clear();
			Thread.sleep(2000);
		}
		
	}

}
