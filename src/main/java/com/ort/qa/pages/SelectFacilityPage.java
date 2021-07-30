package com.ort.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.ort.qa.util.DropDownHandler;
import com.ort.qa.util.RepositoryPages;



public class SelectFacilityPage extends RepositoryPages
{

	WebDriver driver;
	
 
	
 /*  Initialization
 */
	
	public SelectFacilityPage(WebDriver dr) 

	{
		driver=dr;
		PageFactory.initElements(driver, this);
	}
		
	
	/*	Actions : 
	 */
	
	
	public void clickOnDropDown() {
		
		try {
			if (facilityDropdown.isDisplayed()) {
		
		DropDownHandler dp =new DropDownHandler(driver);
        dp.selectUsingVisibleText(facilityDropdown,"Wilmington, DE, 19899 , Wilmington, Delaware, 19899");
      //  dp.selectUsingVisibleText(facilityDropdown,"4755 Ogletown-Stanton Road , Newark, Delaware, 19718");
	}}
		catch (Exception e) {

			e.printStackTrace();
		}	
	}
	
	
public void clickOnDropDownQA() {
		
		try {
			if (facilityDropdown.isDisplayed()) {
		
		DropDownHandler dp =new DropDownHandler(driver);
       // dp.selectUsingVisibleText(facilityDropdown,"Wilmington, DE, 19899 , Wilmington, Delaware, 19899");
        dp.selectUsingVisibleText(facilityDropdown,"4755 Ogletown-Stanton Road , Newark, Delaware, 19718");
	}}
		catch (Exception e) {

			e.printStackTrace();
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	public void clickOnCreateCase()
	{
		
		dashboardCreateCase.click();
	}
	
	
	public void clickConfirm()
	{
		try {
			if (confirm.isDisplayed()) {
				confirm.click();;
			}
		}
		catch (Exception e) {

				e.printStackTrace();
			}
		
		
		
	}
	
	
}
