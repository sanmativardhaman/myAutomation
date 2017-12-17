/*	This is testNG class for valid login logout
 * 
 */
package scripts;

//import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import generics.Excel;

import org.testng.annotations.Test;

import pom.HomePage;
import pom.LoginPage;

public class ValidLoginLogOut extends BaseTest
{
	
	@Test
	public void testValidLoginLogOut() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		String userName=Excel.getCellValue(XL_PATH,"ValidLoginLogOut", 1, 0);
		String userPassword=Excel.getCellValue(XL_PATH, "ValidLoginLogOut", 1, 1);
		
		//String homePage=Excel.getCellValue(XL_PATH,"ValidLoginLogOut",1, 2);
		String loginPage=Excel.getCellValue(XL_PATH,"ValidLoginLogOut",1, 3);
		
		// call the methods
		
		LoginPage lp=new LoginPage(driver);
		
		//enter user name
		lp.setUserName(userName);
		
		//enter password
		lp.setPassword(userPassword);
		
		//click on submit button
		lp.clickLoginButton();
		
		
		
		//verify home page title
		
		HomePage hp=new HomePage(driver);
		
		//hp.verifyImage
		
		//hp.verifyImageDisplayed();		
		
		//click on helpMenu link
		
		hp.clickHelp();
		
		//click on logOut link
		
					
		hp.clickOnlogout();
		
		//verify login page title
		
		lp.verifyTitle(loginPage);
		
		
	}

}
