package POModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomScript1 {
	@FindBy(id="email")
	private WebElement uName;
	public PomScript1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void PassData() {
		uName.sendKeys("admin");
	}

}
