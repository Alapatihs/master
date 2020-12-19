package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtility {
	
	public static WebDriver driver;
	
	public void invokebrowserandURL() {
		try {
      String browsername=PropertiesReaderfile.readPropertiesFile().getProperty("browser");
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.geckodriver.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IE.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(PropertiesReaderfile.readPropertiesFile().getProperty("url"));

		} catch (TimeoutException e) {
		} catch (WebDriverException e) {
		}
		
	}
	
	public void closeBrower()
	{
		driver.quit();
	}
	
	
}
