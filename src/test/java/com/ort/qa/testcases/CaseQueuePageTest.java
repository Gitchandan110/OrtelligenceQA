package com.ort.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CaseQueuePage;

import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;

import com.ort.qa.pages.SearchCaseFlowPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class CaseQueuePageTest extends TestBase {
	
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
    NurseDashboardPage nurseDashboardPage;
	CreateCaseSetSelectionPage  createCaseSetSelectionPage;
	SearchCaseFlowPage searchCaseFlowPage;
    CaseQueuePage caseQueuePage;
	
public CaseQueuePageTest() {  
		
		super();	                           
		}

	@BeforeTest
	
	public void setUp() throws InterruptedException {
		initialization();
		loginPage = new LoginPage(driver);
        selectFacilityPage = new SelectFacilityPage(driver); 
      	 searchCaseFlowPage = new SearchCaseFlowPage(driver);
      	 caseQueuePage = new CaseQueuePage(driver);
	     nurseDashboardPage = loginPage.login(prop.getProperty("superUsername"), prop.getProperty("superPassword"));
        nurseDashboardPage = new NurseDashboardPage(driver);
	     createCaseSetSelectionPage = new  CreateCaseSetSelectionPage();
	
        selectFacilityPage.clickOnDropDown();
   
		 selectFacilityPage.clickConfirm();
	
		 nurseDashboardPage.clickOnCaseQueueLink();
				
		
}
	
	@Test(priority=1, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
	public void openCases(String Status, String lastName, String firstName, String mRN, String speciality, String CaseNumber ) throws InterruptedException  
	{
		 
	   caseQueuePage.checkCaseQueue (Status,lastName,firstName, mRN, speciality);
		 
		 caseQueuePage.search.click();
		
		 caseQueuePage.caseNumberLink.click();
	
	}
	

	//Click on Cart Details Button on Confirmation Popup
	@Test(priority=3)
	public void clickOnCartDetalisButton() 
	{
		caseQueuePage.clickOnCartDetails();
	}
	
	
	//Click on Update Button
	@Test(priority=4)
	public void clickOnConfirmCartButton() throws InterruptedException
	{
		caseQueuePage.clickOnConfirmCartButton();
	}
	
	
	
}

