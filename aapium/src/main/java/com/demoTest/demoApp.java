package com.demoTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class demoApp {
	  public static URL url;
	  public static DesiredCapabilities capabilities;
	  public static AndroidDriver<MobileElement> driver;
	  //1
	
		 @BeforeTest
	  public void setupAppium() throws MalformedURLException {
	    //2
	    final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
	    url = new URL(URL_STRING);
	//3
	    capabilities = new DesiredCapabilities();
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	    capabilities.setCapability(MobileCapabilityType.APP, "https://github.com/afollestad/material-dialogs/raw/master/sample/sample.apk");
	    capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
	    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
	  
	    driver = new AndroidDriver<MobileElement>(url, capabilities);
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	   driver.resetApp();
	  }
	  @Test (enabled=true) public void myFirstTest() throws InterruptedException {
		    driver.resetApp();
	  
}}
