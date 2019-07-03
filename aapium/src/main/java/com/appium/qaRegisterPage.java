package com.appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class qaRegisterPage {
	 public static WebDriver driver;

	public static void appium() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung");
		caps.setCapability(MobileCapabilityType.UDID, "8533534d4f523745");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
	  driver = new AndroidDriver(url, caps);

	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public qaRegisterPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this); // PageDecoration
	}
	
	@FindBy(xpath = "//div[@class='register-link']")
	WebElement register;

	@FindBy(name = "regform_title")
	WebElement Titlelistbox;

	@FindBy(name = "regform_first")
	WebElement firstNameTextbox;

	@FindBy(name = "regform_last")
	WebElement lastNameTextbox;

	@FindBy(name = "regform_street")
	WebElement streetTextbox;

	@FindBy(name = "regform_city")
	WebElement cityTextbox;

	@FindBy(xpath = "//select[@class='reg-input required state']")
	WebElement statelistbox;

	@FindBy(id = "regform_zip")
	WebElement zipTextbox;

	@FindBy(xpath = "//select[@class='reg-input month']")
	WebElement monthListbox;

	@FindBy(xpath = "//select[@class='reg-input day']")
	WebElement dayListbox;

	@FindBy(xpath = "//select[@class='reg-input year']")
	WebElement yearListbox;

	@FindBy(name = "regform_email")
	WebElement emailTextbox;

	@FindBy(name = "regform_emailc")
	WebElement confirmemailTextbox;

	@FindBy(name = "regform_password")
	WebElement passwordTextbox;

	@FindBy(name = "regform_passwordc")
	WebElement confirmpasswordTextbox;

	@FindBy(xpath = "//button[@id='sub-btn']")
	WebElement submitButton;

	// Title selection
	public void Titlelistbox(String title) {
		Select drop = new Select(driver.findElement(By.name("regform_title")));
		drop.selectByValue(title);

	}

	// set first name
	public void typeFirstName(String text) {
		firstNameTextbox.sendKeys("lotto");
	}

	// set last name
	public void typelasttName(String text) {
		lastNameTextbox.sendKeys("password");
	}

	// set streetname

	public void typestreetname(String text) {
		streetTextbox.sendKeys("382 channel drive");
	}

	// set cityname
	public void typecityname(String text) {
		cityTextbox.sendKeys("Port Washington");
	}

	// set state

	public void Statelistbox(String state) {
		Select drop = new Select(statelistbox);
		drop.selectByValue(state);
	}

	// set ZIP
	public void typezipcode(String text) {
		zipTextbox.sendKeys("11050");
	}

	// set Month

	public void monthListbox(int month) {
		Select drop = new Select((monthListbox));
		drop.selectByIndex(month);
	}

	// set day

	public void dayListbox(int day) {
		Select drop = new Select((dayListbox));
		drop.selectByIndex(day);
	}

	// set year

	public void yearListbox(String  year) {
		Select drop = new Select((yearListbox));
		drop.selectByVisibleText(year);
	}

	// set email

	public void emailTextbox(String text) {

	}

	public void randomEmailFill() {
		final String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		String email = "email_" + uuid + "@pchmail.com";
		System.out.println(email);
		emailTextbox.sendKeys(email);
		confirmemailTextbox.sendKeys(email); // confirm email
	}

	// create password

	public void passwordTextbox(String text) {
		passwordTextbox.sendKeys("tester");
	}

	public void confirmpasswordTextbox(String text) {
		confirmpasswordTextbox.sendKeys("tester");
	}

	// submit button

	public void submitButton() {
		submitButton.click();
	}


	
	public static void main(String[] args) throws MalformedURLException {
		 appium();
		driver.get("https://accounts.qa.pch.com/login");
		
		qaRegisterPage lop = new qaRegisterPage(driver);
		lop.register.click();
		lop.Titlelistbox("Mr.");
		lop.typeFirstName("lotto");
		lop.typelasttName("tester");
		lop.typestreetname("382 channel drive");
		lop.typecityname("Port Washington");
		lop.Statelistbox("NY");
		lop.typezipcode("11050");
		lop.monthListbox(5);
		lop.dayListbox(5);
		lop.yearListbox("1990");
		lop.randomEmailFill();
		lop.passwordTextbox("tester");
		lop.confirmpasswordTextbox("tester");
		lop.submitButton();
		
		driver.close();
		


	}

}
