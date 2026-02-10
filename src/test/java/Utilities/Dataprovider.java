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
	}


