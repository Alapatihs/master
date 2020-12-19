package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import utility.GenericUtility;

public class OrderHistoryPage extends GenericUtility {

	public WebDriver driver;

	public OrderHistoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public boolean validateOrderHistory() {
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='order-list']/tbody/tr"));
        boolean flag = false;
        for (int i = 1; i < rows.size(); i++) {
            if (ShoppingSummaryPage.orderdetailsdata.contains(rows.get(i).findElement(By.xpath("//td[1]")).getText())
                    && ShoppingSummaryPage.orderdetailsdata.contains(rows.get(i).findElement(By.xpath("//td[3]")).getText())) {
                flag = true;
                break;
            }
        }

        return flag;

    }
}
