package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GenericUtility extends BrowserUtility implements Wrappers  {
		
	@Override
	public void clickWebelement(WebElement element) {
		try {
			element.click();
			loggerinfo("sucessfully clicked the Webelement "+element);

		} catch (Exception e) {
			loggerinfo("unable to click the "+element+ "Webelement :: ", e);

       throw new RuntimeException(e);
       
		}
	}

	@Override
	public void jsClickWebElement(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			loggerinfo("sucessfully clicked the Webelement "+element);
		} catch (Exception e) {
			
			loggerinfo("unable to click the "+element+ "Webelement :: ", e);
			throw new RuntimeException(e);

		}

	}

	

	@Override
	public void sendKeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
			loggerinfo("sucessfully enter the value "+value+ "for the Webelement "+element);

		} catch (Exception e) {
			loggerinfo("unable to enter the " +value+ "for the "+element+ "Webelement :: ", e);

		}

	}

	@Override
	public void jsScrollToElement(WebElement element) {
		try
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView();", element);
	        loggerinfo("sucessfully scrolled to the Webelement:"+element);

		}catch (Exception e) {
			loggerinfo("unable to scroll :", e);

		}
		
	}

	@Override
	public void moveToElement(WebElement element) {
		try {
			Actions action = new Actions(driver);
	        action.moveToElement(element).perform();
			loggerinfo("sucessfully moved to the Webelement:"+element);

		}
		catch (Exception e) {
			loggerinfo("unable to move to the Webelement:"+element,e);

		}
		
	}
	
	
	
	
	
	


}
