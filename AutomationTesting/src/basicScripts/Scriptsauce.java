package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scriptsauce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.saucedemo.com/v1/");
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
	   driver.findElement(By.id("login-button")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//img[@src='./img/sauce-backpack-1200x1500.jpg']")).click();
        WebElement ele=   driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        String title= ele.getText();
        System.out.println(title);
        WebElement ele1=driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
        String title1=ele1.getText();
        System.out.println(title1);
       driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
       WebElement el=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
       String tet=el.getText();
       System.out.println(tet);
       WebElement e = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
      String tex= e.getText();
      System.out.println(tex);
      if(ele==el)
      {
    	  System.out.println("product matching");
      }
      else
      {
    	  System.out.println("product is not matching");
      }
	
      
      if(ele1==e)
      {
    System.out.println("price matching");	  
      }
      else
      {
    	  System.out.println("price not matching");
      }
      driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
      driver.findElement(By.id("logout_sidebar_link")).click();
	}

}
