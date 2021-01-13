import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BrowserUtility;

public class Selenium extends BrowserUtility {

	public static void main(String[] args) {
		WebElement element = null;
		
		String parent=driver.getWindowHandle();

	Set<String> allwindows=	driver.getWindowHandles();
	for(String window:allwindows)
	{
		if(driver.getTitle().equals(""))
			driver.switchTo().window(window);
		break;

	}
	driver.switchTo().window(parent);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.elementToBeSelected(element));
		
		
		ArrayList<Integer> obj=new ArrayList<Integer>(10);
		obj.add(1);
		obj.add(0, 2);
		obj.add(1,3);
		obj.clear();
		
		//System.out.println(obj);
		
		Iterator<Integer> i=obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		LinkedList<String> ll=new LinkedList<String>();
		
		
		
	}

	
	
}
