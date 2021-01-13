package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.GenericUtility;

public class TshirtShoppingPage extends GenericUtility {
	
	
	
	 @FindBy(xpath="(//a[@title='T-shirts'])[2]")
		public WebElement tShirtBtn;
	 
	 @FindBy(className ="product_img_link")
	    public WebElement tShirtProductImage;
	 
	 @FindBy(xpath ="//a[@title='Add to cart']")
	    public WebElement initialAddToCart;
	 
	 @FindBy(xpath ="//a[@title='Proceed to checkout']")
	    public WebElement initialProceedToCheckOutBtn;

	 
	 
	public TshirtShoppingPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickTshirt() {
		clickWebelement(tShirtBtn);
	}
	
	public void selectTshirt() throws InterruptedException
	{
		waitforTheElement(tShirtProductImage);
		jsScrollToElement(tShirtProductImage);
		waitforTheElement(tShirtProductImage);
       moveToElement(tShirtProductImage);
       waitforTheElement(initialAddToCart);
       clickWebelement(initialAddToCart);
		

	}
	
	public void clickProceedToCheckOutOnPopUp()
	{
		clickWebelement(initialProceedToCheckOutBtn);
	}
	

}
