package basicScripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileup1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://demoapps.qspiders.com/ui/fileUpload/drag?sublist=2");
//		WebElement ele = driver.findElement(By.id("fileInput"));
//		ele.sendKeys("C:\\Users\\Admin\\Desktop\\manual.xlsx");
		
		
		
		
		
//		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
//		WebElement ele = driver.findElement(By.id("fileInput"));
//		ele.sendKeys("C:\\Users\\Admin\\Desktop\\manual.xlsx");
//				
		
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=ym&activity=header-mail&pspid=2114723002&done=https%3A%2F%2Fin.mail.yahoo.com%2Fd%3F.intl%3Din%26.lang%3Den-IN%26pspid%3D2114723002%26activity%3Dheader-mail&add=1");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("login-username")).sendKeys("srilakshmim@myyahoo.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("Sri@9606764183");
		driver.findElement(By.id("login-signin")).click();
		
		driver.findElement(By.xpath("//a[.='Compose']")).click();
		driver.findElement(By.id("message-to-field")).sendKeys("srilakshmi.mg01@gmail.com");
		driver.findElement(By.id("compose-subject-input")).sendKeys("hello");
		driver.findElement(By.xpath("//span[.='Send']")).click();
		
	}

}
