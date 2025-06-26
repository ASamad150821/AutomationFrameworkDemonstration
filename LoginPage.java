package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(xpath="//div[@class='form_group'][2]/input")
	private WebElement password;
	
	@FindBy(css="input[type='submit']")
	private WebElement signinbutton;
	
	@FindBy(className="error-message-container")
	private WebElement errormessage;
	
	public WebElement getUsername()
	{
		return username;
	}
	
	public WebElement getPassword()
	{
		return password;
	}
	
	public WebElement getSubmitButton()
	{
		return signinbutton;
	}
	
	public WebElement getErrorMessage()
	{
		return errormessage;
	}
	
}
