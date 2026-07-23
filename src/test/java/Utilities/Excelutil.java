package Utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutil {

	public static Object[][] getcelldate(String path , String sheetname) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=	new FileInputStream(path);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet  sheet=wb.getSheet(sheetname);
			int rowCount = sheet.getPhysicalNumberOfRows();
			int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			
			
			Object [][] data=new Object[rowCount-1][colCount];
			
			for(int i=1;i<rowCount;i++)
			{
				for(int j=0;j<colCount;j++)
				{
					data[i-1][j]=sheet.getRow(i).getCell(j).toString();
				}
			}
			
			wb.close();
			return data;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
			
			
		}
	}