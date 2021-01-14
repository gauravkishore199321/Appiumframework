package Practice.Appiumframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Basicinformationpage {
	
	public Basicinformationpage(){}
	//local
	//local2
    private AppiumDriver<WebElement> driver;
	
	public Basicinformationpage(AppiumDriver<WebElement> driver)
	{
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@FindBy(xpath = ".//*[contains(text(),'FIRST NAME')]/following::input[1]")	
	private  WebElement Fname;
	
	@FindBy(xpath =".//*[contains(text(),'M.I')]/following::input[1]")
	private  WebElement middlename;
	
	@FindBy(xpath =".//*[contains(text(),'LAST NAME')]/following::input[1]")
	private  WebElement Lname ;
	
	@FindBy(xpath =".//*[contains(text(),'DATE OF BIRTH')]/following::input[1]")
	private  WebElement Datebirth ;
	
	@FindBy(xpath =".//*[contains(text(),'SSN')]/following::input[1]")
	private WebElement Ssn ;
	
	@FindBy(xpath =".//*[contains(text(),'PRIMARY PHONE')]/following::input[1]")
	private  WebElement Primaryphone ;
	
	@FindBy(xpath =".//*[contains(text(),'SECONDARY')]/following::input[1]")
	private  WebElement Secondaryphone ;
	
	@FindBy(xpath =".//*[contains(text(),'EMAIL')]/following::input[1]")
	private  WebElement EmailId ;
	
	public  WebElement firstname()	
	{
			
		return Fname;
	
	}
	
	public  WebElement Middlenam()
	{
		return middlename;
	}
	
	public  WebElement Lastname()
	{
		return Lname;
	}
	
	public  WebElement Dateofbirth()
	{
		return Datebirth;
	}
	
	public  WebElement Socialnumber()
	{
		return Ssn;
	}
	
	public  WebElement Primaryphonenmber()
	{
		return Primaryphone;
	}
	
	public  WebElement Secondaryphonenmber()
	{
		return Secondaryphone;
	}

	public  WebElement Emailidofapplicant()
	{
		return EmailId;
	}
}
