package com.ort.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseFlowPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

public class SelectFacilityPageTest extends TestBase
{

     LoginPage loginPage;
	 SelectFacilityPage selectFacilityPage;
	 NurseDashboardPage nurseDashboardPage;
	 CreateCaseFlowPage createCaseFindPatientPage;
		public SelectFacilityPageTest() 
		{  
			super();	                           
		}
		
		@BeforeMethod
		public void setUp() throws InterruptedException 
		{
			           initialization();
			         loginPage = new LoginPage(driver);
	      selectFacilityPage = new SelectFacilityPage(driver);
	      createCaseFindPatientPage = new CreateCaseFlowPage(driver);
	      nurseDashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	     
			
		}
		
	@Test(priority=1)
	public void selectFacilityFromDropdown() throws InterruptedException {
	selectFacilityPage.clickOnDropDown();
	selectFacilityPage.clickConfirm();

		
		
	}
		
		
		@AfterMethod
		public void tearDown() 
		{
			driver.quit();
		}
		
		
		
}