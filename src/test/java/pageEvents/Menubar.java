package pageEvents;

import Utilities.Elementfetch;

public class Menubar {
	Elementfetch ele=	new Elementfetch();
	
	public void menubarselection()
	{
		ele.getWebElement("XPATH",PageObjectClass.Menubar.pim_btn);
	}

}
