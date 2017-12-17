/* Excel class is used to getLastRowCount and getCellValue from the excel sheet.
 * 
 */

package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel
{

	// This method will return Number of row in an excel sheet
	public static int getRowCount(String path,String sheet)
	{
		int rCount=0;
		try
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			rCount=wb.getSheet(sheet).getLastRowNum();
		}
		
		catch(Exception e)
		{
			
		}
		
		return rCount;
	}
	
	
	// this method will return value present in the cell
	
	public static String getCellValue(String filePath,String sheetName,int rowNumber,int cellNumber)
	{
		String value="";
		try
		{
			FileInputStream fis=new FileInputStream(filePath);
			Workbook wb=WorkbookFactory.create(fis);
			value=wb.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).toString();
		}
		
		catch(Exception e)
		{
			
		}
		
		return value;
	}
}
