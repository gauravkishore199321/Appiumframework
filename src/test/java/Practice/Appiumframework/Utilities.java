package Practice.Appiumframework;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Utilities {
	
	 AppiumDriver<WebElement> driver;

	

	public  Utilities(AppiumDriver<WebElement> driver)
	{
		this.driver= driver;
	}
	
	public void Scrolltext(String text)
	{
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));").click();
		
	}
	public  void hidekeyboard()
	{
		 driver.hideKeyboard();
	}
	
	
}
