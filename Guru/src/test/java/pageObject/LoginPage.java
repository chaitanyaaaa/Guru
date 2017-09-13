package pageObject;

import org.openqa.selenium.By;

import Utility.BrowserManager;

public class LoginPage 
{
//	BrowserManager.getDriver().get("http://www.demo.guru99.com/V4/");
	
	By user_name = new By.ByName("uid");
	By password = new By.ByName("password");
	By submit = new By.ByName("btnLogin");
	
	public LoginPage()
	{
		BrowserManager.getDriver().get("http://www.demo.guru99.com/V4/");
	}
	
	public void GuruLogin()
	{
		BrowserManager.getDriver().findElement(user_name).sendKeys("mngr96746");
		BrowserManager.getDriver().findElement(password).sendKeys("urytYvy");
		BrowserManager.getDriver().findElement(submit).click();
	}
}
