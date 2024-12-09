package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scriptfdd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
	   WebElement ele=	driver.findElement(By.id("month"));
	    Select s=new Select(ele);
	   List<WebElement>opt=s.getOptions();
	   System.out.println(opt.size());
	   Thread.sleep(2000);
	  WebElement ele1=	driver.findElement(By.id("month"));
	   Select s1=new Select(ele);
	   List<WebElement>opt1=s.getOptions();
	   for (WebElement we : opt1) {
		System.out.println(we.getText());
		//Thread.sleep(3000);
		//driver.close();
		//driver.get("https://www.facebook.com/r.php");
		//WebElement ele3 = driver.findElement(By.id("month"));
	
	//	Select s2=new Select(ele3);
		ArrayList<String>l=new ArrayList<String>();
		 List<WebElement>opt2=s.getOptions();
		for (WebElement we3 : opt2) {
			String text=we3.getText();
			l.add(text);
		}
		Collections.sort(l);
		for(String l1:l)
		{
		System.out.println(l1);
	}
	
	}

	}
}
