package Practice.Appiumframework;

import Practice.Appiumframework.*;

import static org.testng.Assert.assertEquals;

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
public class Penfedetoe extends Baseclass {
	
	@BeforeTest
	public void killserver() throws InterruptedException, IOException
	{
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
	}
	@Test
	public  void Ecommerce()  throws IOException, InterruptedException {
		
		startserver();
		
		
		AppiumDriver<WebElement> driver=capabilities();	
		Basicinformationpage bp = new Basicinformationpage(driver);
		Utilities ut = new Utilities(driver);
		//bp.Fname.sendKeys("fdhf");
//		Thread.sleep(15000);
//		bp.firstname().sendKeys("Tom");
//		Thread.sleep(15000);
	   // driver.findElement(By.xpath(".//*[contains(text(),'FIRST NAME')]/following::input[1]")).sendKeys("Tom");
		
		bp.firstname().sendKeys("Tom");		
		bp.Middlenam().sendKeys("I");
		bp.Lastname().sendKeys("Hogan");
		bp.Dateofbirth().sendKeys("01011990");
		ut.hidekeyboard();
		bp.Socialnumber().sendKeys("6637737091");
		bp.Primaryphonenmber().sendKeys("+1 9962150629");
		bp.Secondaryphonenmber().sendKeys("+1 9962150629");
		bp.Emailidofapplicant().sendKeys("gauravkishore@fico.com");
		ut.hidekeyboard();
	
		
		
	
	}	
		
		@AfterTest
		public void killemulator() throws InterruptedException, IOException
		{
			Runtime.getRuntime().exec("adb -e emu kill");
			Thread.sleep(3000);
		}

}
