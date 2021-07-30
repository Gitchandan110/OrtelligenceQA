package com.ort.qa.pages;
//unneccesary page

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;



import com.ort.qa.util.DropDownHandler;
import com.ort.qa.util.RepositoryPages;

public class CreateCaseBasicDetailsPage extends RepositoryPages
{
	

	/*	Actions :
	*/
	public CreateCaseBasicDetailsPage(WebDriver dr) 
	{
		driver=dr;
		PageFactory.initElements(driver, this);
	}
	
	/* Verify Patient name - pending
	* Capture Case Number -  pending
	* Verify DOB -  pending
    * Verify MNR#
    */
	//Deleted basicDetails Method as it was not useful: 03/06/2021 

	public void clickOnPatientDropDown() {
		DropDownHandler dp =new DropDownHandler(driver);
        dp.selectUsingVisibleText(surgeon,"Christiana surgeon");
	}
	

	
	public void clickOnPatientLatexAllergyDropDown() {
		DropDownHandler dp =new DropDownHandler(driver);
        dp.selectUsingVisibleText(patientAllergy,"No");
	}
	
	public void clickOnPatientUrgencyDropDown() {
		DropDownHandler dp =new DropDownHandler(driver);
        dp.selectUsingVisibleText(urgency,"Critical (Up to 1hr.)");
	}
    
	public void clickOnSpecialityDropDown() {
		DropDownHandler dp = new DropDownHandler(driver);
		dp.selectUsingVisibleText(speciaity,  "Trauma");
	}
	
	public void clickOnNextButton() {
		next.click();
	}
	
	
	
	public void clickOnProcedure() {
		procedure.sendKeys("IM Nail Hip / InterTroch / CMN Hip (27245)");
	}
	

	public void clickOnPreferenceCard() {
		preferenceCard.click();
		
	}
	
	public void notesByDoctor() {
		notes.sendKeys("Do not Drink Water before one hour of Surgery");
	}
	
}
