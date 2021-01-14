package Practice.Appiumframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Formpage {
	
	public Formpage(AppiumDriver<WebElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id ="com.androidsample.generalstore:id/spinnerCountry")
	public WebElement dropdown;
	
	
	//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));").click();

	@AndroidFindBy(id ="com.androidsample.generalstore:id/nameField")
	public WebElement name;
	
	@AndroidFindBy(xpath ="//*[@text='Female']")
	public WebElement gender;
	
	@AndroidFindBy(id ="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement letsshop;


	
	
	
}
