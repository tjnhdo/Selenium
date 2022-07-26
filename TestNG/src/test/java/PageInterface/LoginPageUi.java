package PageInterface;

import org.openqa.selenium.By;

public class LoginPageUi implements LoginInterface {

	@Override 
	public By getUserName()
	{
		return By.name("uid");
	}
	
	@Override 
	public By getPassWord()
	{
		return By.name("password");
	}
	
	@Override 
	public By getLoginButton()
	{
		return By.name("btnLogin");
	}
	
	@Override 
	public By getResetButton()
	{
		return By.name("btnReset");
	}
}
