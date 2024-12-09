package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScri {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
		WebElement ele=	driver.findElement(By.xpath("//a[text()='About Us']"));
		Point p=ele.getLocation();
		int x1=p.getX();
	    int y1=p.getY();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy("+x1+","+y1+")");
		ele.click();
		//Thread.sleep(2000);
		//driver.close();

	

}
}