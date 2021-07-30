package com.ort.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CartReviewPage;

import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class CartReviewPageTest extends TestBase {
	
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
    NurseDashboardPage nurseDashboardPage;
	CreateCaseSetSelectionPage  createCaseSetSelectionPage;
	CartReviewPage cartReviewPage;
	
public CartReviewPageTest() {  
		
		super();	                           
		}


@BeforeTest

public void setUp() throws InterruptedException {
	initialization();
	loginPage = new LoginPage(driver);
    selectFacilityPage = new SelectFacilityPage(driver);  
    cartReviewPage = new CartReviewPage(driver);
    nurseDashboardPage = loginPage.login(prop.getProperty("superUsername"), prop.getProperty("superPassword"));
    nurseDashboardPage = new NurseDashboardPage(driver);
	
     selectFacilityPage.clickOnDropDown();
	
	  selectFacilityPage.clickConfirm();
	
	 nurseDashboardPage.clickOnCartReviewLink();
			
}

/*
@Test(priority=1, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
public void openCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber ) throws InterruptedException 
{
	 Thread.sleep(3000);
	 cartReviewPage.checkCartReview (Status,lastName,firstName, MRN, Speciality);
	 Thread.sleep(3000);
	 cartReviewPage.search.click();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnCaseNumberCrLink();

}*/

@Test(priority=1, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
public void openCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber ) throws InterruptedException 
{
	 Thread.sleep(3000);
	 cartReviewPage.checkCartReview (Status,lastName,firstName, MRN, Speciality);
	 Thread.sleep(3000);
	 cartReviewPage.search.click();
	 Thread.sleep(5000);
	 cartReviewPage.clickOnCaseNumberCrLink();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnCartDetails();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnAllergyAlert();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnManageCart1();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnManageCart2();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnSelectRemarkDropDown();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnTimeToAvailability();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnSetButton();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnManageCart3();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnManageCart4();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnManageCart5();
	 Thread.sleep(3000);
	// cartReviewPage.clickOnDoNotOpenButton();
	 //Thread.sleep(3000);
	 cartReviewPage.clickOnManageCart6();
	 Thread.sleep(3000);
	// cartReviewPage.clickOnPopupCloseButton();
	// Thread.sleep(3000);
	 cartReviewPage.clickOnManageCart7();
	 Thread.sleep(3000);
	// cartReviewPage.clickOnCloseButton();
	// Thread.sleep(3000);
	 cartReviewPage.clickOnManageCart8();
	 Thread.sleep(3000);
	// cartReviewPage.clickOnTraynotopenButton();
	// Thread.sleep(3000);
	 cartReviewPage.clickOnSuppliesTitle();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnManageCartLink();
	 Thread.sleep(5000);
	 cartReviewPage.clickOnSupplyCloseButton();
	 Thread.sleep(5000);
	 cartReviewPage.clickOnBackButton();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnCReviewLinkButton();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnCReviewPrDetailsButton();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnSurgeonDropDown();
	 Thread.sleep(3000);
	// cartReviewPage.clickOnPhysicianAssistantDropDown();
	 //Thread.sleep(3000);
	 cartReviewPage.clickOnImHipNail();
     Thread.sleep(4000);
     cartReviewPage.clickOnNotes();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnBackButton1();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnConformationPopup();
	 Thread.sleep(3000);
	 cartReviewPage.clickOnBackButton2();
}    
          
          
          
          
          






}

