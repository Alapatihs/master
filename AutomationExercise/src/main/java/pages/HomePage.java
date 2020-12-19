package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GenericUtility;
import utility.PropertiesReaderfile;

public class HomePage extends GenericUtility {

	
	@FindBy(xpath = "//a[@class='login']")
	public WebElement signInButton;

	@FindBy(id = "email")
	public WebElement userName;

	@FindBy(id= "passwd")
	public WebElement password;

	@FindBy(id= "SubmitLogin")
	public WebElement submitLogin;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickOnSignInBtn() throws Throwable {
		Thread.sleep(10000);

		jsClickWebElement(signInButton);

	}

	public void loginToApplication() throws InterruptedException {
		System.out.println("value:"+PropertiesReaderfile.readPropertiesFile().getProperty("username"));
         Thread.sleep(10000);
		sendKeys(userName, PropertiesReaderfile.readPropertiesFile().getProperty("username"));
		sendKeys(password, PropertiesReaderfile.readPropertiesFile().getProperty("password"));
		jsClickWebElement(submitLogin);

	}
	
	public String returnTitleText()
	{
		System.out.println(driver.getTitle());
		return  driver.getTitle();
	}
	

}
