package POM3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic3.Gener;

public class POM  extends Gener{
	@FindBy(id="email")
	private WebElement un;
	@FindBy(id="pass")
	private WebElement psw;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement log;
	public POM (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void user(String ung)
	{
		un.sendKeys(ung);
	}
	public void password(String pwd)
	{
		psw.sendKeys(pwd);
	}
	
	public void Button() {
		log.click();
		
		
	}

}
