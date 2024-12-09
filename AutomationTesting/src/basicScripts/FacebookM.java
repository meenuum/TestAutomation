package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title1=driver.getTitle();
		if(title1.equals("Facebook FB"))
			System.out.println("Title Matching");
			else
				System.out.println("Title not Matching");
		if(title1.contains("Facebook"))
			System.out.println("Title contains facebook");
		else
			System.out.println("Title doesn't contains facebook");
	}

	
	}


