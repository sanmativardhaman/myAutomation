package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage
{
	//Declaration of all the web elements
	
	@FindBy(xpath="//div[@class='bar_container']")
	private WebElement helpMenu;
	
	@FindBy(linkText="Log Out")
	private WebElement logOutLink;
	
	
	
	@FindBy(xpath="//img[@class='wm_logo']")
	private WebElement imageRackspace;
	
	

	public HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);	
		
	}
	
	//utilization
	
	public void clickHelp() throws InterruptedException
	{
		Thread.sleep(4000);
		helpMenu.click();
	}
	
		
	public void clickOnlogout() throws InterruptedException
	{
		Thread.sleep(4000);
		logOutLink.click();
	}
	
	public void verifyImageDisplayed()
	{
		Assert.assertTrue(imageRackspace.isDisplayed());
	}
	
}
