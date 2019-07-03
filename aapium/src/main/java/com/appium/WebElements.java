package com.appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class WebElements {
	public  WebDriver driver;

	public WebElements(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this); // PageDecoration
	}
	
	@AndroidFindBy(xpath = "//div[@class='register-link']")
	WebElement register;
	
	@FindBy(name = "regform_title")
	WebElement Titlelistbox;
	
	public void register(){
		register.click();
	}
	
	public void Titlelistbox(String title) {
		Select drop = new Select(driver.findElement(By.name("regform_title")));
		drop.selectByValue(title);

	}
	
	
}
