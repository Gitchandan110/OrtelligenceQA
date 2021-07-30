package com.ort.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.util.DropDownHandler;
import com.ort.qa.util.RepositoryPages;

public class CartReviewPage extends RepositoryPages  {
	
	public CartReviewPage(WebDriver dr) 
	{
		driver=dr;
		PageFactory.initElements(driver, this);
	}

public void checkCartReview(String Status, String lastName, String firstName, String MRN, String Speciality) throws InterruptedException
	
	{
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		
		patientMRN.sendKeys(MRN);
		Thread.sleep(2000);
		
		specialitySelection.sendKeys(Speciality);
		Thread.sleep(2000);
	}

//Click on the case number link
public void clickOnCaseNumberCrLink()
{
	clickonCartReviewLink.click();
}

//click on the Cart Details Button on the confirmation PopUp
public void clickOnCartDetails()
{
	cartDetailsCartReviewButton.click();
}

//click on the Allergy allert Button on the confirmation PopUp
public void clickOnAllergyAlert()
{
	allergyAlertCRButton.click();
}

//click on the Manage Cart Radiobutton
public void clickOnManageCart1()
{
	manageCartCartReviewRadioButton.click();
}

//click on the Select remark dropdown
public void clickOnSelectRemarkDropDown() {

	DropDownHandler dp =new DropDownHandler(driver);
  dp.selectUsingVisibleText(selectRemark,"Missing");	
}


//click on the Manage Cart Radiobutton2
public void clickOnTimeToAvailability()
{
	timeToAvailability.click();
}


//click on the set button
public void clickOnSetButton()
{
	clickOnSet.click();
}


//click on the Manage Cart Radiobutton2
public void clickOnManageCart2()
{
	manageCartCRRadioButton2.click();
}

//click on the Manage Cart Radiobutton3
public void clickOnManageCart3()
{
	manageCartCRRadioButton3.click();
}

//click on the Manage Cart Radiobutton4
public void clickOnManageCart4()
{
	manageCartCRRadioButton4.click();
}

//click on the Manage Cart Radiobutton5
public void clickOnManageCart5()
{
	manageCartCRRadioButton5.click();
}

//click on the DOnot cart screen popup 
public void clickOnDoNotOpenButton()
{
	 manageCartDoNotOpenButton.click();
}

//click on the Manage Cart Radiobutton6
public void clickOnManageCart6()
{
	manageCartCRRadioButton6.click();
}

//click on the DOnot cart screen popup 
public void clickOnPopupCloseButton()
{
	 manageCartcloseButton.click();
}



//click on the Manage Cart Radiobutton7
public void clickOnManageCart7()
{
	manageCartCRRadioButton7.click();
}

//click on the DOnot cart screen popup 
public void clickOnCloseButton()
{
	 manageTrayNotOpenButton.click();
}



//click on the Manage Cart Radiobutton8
public void clickOnManageCart8()
{
	manageCartCRRadioButton8.click();
}

//click on the DOnot cart screen popup 
public void clickOnTraynotopenButton()
{
	TrayIsNotOpenButton.click();
}

//click on the Supplies Title
public void clickOnSuppliesTitle()
{
	manageCartCRSupplies.click();
}

//click on the All Available Link.
public void clickOnManageCartLink()
{
	manageCartCRAllAvailable.click();
}

//click on the DOnot cart screen popup 
public void clickOnSupplyCloseButton()
{
	supplyClosePopupButton.click();
}

//click on the All Available Link.
public void clickOnManagecartConfirmButton()
{
	manageCartCRConfirmCart.click();
}

//click on Back Button.
public void clickOnBackButton()
{
	clickOnBackButton.click();
}

//click on cart review link
public void clickOnCReviewLinkButton()
{
	clickonCReviewLink.click();
}

//click on procedure detail button
public void clickOnCReviewPrDetailsButton()
{
	ProcedureDetailsButton.click();
}

public void clickOnSurgeonDropDown() {

	DropDownHandler dp =new DropDownHandler(driver);
  dp.selectUsingVisibleText(surgeonDropdown,"Eric T Johnson");	
}

public void clickOnPhysicianAssistantDropDown() {

	DropDownHandler dp =new DropDownHandler(driver);
  dp.selectUsingVisibleText(physicianAssistant1,"No");
}

//click on procedure detail button
public void clickOnConformationButton()
{
	conformationYes.click();
}

public void clickOnPatientLatexAllergyDropDown() {

	DropDownHandler dp =new DropDownHandler(driver);
  dp.selectUsingVisibleText(patientLatexAllergy,"No");
}

//click on procedure detail button
public void clickOnImHipNail()
{
	imNailHip.click();
}

//click on notes field.
public void clickOnNotes()
{
	clickOnNotes.sendKeys("DO NOT DRINK WATER ");
}

//click on CONFORMATION POPUP.
public void clickOnConformationPopup()
{
	clickOnConformationPopup.click();
}

public void clickOnBackButton1()
{
	backButtonView.click();
}



public void clickOnBackButton2()
{
	backButtonView1.click();
}


}
