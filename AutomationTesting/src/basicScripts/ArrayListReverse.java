package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArrayListReverse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		  WebElement ele = driver.findElement(By.id("month"));

		Thread.sleep(2000);
		 Select s=new Select(ele);
		ArrayList<String>l=new ArrayList<String>();
		 List<WebElement>opt2=s.getOptions();
		for (WebElement we3 : opt2) {
			String text=we3.getText();
			l.add(text);
		}
		Collections.sort(l,Collections.reverseOrder());
		for(String l1:l)
		{
		System.out.println(l1);
	}
	
	}

	}


