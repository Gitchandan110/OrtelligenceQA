package com.ort.qa.pages;

import org.openqa.selenium.support.PageFactory;


import com.ort.qa.util.RepositoryPages;

public class OpenCasesPage extends RepositoryPages {
	

	
	
	
	public OpenCasesPage() {
		PageFactory.initElements(driver, this);
	}
	
	//WITH CASE NUMBEER
	public void userOpenCases(String Status, String lastName, String firstName, String mRN, String speciality, String caseNumber ) throws InterruptedException
	
	{
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		
		patientMRN.sendKeys(mRN);
		Thread.sleep(2000);
		
		specialitySelection.sendKeys(speciality);
		Thread.sleep(2000);
		
		caseNumbers.sendKeys(caseNumber);
		Thread.sleep(2000);
			
		
	}
	
	//Click on the case number link
	public void clickOnCaseNumberLink()
	{
		caseNumberLink.click();
	}
	
	
	//click on the Procedure Details Button on Confirmation Popup
	public void clickOnProcedureDetails()
	{
		procedureDetailsButton.click();
	}
	
	//clcick on the Cart Details Button on the confirmation PopUp
	public void clickOnCartDetails()
	{
		cartDetailsButton.click();
	}
	
	//Click on the back Button on View Cases Page After clicking on Procedure Details Button 
	public void clickOnBackButton() throws InterruptedException
	{
		Thread.sleep(2000);
		backButton.click();
	}
	
	//click on Update Button on create Cart Page After clicking on Cart Details Button
	public void clickOnUpdateButton() throws InterruptedException
	{
		Thread.sleep(2000);
		updateButton.click();
	}
	
	

}
