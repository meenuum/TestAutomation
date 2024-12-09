package POModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Script {
	
	@FindBy(id="email")
	private WebElement un;
	@FindBy(id="pass")
	private WebElement psw;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement log;
	public Script (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void user(String ung)
	{
		un.sendKeys("UN");
	}
	public void password(String pwd)
	{
		psw.sendKeys(pwd);
	}
	
	public void Button() {
		log.click();
		
		
	}
	public void click() {
		// TODO Auto-generated method stub
		
	}
}
