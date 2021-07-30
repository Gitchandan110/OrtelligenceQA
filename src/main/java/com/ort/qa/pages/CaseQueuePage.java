package com.ort.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.util.RepositoryPages;

public class CaseQueuePage extends  RepositoryPages {
	
	
	public CaseQueuePage(WebDriver dr) 
	{
		driver=dr;
		PageFactory.initElements(driver, this);
	}
	
	public void checkCaseQueue(String Status, String lastName, String firstName, String mRN, String speciality) throws InterruptedException
	
	{
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		
		patientMRN.sendKeys(mRN); 
		Thread.sleep(2000);
		
		specialitySelection.sendKeys(speciality);
		Thread.sleep(2000);
	}
	
	//click on the Procedure Details Button on Confirmation Popup
		public void clickOnProcedureDetails()
		{
			procedureDetailsButton.click();
		}
		
		//click on the Cart Details Button on the confirmation PopUp
		public void clickOnCartDetails()
		{
			cartDetailsButton.click();
		}
		
		//click on the Allergy alert Button on the confirmation PopUp- 5/7
		public void clickOnAllergyAlert()
		{
			allergyAlertCRButton.click();
		}
		
		
		
		//Click on the back Button on View Cases Page After clicking on Procedure Details Button 
		public void clickOnBackButton() throws InterruptedException
		{
			Thread.sleep(2000);
			backButton.click();
		}
		
		//click on confirm cart Button on create Cart Page After clicking on Cart Details Button
		public void clickOnConfirmCartButton() throws InterruptedException
		{
			Thread.sleep(2000);
			confirmCartButton.click();
		}
		
		
		
	
	
}
