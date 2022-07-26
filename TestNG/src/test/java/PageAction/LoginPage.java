package PageAction;

import org.openqa.selenium.WebDriver;
import Common.Hooks;
import PageInterface.LoginInterface;
import PageInterface.LoginPageUi;

public class LoginPage {

	public WebDriver driver;
	LoginInterface LoginUi;
	
	public LoginPage()
	{
		LoginUi = new LoginPageUi();
		driver = Hooks.driver;
	}
	
	public LoginPage login(String UserName,String PassWord)
	{
		driver.findElement(LoginUi.getUserName()).sendKeys(UserName);
		driver.findElement(LoginUi.getPassWord()).sendKeys(PassWord);
		driver.findElement(LoginUi.getLoginButton()).click();
		return this;
	}

	
}
