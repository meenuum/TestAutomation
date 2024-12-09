package basicScripts;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ArrayTypecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/r.php");
	       WebElement ele=driver.findElement(By.id("month"));
	       Select s=new Select(ele);
	      
		List<WebElement> opt=s.getOptions();
		ArrayList<String>a=new ArrayList<String>();
		for(WebElement we:opt) {
			String b=we.getText();
			a.add(b);
		}
			TreeSet<String> t=new TreeSet<String>(a);
			for (String t2 : t) {
				System.out.println(t2);
			}
		

	}

}
