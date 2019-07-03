package com.appium;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class App {
	public static void main(String[] args) throws MalformedURLException  {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
		caps.setCapability(MobileCapabilityType.UDID, "8533534d4f523745");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver driver = new AppiumDriver(url, caps);

		/*
		 * caps.setCapability("deviceName", "My Phone");
		 * caps.setCapability("udid", "ENUL6303030010"); //Give Device ID of
		 * your mobile phone caps.setCapability("platformName", "Android");
		 * caps.setCapability("platformVersion", "6.0");
		 * caps.setCapability("browserName", "Chrome");
		 */

		driver.get("http://saucelabs.com/test/guinea-pig");
	

		// close the app.
		driver.quit();

	
	}

}
