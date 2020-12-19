package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public abstract class AbstractPage<T extends AbstractPage<T>> {

	public final WebDriver webDriver;
	
	public AbstractPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(new AjaxElementLocatorFactory(webDriver, 10), this);

    }
	
	public WebDriver getWebDriver(){
        return webDriver;
    }
}
