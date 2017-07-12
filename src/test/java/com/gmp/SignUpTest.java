package com.gmp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gmp.pages.HomePage;
import com.gmp.pages.LoginPage;
import com.gmp.pages.util.DataUtils;
import com.gmp.pages.util.Xls_ReaderGMP;
import com.gmt.base.BaseTest;


public class SignUpTest extends BaseTest {
	String testName="SignUpTest";
	Xls_ReaderGMP xls=new Xls_ReaderGMP();
	
	
	@Test(dataProvider="getData")
	public void signUpTest(String userName,String password,String city) throws InterruptedException{	
		launchApp();
		System.out.println("App Launched successfully"); 	
	
		LoginPage loginPage=new LoginPage(aDriver);
		loginPage.signUP(userName, password);
			
	}
	
	
	
	@DataProvider
	public Object[][] getData(){
		return DataUtils.getData(testName, xls);
	}

}

