package com.ort.qa.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.CreateCaseFlowPage;
import com.ort.qa.pages.CreateCaseSetSelectionPage;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.ORReadyPage;
import com.ort.qa.pages.OpenCasesPage;
import com.ort.qa.pages.SearchCaseFlowPage;
import com.ort.qa.pages.SelectFacilityPage;
import com.ort.qa.util.DataProviderExcel;

public class ORReadyPageTest extends TestBase {
	
	LoginPage loginPage;
	SelectFacilityPage selectFacilityPage;
	CreateCaseFlowPage createCaseFlowPage; 
    NurseDashboardPage nurseDashboardPage;
	CreateCaseSetSelectionPage  createCaseSetSelectionPage;
	SearchCaseFlowPage searchCaseFlowPage;
	OpenCasesPage openCasesPage;
	ORReadyPage orReadyPage;
	
public ORReadyPageTest() {  
		
		super();	                           
		}

@BeforeTest


public void setUp() throws InterruptedException {
	initialization();

	                  loginPage = new LoginPage(driver);
	         selectFacilityPage = new SelectFacilityPage(driver);
	         createCaseFlowPage = new CreateCaseFlowPage(driver);  
           	 searchCaseFlowPage = new SearchCaseFlowPage(driver);
           	 openCasesPage      = new OpenCasesPage();
           	 orReadyPage        = new ORReadyPage(driver);
		     nurseDashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	         nurseDashboardPage = new NurseDashboardPage(driver);
	 	     createCaseSetSelectionPage = new  CreateCaseSetSelectionPage();
	 		 Thread.sleep(1000);
	         selectFacilityPage.clickOnDropDown();
	    	 Thread.sleep(1000);
	 		 selectFacilityPage.clickConfirm();
	 		 Thread.sleep(2000);
	 		 nurseDashboardPage.clickOnORReadyLink();
}

@Test(priority=1, dataProvider="OpenCases",dataProviderClass=DataProviderExcel.class)
public void orReadyCases(String Status, String lastName, String firstName, String MRN, String Speciality, String CaseNumber ) throws InterruptedException 
{
	 Thread.sleep(3000);
	 orReadyPage.oRReady (Status,lastName,firstName, MRN, Speciality, CaseNumber);
	 Thread.sleep(3000);
	 orReadyPage.search.click();
	// Thread.sleep(3000);
	// orReadyPage.clickOnCaseNumberLink();
	// Thread.sleep(3000);
	// orReadyPage.clickOnProcedureDetails();
	// Thread.sleep(3000);
	// orReadyPage.clickOnBackButton();
	// Thread.sleep(3000);	 
}


      @Test(priority=2)    
     public void clickOnStartOperationLink() throws InterruptedException
     {
     orReadyPage.clickOnStartOperationLink();
     Thread.sleep(2000);
     orReadyPage.clickOnSoundCheckButton();
     Thread.sleep(2000);
     orReadyPage.clickOnNextButton();
     Thread.sleep(2000);

      }

      @Test(priority=3)
      public void clickOnAddProcedure() throws InterruptedException
      {
    	  Thread.sleep(2000);
    	  orReadyPage.addAnotherProcedure();
    	  Thread.sleep(2000);
    	  orReadyPage.clickOnSearchProcedure();
    	  Thread.sleep(2000);
    	  orReadyPage.clickOnFirstProcedure();
    	  Thread.sleep(2000);
    	  orReadyPage.clickoOnChildProcedure();
      }
      
      
     @Test(priority=4)
    public void clickInventoryControlForm() throws InterruptedException
    {
		Thread.sleep(2000);
	 orReadyPage.clickOnInventoryControlForm();
	
      }

     @Test(priority=5)
     public void clickOnAddAnotherSystem() throws InterruptedException
     {
    	 orReadyPage.addAnotherSystem(); 
     }
     
     
     
     
     
     
     
     
     
    // @Test(priority=5)
     public void clickOnVirtualRepositoryButton() throws InterruptedException 
     {
    	Thread.sleep(2000);
    	orReadyPage.clickOnVirtualRepositoryLink();
    	
     }
     
    

     
     
     
     
     
     
     
//CLICK ON THE FIRST lINK

     // @Test(priority=2)
      public void clickOnCaseLink()
      {
	  orReadyPage.clickOnCaseNumberLink();
      }


//Click on Cart Details Button on Confirmation Popup
     // @Test(priority=3)
      public void clickOnCartDetalisButton() 
      {
	  orReadyPage.clickOnCartDetails();
      }


//Click on Update Button
    //  @Test(priority=4)
      public void clickOnUpDateButton() throws InterruptedException
      {
	  orReadyPage.clickOnUpdateButton();
      }

      
    

   // @Test(priority=6) 
     public void clickOnSearchField() throws InterruptedException
     {  
    	Thread.sleep(2000);
    	orReadyPage.clickOnSearchField();
     }
     
 //
     
 // @Test(priority=7)  
  public void clickOnSearchProcedure() throws InterruptedException 
  { 
	  Thread.sleep(2000);
	  orReadyPage.clickOnSearchProcedure();  
  }
     
     
     
    // @Test(priority=6)
     public void clickOnCanclecase() throws InterruptedException 
     {
    	 orReadyPage.clickOnCancleCase();
     }
     
    // @Test(priority=7)
     public void clickOnVirtualLink() throws InterruptedException
     {
    	 orReadyPage.clickOnVirtualRepository();
     }
     
    // @Test(priority=8)
     public void clickOnCaseDetails() throws InterruptedException
     {
    	 orReadyPage.clickOnCaseDetailsLink(); 
     }
     
     
     
    /* Thread.sleep(3000);
	 orReadyPage.clickOnProcedureDetails();
	 Thread.sleep(3000);
	 orReadyPage.clickOnBackButton();
	 Thread.sleep(3000);*/
     
}

