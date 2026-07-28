  package Utilities;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	
	@DataProvider(name="logindata")
	public Object[][] getlogindata()
	{
		return new Object[][]
				{
			     {"Admin", "admin234","invlid"},
			     {	"Admin", "admin234","invlid"},
			    
			     {" ", " ","invalid"},
			     {"Admin","admin123","valid"}
			    	 
			     };
			     
		
	}

@DataProvider(name="LoginExcelData")
public Object[][] getExceldata()
{
	
	
	return Excelutil.getcelldate(System.getProperty("user.dir") +"/testdata/LogintestData.xlsx","Sheet1");
	
}

@DataProvider(name="AddCandidateData")
public Object[][] getCandidateData()
{
	return Excelutil.getcelldate(System.getProperty("user.dir")+"/testdata/AddCandidateData.xlsx","Sheet1");
}
}


