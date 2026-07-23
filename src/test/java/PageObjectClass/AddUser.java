package PageObjectClass;

public class AddUser {
	
	public static String adminbtm="//span[.='Admin']";
	public static String adminPage="//h6[.='Admin']";
	public static String addbtm="//button[.=' Add ']";
	public static String UserMangPage="//span[.='User Management ']";
	public static String userRole="//label[.='User Role']/../../div[.='-- Select --']";//dropdown we need to select the "ESS"
	public static String EmpName="//input[@placeholder='Type for hints...']";
	public static String status="//label[.='Status']/../../..//div[.='-- Select --' and @class='oxd-select-text-input']";// dropdoen we need to select the Gireesha 
	public static String username="//input[@class='oxd-input oxd-input--active oxd-input--error']";
	public static String paswrd="//label[.='Password']/../..//input";
	public static String cfmpaswrd="//label[.='Confirm Password']/../..//input";
	public static String save="//button[.=' Save ']";
	

}
