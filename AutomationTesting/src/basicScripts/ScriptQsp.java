package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptQsp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
         driver.get("https://demoapps.qspiders.com/ui?scenario=1");
        //driver.manage().window().maximize();
       Thread.sleep(2000);
        
        driver.findElement(By.xpath("//section[text()='Text Field']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Srilakshmi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//section[text()='Button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//section[text()='Radio Button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='attended']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//section[text()='Check Box']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='domain2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//section[text()='Toggle']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//span[@class='absolute left-[3px] top-[2px] translate-x-5 inline-block w-3 h-3 transition duration-300 ease-in-out transform bg-white border border-gray-300 rounded-full']")).click();)
     
        driver.findElement(By.xpath("//section[text()='Link']")).click();
        Thread.sleep(2000); 
        driver.get("https://demoapps.qspiders.com/ui/toggle?sublist=0");
        driver.findElement(By.xpath("//span[@class='relative bg-gray-300 rounded-full w-9 h-4 transition duration-300 ease-in-out']")).click();
        Thread.sleep(2000);
       
        
	}

}
