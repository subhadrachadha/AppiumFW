package com.gmp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gmp.pages.HomePage;
import com.gmp.pages.LoginPage;
import com.gmp.pages.util.DataUtils;
import com.gmp.pages.util.Xls_ReaderGMP;
import com.gmt.base.BaseTest;


public class SearchTest extends BaseTest {
	String testName="SignInTest";
	Xls_ReaderGMP xls=new Xls_ReaderGMP();
	
	
	@Test(dataProvider="getData")
	public void searchTest(String userName,String password,String city) throws InterruptedException{	
		launchApp();
		System.out.println("App Launched successfully"); 	
	
		LoginPage loginPage=new LoginPage(aDriver);
		loginPage.skipLogin();
		HomePage homePage=new HomePage(aDriver);
		homePage.searchCity(city);
			
	}
	
	
	
	@DataProvider
	public Object[][] getData(){
		return DataUtils.getData(testName, xls);
	}

}

