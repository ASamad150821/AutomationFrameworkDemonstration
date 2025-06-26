package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

public static WebDriver driver ;
	
	
	@Before()
	public void SetUp()
	{
		
        System.setProperty("webdriver.gecko.driver", "/Users/mohammedsamad/Documents/geckodriver");

        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox");

        driver = new FirefoxDriver(options);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
	}
	
	
	@After()
	public void TearDown()
	{
		driver.quit();
	}
}
