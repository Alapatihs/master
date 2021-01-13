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
			logger.info("sucessfully clicked the Webelement "+element);

		} catch (Exception e) {
			logger.info("unable to click the "+element+ "Webelement :: " +e);

       throw new RuntimeException();
       
		}
	}

	@Override
	public void jsClickWebElement(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			logger.info("sucessfully clicked the Webelement "+element);
		} catch (Exception e) {
			
			logger.info("unable to click the "+element+ "Webelement :: " +e);

		}

	}

	

	@Override
	public void sendKeys(WebElement element, String value) {
		try {
			element.sendKeys(value);
			logger.info("sucessfully enter the value "+value+ "for the Webelement "+element);

		} catch (Exception e) {
			logger.info("unable to enter the " +value+ "for the "+element+ "Webelement :: " +e);

		}

	}

	@Override
	public void jsScrollToElement(WebElement element) {
		try
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView();", element);
			logger.info("sucessfully scrolled to the Webelement:"+element);

		}catch (Exception e) {
			logger.info("unable to scroll :"+element);

		}
		
	}

	@Override
	public void moveToElement(WebElement element) {
		try {
			Actions action = new Actions(driver);
	        action.moveToElement(element).perform();
			logger.info("sucessfully moved to the Webelement:"+element);

		}
		catch (Exception e) {
			logger.info("unable to move to the Webelement:"+element);

		}
		
	}
	
	
	
	
	
	


}
