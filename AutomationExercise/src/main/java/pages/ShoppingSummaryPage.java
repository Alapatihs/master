package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.GenericUtility;

public class ShoppingSummaryPage extends GenericUtility {

	
	public WebDriver driver;
	public static String orderdetailsdata,totalPriceValue;
	
	@FindBy(xpath ="//p[@class='cart_navigation clearfix']/a[@title='Proceed to checkout']")
	public WebElement summary_proceedToCheckOutBtn;
	
	@FindBy(name="processAddress")
	public WebElement addreess_proceedToCheckOutBtn;
	
	@FindBy(id="cgv")
	public WebElement termsOfServiceCheckBox;
	
	@FindBy(name="processCarrier")
	public WebElement shipping_proceedToCheckOutBtn;
	
	 @FindBy(id="total_price")
	    public WebElement totalPrice;
	
	@FindBy(className="bankwire")
	public WebElement bakwirePayment;
	
	@FindBy(xpath="//p[@id='cart_navigation']/button")
	public WebElement confirmOrderBtn;

	@FindBy(xpath="//a[@title='Back to orders']")
	public WebElement backToOrdersBtn;
	
	@FindBy(css= "div[class='box']")
    public WebElement orderdetails;


	public ShoppingSummaryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickSummaryProceedToCheckOutBtn()
	{
		clickWebelement(summary_proceedToCheckOutBtn);
	}
	
	public void clickAddressProceedToCheckOutBtn()
	{
		clickWebelement(addreess_proceedToCheckOutBtn);
	}
	
	public void clickTermsOfServiceCheckBox()
	{
		clickWebelement(termsOfServiceCheckBox);

	}
	
	public void clickShippingProceedToCheckOutBtn()
	{
		clickWebelement(shipping_proceedToCheckOutBtn);
	}
	
	public void selectPaymentMethod()
	{
		clickWebelement(bakwirePayment);
	}
	
	public void clickConfirmOrderBtn()
	{
		clickWebelement(confirmOrderBtn);
	}
	
	public void clickBackToORdersBtn()
	{
		clickWebelement(backToOrdersBtn);
	}

	 public String getOrderDetails() {
	      orderdetailsdata = orderdetails.getText();
	        return orderdetailsdata;
	    }
	 
	 public String getTotalPrice() {
	       totalPriceValue = totalPrice.getText();
	        return totalPriceValue;
	    }
}
