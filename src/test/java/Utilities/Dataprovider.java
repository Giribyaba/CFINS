  package Utilities;

import java.util.Objects;

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

@DataProvider(name="RejectCandidate")
	public Object[][] getRejectCandidateData()
	{
	return Excelutil.getcelldate(System.getProperty("user.dir")+"/testdata/RejectCandidate.xlsx","Sheet1");
}

@DataProvider(name="AddEmployee")
public Object[][] getaddEmployeeData()
{
	return Excelutil.getcelldate(System.getProperty("user.dir")+"/testdata/AddEmployee.xlsx","Sheet1");
	
	
}
}


