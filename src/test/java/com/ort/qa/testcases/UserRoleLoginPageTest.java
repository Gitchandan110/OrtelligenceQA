package com.ort.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;

import com.ort.qa.pages.UserRoleLoginPage;
import com.ort.qa.util.DataProviderExcel;

public class UserRoleLoginPageTest extends TestBase {
	
UserRoleLoginPage userRoleLoginPage;

public UserRoleLoginPageTest() {  
	super();	                           
	}

@BeforeMethod
public void setUp() {
	initialization();

	userRoleLoginPage = new UserRoleLoginPage(driver);
		
}

@Test(priority=1, dataProvider="LoginUsers",dataProviderClass=DataProviderExcel.class)
	public void UserRoleLoginTest(String status, String userRoleLoginId,String userRolePassword, String facilitySelection) throws InterruptedException {
	
	userRoleLoginPage.userRoleLogin(status,userRoleLoginId, userRolePassword, facilitySelection);
	 
	userRoleLoginPage.clickOnMenuLogout();
	}



}