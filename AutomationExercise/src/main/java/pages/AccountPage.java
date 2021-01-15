package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GenericUtility;
import utility.PropertiesReaderfile;

public class AccountPage extends GenericUtility{

	
	@FindBy(xpath = "//a[@title='Information']")
    public WebElement personalInformation;
	
	@FindBy(id = "firstname")
    public WebElement firstNameField;
	
	@FindBy(id="old_passwd")
	public WebElement olsPswd;
	
	@FindBy(name="submitIdentity")
	public WebElement saveBtn;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	public WebElement sucessAlert;
	
	public void AcountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickPersonalInfomration()
	{
		waitforTheElement(personalInformation);
		jsScrollToElement(personalInformation);
		clickWebelement(personalInformation);
	}
	
	public void enterFisrtname()
	{
		sendKeys(firstNameField, PropertiesReaderfile.readPropertiesFile().getProperty("firstname"));
	}
	
	public void enterCurrentPsw()
	{
		sendKeys(olsPswd, PropertiesReaderfile.readPropertiesFile().getProperty("password"));
	}
	
	public void clickSaveBtn()
	{
		clickWebelement(saveBtn);
	}
	
	public String getSuccessMessage()
	{
		return sucessAlert.getText();
	}
}
