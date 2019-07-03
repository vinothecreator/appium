package com.demoTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {
	
	public static void main(String[] args) throws InterruptedException {
		AppiumDriver<MobileElement> driver = null;
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "4200233897c7c400"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0");
/*		caps.setCapability("appPackage", "pch.apps.pchsweeps");
	    caps.setCapability("appActivity", "pch.apps.pchsweeps.ui.MainActivity");
	    */
	    caps.setCapability("appPackage", "com.pch.lottoblast");
	    caps.setCapability("appActivity", "com.pch.lotto.PCHLottoMainActivity");
	    
	    
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
				driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
	}

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		//Thread.sleep(2000);
		
		driver.findElement(By.id("pch.apps.pchsweeps:id/rlActionBtn")).click();
	//driver.findElement(By.id("pch.apps.pchsweeps:id/toolbar_hamburger_menu_icon")).click();
	
		
		
		
	}

}
