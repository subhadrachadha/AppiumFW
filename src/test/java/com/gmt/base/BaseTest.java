package com.gmt.base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.gmp.pages.util.Constants;
import com.gmp.pages.util.Xls_ReaderGMP;



public class BaseTest {
	public WebDriver driver;
	public AndroidDriver<AndroidElement> aDriver;
	
	public void launchApp() throws InterruptedException{
		File app = new File(Constants.APK_PATH);
	     DesiredCapabilities capabilities =DesiredCapabilities.android();
	     capabilities.setCapability("deviceName",Constants.DEVICE_NAME);
	     capabilities.setCapability("platformVersion", Constants.DEVICE_VERSION);
	     capabilities.setCapability("platformName",Constants.PLATFORM);
	     capabilities.setCapability("appPackage",Constants.APP_PACKAGE);
	     capabilities.setCapability("appActivity",Constants.APP_ACTIVITY);
		 capabilities.setCapability("app", app.getAbsolutePath());

		try {
			driver = new AndroidDriver<AndroidElement>(new URL(Constants.HUB_URL), capabilities);
		    aDriver = (AndroidDriver<AndroidElement>)driver;
		} catch (MalformedURLException e) {
			e.printStackTrace();
			Assert.fail("Application did not launch"+ e.getMessage());
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void quit(){
		if(driver!=null)
			driver.quit();
		
	}
	
}
