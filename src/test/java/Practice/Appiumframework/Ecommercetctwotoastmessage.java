package Practice.Appiumframework;
import Practice.Appiumframework.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class Ecommercetctwotoastmessage extends Baseclass{

	
	@BeforeTest
	public void killserver() throws InterruptedException, IOException
	{
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
	}
	@Test
	public  void Ecommerce() throws IOException, InterruptedException {
		
		startserver();
		
		
		AppiumDriver<WebElement> driver=capabilities();
		
	
		Formpage fp = new Formpage(driver);
		
		
		fp.dropdown.click();
		Utilities ut = new Utilities(driver);
		ut.Scrolltext("Argentina");
		fp.name.sendKeys("gaurav");
		fp.gender.click();
	
		fp.letsshop.click();
		
		
		
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		
		int totsize = driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).size();
				
		System.out.println(totsize);
		for (int i =0;i <totsize;i++)
		{
			String st = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			System.out.println(st);
			
			if(st.equalsIgnoreCase("Jordan 6 Rings"))
			{
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				Thread.sleep(4000);
				//driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				break;
			}
						
						
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		service.stop();

	}
	
	@AfterTest
	public void killemulator() throws InterruptedException, IOException
	{
		Runtime.getRuntime().exec("adb -e emu kill");
		Thread.sleep(3000);
	}
  

}
