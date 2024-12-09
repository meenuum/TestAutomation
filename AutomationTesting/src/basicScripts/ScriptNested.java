package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
	     WebDriver driver=new ChromeDriver();
	     driver.get("file:///C:/Users/Admin/Desktop/html/usn.html");
	     WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
	     usn.sendKeys("admin");
	     driver.switchTo().frame(0);
	     WebElement pwd=driver.findElement(By.xpath("//input[@type='text']"));
	     pwd.sendKeys("meena");
	     driver.switchTo().frame(0);
	   WebElement mob=  driver.findElement(By.xpath("//input[@type='text']"));
	   mob.sendKeys("9632587412");
	   driver.switchTo().frame(0);
       WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
	   email.sendKeys("srilakshmi.mg");
	   
	   
	   driver.switchTo().parentFrame();
	   mob.clear();
	   driver.switchTo().defaultContent();
	   usn.clear();
	     

	}

}
