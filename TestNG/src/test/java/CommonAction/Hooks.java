package CommonAction;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class Hooks {

  public static WebDriver driver;
  
  @BeforeSuite
  @Parameters({"browser","url"}) 
  public void openBrowser(String browser, String baseUrl) throws Throwable {
	Path root = Paths.get(".").normalize().toAbsolutePath();
	if (browser.equalsIgnoreCase("chrome"))
	{
	  	System.setProperty("webdriver.chrome.driver",root.toString() + "\\Driver\\chromedriver.exe");
	  	System.out.print(root.getFileSystem().getSeparator());
	  	ChromeOptions options = new ChromeOptions();
	  	options.addArguments("--lang=de");
	  	driver = new ChromeDriver(options);
	  	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  	driver.manage().deleteAllCookies();
	  	driver.manage().window().maximize();
	}
	
  	driver.get(baseUrl);
  }

  @AfterSuite
  public void embedScreenshot() {
      driver.quit(); 
  }
  
  public static WebDriver getDriver(){
	    return driver;
	}
}
