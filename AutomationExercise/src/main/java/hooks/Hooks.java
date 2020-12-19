package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.BrowserUtility;

public class Hooks extends BrowserUtility {
	
	@Before
	public void startTest()
	{
		invokebrowserandURL();
	}
	
	@After
	public void endTest()
	{
		closeBrower();
	}

}
