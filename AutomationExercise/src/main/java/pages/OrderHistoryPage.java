package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import utility.GenericUtility;

public class OrderHistoryPage extends GenericUtility {

	@FindBy(xpath="//*[@id='order-list']/tbody/tr")
	public List<WebElement> ordersList;
	
	@FindBy(xpath="//td[1]//a")
	public WebElement orderReference;
	
	@FindBy(xpath="//td[3]/span")
	public WebElement totalPrice;

	public OrderHistoryPage() {
		
		PageFactory.initElements(driver, this);
	}
	public boolean validateOrderHistory() {
		String shoppingOrderDetails=ShoppingSummaryPage.orderdetailsdata;
		String shoppingtotalPriceValue=ShoppingSummaryPage.totalPriceValue;
        //List<WebElement> rows = driver.findElements(By.xpath("//*[@id='order-list']/tbody/tr"));
        boolean flag = false;
        for (int i = 0; i < ordersList.size(); i++) {
        	
        	
            if (shoppingOrderDetails.contains(ordersList.get(i).findElement(By.xpath("//td[1]//a")).getText())
                    && shoppingOrderDetails.contains(ordersList.get(i).findElement(By.xpath("//td[3]/span")).getText())) {
                flag = true;
                break;
            }
        }
        loggerinfo("falg :" +flag);
        return flag;

    }
}
