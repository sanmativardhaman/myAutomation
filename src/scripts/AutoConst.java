/*In java interface is the best method to store constants
 * 
 * We store file paths and driver paths in this interface as value 
 * of these interfaces wont change
 * 
 */

package scripts;

public interface AutoConst
{
	public static final String GD_KEYVALUE="webdriver.gecko.driver";

	public static final String CD_KEYVALUE="webdriver.chrome.driver";

	public static final String XL_PATH="./data/input.xlsx";
	
	public static final String CD_PATH="./driver/chromedriver.exe";
	
	public static final String GD_PATH="./driver/geckodriver.exe";
	
}
