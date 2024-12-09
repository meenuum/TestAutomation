package basicScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.get("https://demo.guru99.com/test/delete_customer.php");
	     driver.findElement(By.name("cusid")).sendKeys("abcdf");
	     driver.findElement(By.name("submit")).click();
	    
	     org.openqa.selenium.Alert a = driver.switchTo().alert();
	   	
	     System.out.println(a.getText());
	     
	     a.dismiss();
	     a.accept();
	     
	     

	}

}
