
package scripts;

//import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst
{

	public WebDriver driver;
	
	@BeforeMethod
	
	public void preCondition() throws InterruptedException
	{
		System.setProperty(CD_KEYVALUE,CD_PATH);
		
		driver=new ChromeDriver();
		
		//System.setProperty(GD_KEYVALUE,GD_PATH);
		
		//driver=new FirefoxDriver();
		
		driver.get("https://apps.rackspace.com/index.php");
		
		//driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	
	public void postCondition()
	{
		driver.close();
	}
	
	
	
}
