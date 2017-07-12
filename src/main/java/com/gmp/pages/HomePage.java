package com.gmp.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gmp.pages.base.BasePage;
import com.gmp.pages.util.Constants;

public class HomePage extends BasePage {
	
	
	@FindBy(id=Constants.SEARCH_BTN)
	public AndroidElement searchBtn;
	
	@FindBy(id=Constants.SEARCH_BOX)
	public AndroidElement searchBox;
	
	@FindBy(id=Constants.SEARCH_TITLE)
	public AndroidElement SearchTitle;
	
	
	
	
	public HomePage(AndroidDriver<AndroidElement> androidDriver){
	 super(androidDriver);
	}
	
	
	
	public void searchCity(String data) {
		searchBtn.click();
		searchBox.sendKeys(data);
		searchBox.sendKeys(Keys.ENTER);
	}
	
}

