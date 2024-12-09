package basicScripts;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreesetType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/r.php");
	       WebElement ele=driver.findElement(By.id("month"));
	       Select s=new Select(ele);
	      
		   List<WebElement> opt=s.getOptions();
	       TreeSet<String>t =new TreeSet<String>();
	       for (WebElement we : opt) {
			String a=we.getText();
			t.add(a);
			
		}
	       ArrayList<String>a=new ArrayList<String>(t);
          for (String s1 : a) {
			System.out.println(s1);
		}
	}
}

