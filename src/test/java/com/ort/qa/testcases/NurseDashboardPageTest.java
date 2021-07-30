
/* Created by Piyush Sadawarti on 19/5/2021
 * Modified by Piyush Sadawarti on 20/5/2021
 * Modified by Piyush Sadawarti on 21/5/2021
 * 
 */

//Nurse dashboard Test

//

package com.ort.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ort.qa.base.TestBase;
import com.ort.qa.pages.LoginPage;
import com.ort.qa.pages.NurseDashboardPage;
import com.ort.qa.pages.SelectFacilityPage;

public class NurseDashboardPageTest extends TestBase
{
//	Declaration
//	LoginPage object - loginPage 
	LoginPage loginPage;
//	NurseDashboardPage object - nurseDashboardPage
	NurseDashboardPage nurseDashboardPage;
//   SelectFacilityPage object - selectFacilityPage
	SelectFacilityPage selectFacilityPage;
	
    public NurseDashboardPageTest() 
    {
    	super();	
    }
     
/*  Initialize different objects
 * 	Perform pre-required tests 
*/
    @BeforeMethod
 	public void setUp() throws InterruptedException 
    {
 		initialization();
 		loginPage = new LoginPage(driver);
 		nurseDashboardPage = new NurseDashboardPage(driver);
 		selectFacilityPage = new SelectFacilityPage(driver);
 		nurseDashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));  
 		
 		selectFacilityPage.clickOnDropDown();
 		
		selectFacilityPage.clickConfirm();
		
		
 	}
    
// 	Verification of page title  
 	@Test(priority=1)
 	public void verifyDashboardPageTitleTest()
 	{
 		String dashboardPageTitle =nurseDashboardPage.verifyDashboardPageTitle();
		System.out.println("Nurse Dashboard page title is -  "+dashboardPageTitle);  
	}

// 	Verification of visibility of different options of Menu
// Modified the previously written "verifyMenuOptionVisibility" TestCase:03/06/2021
 	
 	@Test(priority=2)
 	public void verifyMenuOptionVisibility() throws InterruptedException
 	{
 	
 		boolean flag=nurseDashboardPage.verifyMenuOptionsOnNurseDashboard();
		Assert.assertTrue(flag); 
 	}
 		
// 	Verification of visibility of different options of Dashboard
 	@Test(priority=3)
 	public void verifyDashboardOptionVisibility() throws InterruptedException
 	{
 		
 		boolean flag=nurseDashboardPage.verifyDashboardOptionsOnNurseDashboard();
		Assert.assertTrue(flag); 		 		
 	}		
    	
// 	Click on In Process option of Dashboard
 	@Test(priority=4)
 	public void clickInProcessDashboard() throws InterruptedException
 	{
 	
 		nurseDashboardPage.dashboardInProcess.click();
 		
 	} 
 	
// 	Click on On Hold option of Dashboard
 	@Test(priority=5)
 	public void clickOnHoldDashboard() throws InterruptedException
 	{
 		
 		nurseDashboardPage.dashboardOnHold.click(); 	
 		

 	} 
 	
// 	Click on Cart Review option of Dashboard
 	@Test(priority=6)
 	public void clickCartReviewDashboard() throws InterruptedException
 	{
 		
 		nurseDashboardPage.dashboardCartReview.click();
 	
 		} 
 	
// 	Click on Create Case option of Dashboard
 	@Test(priority=7)
 	public void clickCreateCaseDashboard() throws InterruptedException
 	{
 	
 		nurseDashboardPage.dashboardCreateCases.click();
 		
 	} 
 	
// 	Click on Search Case option of Dashboard
 	@Test(priority=8)
 	public void clickSearchCaseDashboard() throws InterruptedException
 	{
 	
 		nurseDashboardPage.dashboardSearchCase.click();
 		
 	} 
 	
// 	Click on Open Case option of Dashboard
 	@Test(priority=9)
 	public void clickOpenCaseDashboard() throws InterruptedException
 	{
 		
 		nurseDashboardPage.dashboardOpenCase.click();
 	
 	} 

// 	Click on ORtelligence option of Dashboard
 	@Test(priority=10)
 	public void clickORtelligenceDashboard() throws InterruptedException
 	{
 		
 		nurseDashboardPage.dashboardORtelligence.click();
 	
 	} 
 	
//	Header option Click. 	
// 	Click on In Process option of Menu
 	@Test(priority=11)
 	public void clickInProcessMenu() throws InterruptedException
 	{
 		
 		nurseDashboardPage.menuInProcess.click();
 
 	} 
 	
// 	Click on On Hold option of Menu
 	@Test(priority=12)
 	public void clickOnHoldMenu() throws InterruptedException
 	{
 	
 		nurseDashboardPage.menuOnHold.click();
 	
 	} 
 	
// 	Click on Cart Review option of Menu
 	@Test(priority=13)
 	public void clickCartReviewMenu() throws InterruptedException
 	{
 	
 		nurseDashboardPage.menuCartReview.click();
 	
 	} 
 	
// 	Click on Create Case option of Menu
 	@Test(priority=14)
 	public void clickCreateCaseMenu() throws InterruptedException
 	{
 
 		nurseDashboardPage.menuCreateCase.click();
 		
 	} 
 	
// 	Click on Search Case option of Menu
 	@Test(priority=15)
 	public void clickSearchCaseMenu() throws InterruptedException
 	{
 	
 		nurseDashboardPage.menuSearchCase.click();
 		
 	} 
 	
// 	Click on Open Case option of Menu
 	@Test(priority=16)
 	public void clickOpenCaseMenu() throws InterruptedException
 	{
 	
 		nurseDashboardPage.menuOpenCase.click();
 		
 	} 

// 	Click on ORtelligence option of Menu
 	@Test(priority=17)
 	public void clickORtelligenceMenu() throws InterruptedException
 	{
 	
 		nurseDashboardPage.menuORtelligence.click();
 	
 	} 	

// 	Click on Profile option of Menu
 	@Test(priority=18)
 	public void clickProfileMenu() throws InterruptedException
 	{
 	
 		nurseDashboardPage.clickOnMenuProfile();
 		
 	}	
 	
// 	Click on Switch Location option of Menu
 	@Test(priority=19)
 	public void clickNurseSwitchLocationMenu() throws InterruptedException
 	{
 	
 		nurseDashboardPage.clickOnMenuSwitchLocation();
 		
 	}	

// 	Click on Logout option of Menu
 	@Test(priority=20)
 	public void clickLogoutMenu() throws InterruptedException
 	{

 		nurseDashboardPage.clickOnMenuLogout();
 	
 	} 	
 	 	
// 	Click on Alert option of Menu
 	@Test(priority=21)
 	public void clickAlertMenu() throws InterruptedException
 	{
 
 		nurseDashboardPage.menuAlerts.click();

 	}  	
 	
//	Quit browser
 	@AfterMethod
 	public void tearDown() throws InterruptedException 
 	{
 		
 		driver.quit();
 	}
}
 	
