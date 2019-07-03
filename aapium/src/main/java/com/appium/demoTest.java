package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class demoTest {
	public static URL url;
	public static DesiredCapabilities caps;

	public static WebDriver driver;
	
	 //@Parameters("udid")
	 @BeforeTest
	public void setupAppium( ) throws Exception {

		final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
		url = new URL(URL_STRING);

		caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
		caps.setCapability(MobileCapabilityType.UDID, "udid");
	
		driver = new AndroidDriver<MobileElement>(url, caps);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
		
		
	}


	@Test
	public void set() throws MalformedURLException {

		driver.get("https://www.google.com/");
	

		
	}


}
