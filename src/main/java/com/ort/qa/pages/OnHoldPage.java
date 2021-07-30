package com.ort.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.util.RepositoryPages;

public class OnHoldPage extends RepositoryPages{
	
	public OnHoldPage(WebDriver dr) 
	{
		driver=dr;
		PageFactory.initElements(driver, this);
	}

public void checkOnHold(String Status, String lastName, String firstName, String mRN, String speciality) throws InterruptedException
	
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
	



}
