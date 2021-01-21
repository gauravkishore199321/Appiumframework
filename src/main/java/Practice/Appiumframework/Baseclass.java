package Practice.Appiumframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Baseclass  {
	
	public static AppiumDriverLocalService service;
	public static AppiumDriver<WebElement> driver;
	
	public AppiumDriverLocalService startserver()
	{
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		
		return service;
		
	}
	
	
	
	public static void Startemulator() throws IOException, InterruptedException
	{
		// C:\Users\Gauravkishore\seleniume\Appiumframework\Resources\Startemulator.bat
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\Resources\\Startemulator.bat");
		Thread.sleep(10000);
	
	}
	public static void screenshot(String s) throws IOException
	{
	 File scrfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(scrfile, new File(System.getProperty("user.dir")+"\\"+ s+".png"));
	}
	
	
	
	public static AppiumDriver<WebElement> capabilities() throws IOException, InterruptedException {
	
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Practice\\Appiumframework\\global.properties");
	Properties prop = new Properties();
	prop.load(fis);
	DesiredCapabilities cap = new DesiredCapabilities();
	String Devname = (String) prop.get("Devicename");
	if (Devname.contains("emulator"))
	{
		Startemulator();
	}

	//Thread.sleep(20000);
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, prop.get("Devicename"));
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	//cap.setCapability(MobileCapabilityType.APP, prop.get("AppPath"));
	cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
	//cap.setCapability("chromedriverExecutable",System.getProperty("user.dir")+"//chromedriver.exe");
	cap.setCapability("chromedriverExecutable","C://Users//Gauravkishore//Documents//MobAutomation//chromedriver.exe");
	driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap );
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty("Url"));
	

	
	return driver;

}
}
