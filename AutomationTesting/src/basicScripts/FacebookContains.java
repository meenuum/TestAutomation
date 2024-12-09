package basicScripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookContains {

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
		String t=we.getText();
		a.add(t);
	}
	if(a.contains("Nov"))
	{
		System.out.println("option present");
	}
	else
	{
		System.out.println("option not present");
	}
	
	
	
	a.remove("Nov");
	for (String a1 : a) {
		System.out.println(a1);
	
	}
	
	}

}
