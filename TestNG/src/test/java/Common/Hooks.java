package Common;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class Hooks {

  public static WebDriver driver;
  
  @BeforeMethod
  public void openBrowser() throws Throwable {
  	//System.setProperty("webdriver.gecko.driver","C:/Users/GS-0886/geckodriver.exe");
	Path root = Paths.get(".").normalize().toAbsolutePath();
  	System.setProperty("webdriver.chrome.driver",root.toString() + "\\Driver\\chromedriver.exe");
  	System.out.print(root.getFileSystem().getSeparator());
  	ChromeOptions options = new ChromeOptions();
  	options.addArguments("--lang=de");
  	driver = new ChromeDriver(options);
  	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  	driver.manage().deleteAllCookies();
  	driver.manage().window().maximize();
  	driver.get("https://demo.guru99.com/V4/");
  }

  @AfterMethod
  public void embedScreenshot() {
      driver.quit();
      
  }
}
