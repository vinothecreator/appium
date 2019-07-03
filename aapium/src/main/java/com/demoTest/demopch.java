package com.demoTest;
	import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.appium.WebElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

	public class demopch {
		
		private final static String APPIUM_SERVER_URL = "http://127.0.0.1:4723/wd/hub";
		
		 public WebDriver driver;
		 
		 @Parameters("udid")
		 @BeforeTest
		 public void setup(String udid) throws Exception
		 {
			 URL url = new URL(APPIUM_SERVER_URL);
			 //String[] platformInfo = platform.split(" ");
			 
		/*		DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
				//caps.setCapability(MobileCapabilityType.PLATFORM_NAME,platformInfo[0]);
				//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformInfo[1]);
				caps.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
				caps.setCapability(MobileCapabilityType.UDID, udid);
				System.out.println(udid);
			
				driver = new AndroidDriver<MobileElement>(url,caps);*/
			 
		 }
		 
				 
		@Test 
		public void register() {
			System.out.println("passed");
			driver.get("https://accounts.qa.pch.com/register");	
		    driver.findElement(By.id("regform_first")).sendKeys("test");
		
		
			System.out.println("fail");
	
			
			
		}
		 
		 

	}

	
	
	

