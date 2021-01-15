package utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class BrowserUtility extends MyLogger{
	
	public static WebDriver driver;
	
	public void invokebrowserandURL() {
		try {
      String browsername=PropertiesReaderfile.readPropertiesFile().getProperty("browser");
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
           loggerinfo("sucessfully intilaised chrome browser");
			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.geckodriver.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
		           loggerinfo("sucessfully intilaised Firefox browser");

			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IE.exe");
			
				driver = new InternetExplorerDriver();
		           loggerinfo("sucessfully intilaised Internet Explorer browser");

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(PropertiesReaderfile.readPropertiesFile().getProperty("url"));

		} catch (TimeoutException e) {
			loggerinfo("Timeout Exception" +e);
		} catch (WebDriverException e) {
			loggerinfo("Webdriver Exception" +e);

		}
		
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public void waitforTheElement(WebElement element)
	{
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(Duration.ofSeconds(5));
        wait.withTimeout(Duration.ofSeconds(30));
        wait.ignoring(StaleElementReferenceException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
}
