package utility;

import org.openqa.selenium.WebElement;

public interface Wrappers {
	
	
	
	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author   
	 * @throws Exception 
	 */
	public void clickWebelement(WebElement element);
	
	/**
	 * This method will click the element using Javascriptexecutor as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author   
	 * @throws Exception 
	 */
	public void jsClickWebElement(WebElement element);
	
	
	
	public void sendKeys(WebElement element, String value);
	
	
	
	
	public void jsScrollToElement(WebElement element);
	
	public void moveToElement(WebElement element);

}
