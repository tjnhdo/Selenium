package TestCase_LoginFunction;

import org.testng.annotations.Test;
import CommonAction.Hooks;
import PageAction.LoginPage;

class TC_Login extends Hooks{
	LoginPage login;
  @Test
  public void login_Valid_User() {
	  login = new LoginPage();
	  login.login("mngr428305", "arAnupE");
  }
  
  private TC_Login ()
  {
	  
  }
}
