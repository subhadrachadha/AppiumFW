package com.gmp.pages.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public AndroidDriver<AndroidElement> aDriver;

	public BasePage(AndroidDriver<AndroidElement> androidDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.aDriver = androidDriver;
	}
	
	public void HideKeyBoard() {
		aDriver.hideKeyboard();
	}
	
	
	
	public boolean isElementPresent(String locator){
		int s=aDriver.findElements(By.xpath(locator)).size();
		if(s==0)
			return false;
		else
			return true;
	}
	
}
