
/*	Base page class we store common elements and method
 * 
 */
package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public abstract class BasePage
{

	public WebDriver driver;
	
	// initialize the constructor
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
	}
	
	
	public void verifyTitle(String eTitle)
	{
		String aTitle=driver.getTitle();
		
		Assert.assertEquals(aTitle, eTitle);
	}
	
}
