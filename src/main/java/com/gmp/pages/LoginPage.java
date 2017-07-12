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

public class LoginPage extends BasePage {
	
	@FindBy(id=Constants.SIGN_EMAIL_ID)
	public AndroidElement emailID;
	
	@FindBy(id=Constants.SIGN_PASSWORD_ID)
	public AndroidElement passwordID;
	
	@FindBy(id=Constants.SIGN_LOGIN_BTN)
	public AndroidElement loginBtn;
	
	@FindBy(id=Constants.SIGN_CONFIRMPWD_ID)
	public AndroidElement confirmpwd;
	
	@FindBy(id=Constants.SKIP_BTN)
	public AndroidElement skipBtn;
	
	@FindBy(xpath=Constants.SIGNIN_TAB)
	public AndroidElement signInTab;
	
	@FindBy(id=Constants.ALLOW_PERM)
	public AndroidElement allowPerm;
	
	
	public LoginPage(AndroidDriver<AndroidElement> androidDriver){
	 super(androidDriver);
	}

	
	public void signUP(String userName,String password){
		signInTab.click();
		emailID.sendKeys(userName);
		HideKeyBoard();
		passwordID.sendKeys(password);
		HideKeyBoard();
		confirmpwd.sendKeys(password);
		HideKeyBoard();
		loginBtn.click();	
	}

	public void signIN(String userName,String password){
		emailID.sendKeys(userName);
		passwordID.sendKeys(password);
		loginBtn.click();	
	}
	
	public void skipLogin(){
		skipBtn.click();
		allowPerm.click();
	}
	
}

