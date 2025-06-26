package stepDefinitions;

import io.cucumber.core.cli.Main ;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.Products;
import utilities.Base;
import utilities.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginPageStepDefinitions{

	private LoginPage lp;
    private Products p ;
    private WebDriver driver = Hooks.driver;
	
	@Given("that I have navigated to the login page")
	public void thatIhavenavigatedtotheloginpage(){
		
		lp = new LoginPage(driver);

	}
	
	@When("I enter my username")
	public void i_enter_my_username() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(lp.getUsername()));
		
		lp.getUsername().sendKeys("standard_user");
	}

	@When("I enter my password")
	public void i_enter_my_password() {
		lp.getPassword().sendKeys("secret_sauce");
	}
	
	@When("I click on the submit button")
	public void i_click_on_the_submit_button() {
		lp.getSubmitButton().click();
	}

	@Then("I will be navigated to the products page")
	public void i_will_be_navigated_to_the_products_page() {
		
        p = new Products(driver);

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(p.getListOfProducts()));
		
        Assert.assertTrue(p.getListOfProducts().isDisplayed());
	}
	
	@When("I enter an incorrect password")
	public void i_enter_an_incorrect_password() {
		lp.getPassword().sendKeys("samad");
	}
	

	@Then("I will see an error message")
	public void i_will_see_an_error_message() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(lp.getErrorMessage()));
		
		Assert.assertTrue(lp.getErrorMessage().isDisplayed());
}
	
}
