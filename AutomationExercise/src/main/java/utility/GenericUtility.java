package utility;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GenericUtility extends BrowserUtility implements Wrappers  {
		
	@Override
	public void clickWebelement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {

		}
	}

	@Override
	public void jsClickWebElement(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		} catch (Exception e) {
System.out.println("Exception" +e);
//System.out.println("Sri");
		}

	}

	

	@Override
	public void sendKeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {

		}

	}

	@Override
	public void jsScrollToElement(WebElement element) {
		try
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView();", element);
		}catch (Exception e) {

		}
		
	}

	@Override
	public void moveToElement(WebElement element) {
		try {
			Actions action = new Actions(driver);
	        action.moveToElement(element).perform();
		}
		catch (Exception e) {

		}
		
	}
	
	
	


}
