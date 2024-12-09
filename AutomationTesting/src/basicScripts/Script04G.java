package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script04G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/maps/@13.0012817,77.5487917,15z?entry=ttu&g_ep=EgoyMDI0MTAxMy4wIKXMDSoASAFQAw%3D%3D");
        driver.findElement(By.xpath("//input[@aria-expanded=falsebv ']")).sendKeys("Bangalore");
        driver.findElement(By.xpath("//body[@class='LoJzbe keynav-mode-off TbqDH']")).click();
	}
}