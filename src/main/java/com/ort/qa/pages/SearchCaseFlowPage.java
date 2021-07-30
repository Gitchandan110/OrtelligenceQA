package com.ort.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.ort.qa.util.RepositoryPages;

public class SearchCaseFlowPage extends RepositoryPages{
	
	
	
	@FindBy(xpath="//li[@class='dropdown user-menu pl-sm-0']")
	public WebElement menuUserName; 
	
	@FindBy(xpath="(//a[text()='Logout'])[1]")
	public WebElement menuLogout;
	
	@FindBy(xpath="(//a[text()='Search Cases'])[1]")
	public WebElement searchCaseLink;
	
	
	@FindBy(xpath="//Button[contains(text(),'Ok')]")
	public WebElement okButtons;
	
	
	
public  SearchCaseFlowPage(WebDriver dr)
	
	{
		driver=dr;
		PageFactory.initElements(driver, this);  
	}
	
public void userSearchCase(String Status, String userRoleLoginId, String userRolePassword, String facilitySelection,String lastName, String firstName, String mRN, String speciality, String caseNumber) 
{
	username.sendKeys(userRoleLoginId);
	
	
	password.sendKeys(userRolePassword);
	
	
	signUpBtn.click();
	
	
	facilityDropdown.sendKeys(facilitySelection);
	
	confirm.click();
	
	
	searchCaseLink.click();
	
	patientLastName.sendKeys(lastName);
	
	patientFirstName.sendKeys(firstName);
	
	patientMRN.sendKeys(mRN);
	
	
	specialitySelection.sendKeys(speciality);
	
	
	search.click();
	
	
	
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

