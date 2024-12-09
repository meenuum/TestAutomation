package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScriptFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe" );
     WebDriver driver=new ChromeDriver();
     driver.get("file:///C:/Users/Admin/Desktop/html/Mainpage.html");
    WebElement usn= driver.findElement(By.xpath("//input[@type='text']"));
    usn.sendKeys("admin");
    Thread.sleep(2000);
  //  driver.switchTo().frame(usn);
    WebElement f1=driver.findElement(By.xpath("//iframe[@id='f1']"));
    		driver.switchTo().frame(f1);
    WebElement pwd=driver.findElement(By.xpath("//input[@type='text']"));
    pwd.sendKeys("admin@1212");
	}

}
