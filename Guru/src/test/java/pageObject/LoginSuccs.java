package pageObject;

import org.openqa.selenium.By;

import Utility.BrowserManager;

public class LoginSuccs 
{

	public boolean loginverify()
	{
		return BrowserManager.getDriver().findElement(By.linkText("Manager")).isDisplayed();
	}
}
