/*	For every page we need to write POM, class, name of the POM class
 * should be same as Title of page ending with word page
 * 
 */

package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage
{
	//declaration of all the web elements in the page
	
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement unTextBox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwdTexBox;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	@FindBy(xpath="//div[contains(.,'Login failed')]")
	private WebElement errorMsg;
	
	
	
	
	// initialization 
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
		PageFactory.initElements(driver, this);
		
	}

	//utilization
	
	public void setUserName(String uname)
	{
		unTextBox.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		pwdTexBox.sendKeys(pwd);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	public void verifyErrorMessageDisplayed()
	{
		Assert.assertTrue(errorMsg.isDisplayed());
	}
	
	
}
