package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.Products;
import utilities.Base;

public class LoginEndToEndTest extends Base{

	@Test
	public void SuccessfulLoginTest()
	{
		LoginPage lp = new LoginPage(getdriver());
		lp.getUsername().sendKeys("standard_user");
		lp.getPassword().sendKeys("secret_sauce");
		lp.getSubmitButton().click();
		
        
        Products p = new Products(getdriver());
        Assert.assertTrue(p.getListOfProducts().isDisplayed());
	}
	
	@Test
	public void UnsuccessfulLoginTest1()
	{
		LoginPage lp = new LoginPage(getdriver());
		lp.getUsername().sendKeys("standard_user");
		lp.getPassword().sendKeys("samad");
		lp.getSubmitButton().click();

        
        Products p = new Products(getdriver());
        Assert.assertTrue(p.getListOfProducts().isDisplayed());

	}
	
	@Test
	public void UnsuccessfulLoginTest2()
	{
		LoginPage lp = new LoginPage(getdriver());
		lp.getUsername().sendKeys("standard_user");
		lp.getPassword().sendKeys("samad");
		lp.getSubmitButton().click();
		String errormessage = lp.getErrorMessage().getText();
		System.out.println(errormessage);

	}
			
	
}
