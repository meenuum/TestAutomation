package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/");
      WebElement ele= driver.findElement(By.xpath("//span[text()='Fashion']"));
       Actions act=new Actions(driver);
       act.moveToElement(ele);
       driver.get(" http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
       Thread.sleep(3000);
       WebElement src = driver.findElement(By.id("box3"));
       WebElement dst = driver.findElement(By.id("box103"));
       Actions act1=new Actions(driver);
       act1.dragAndDrop(src, dst).perform();
       Thread.sleep(2000);
       driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement dClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions act2=new Actions(driver);
        act2.doubleClick(dClick).perform();
        Thread.sleep(2000);
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(2000);
        WebElement rclick = driver.findElement(By.xpath("\\span[text()=' right click me']"));
        Actions act3=new Actions(driver);
        act3.contextClick(rclick).perform();
        driver.close();
       	}

}
