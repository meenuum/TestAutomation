package POModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart 
{	
 
	@FindBy(xpath="//input[@placeholder='Search for Products, Brands and More']")
	private  WebElement mob;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement ser;
	
	@FindBy(xpath="//div[.='OPPO Find X8 5G (Star Grey, 256 GB)']")
	private WebElement phone;
	@FindBy(xpath="//button[@type='button']")
	private WebElement buy;
	
	public Flipkart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void search(String ele)
	{
		mob.sendKeys(ele);	
	}
	public void button() {
		ser.click();
	}
	public void phone()
	{
		phone.click();
	}
	public void shop()
	{
		buy.click();
	}
}

	
	
	

	
	
		
		
	
	
	
	
