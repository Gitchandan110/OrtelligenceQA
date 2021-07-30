package com.ort.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.support.PageFactory;


import com.ort.qa.util.RepositoryPages;


public class CreateCaseFlowPage extends RepositoryPages
{



 
	WebDriver driver;
	CreateCaseAffectedAreaPage createCaseAffectedAreaPage;
	CreateCaseProcedureSelectionPage createCaseProcedureSelectionPage;
	CreateCaseSystemSelectionPage createCaseSystemSelectionPage;
	CreateCaseSetSelectionPage createCaseSetSelectionPage;
	
	
	
	
 /*Initialization	
 */
	
  public CreateCaseFlowPage(WebDriver dr) 
	{	
		driver=dr;
		PageFactory.initElements(driver, this);
		 createCaseAffectedAreaPage= new CreateCaseAffectedAreaPage();
		 createCaseSystemSelectionPage= new CreateCaseSystemSelectionPage();
		 createCaseSetSelectionPage= new CreateCaseSetSelectionPage();
		 createCaseProcedureSelectionPage = new CreateCaseProcedureSelectionPage();
		
		
	}	
	
	

	public void createCaseLongFlowData(String Status,String lastName, String firstName, String mNR,String sname, String urgencyName, String patientAlllergy,String speciality, 
				String notesBySurgeon, String OpenQuantity, String anasthesiaRequest, String medicationss, String side, String position, String positioningComments, String instructionss) throws InterruptedException 
	{
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		patientMRN.sendKeys(mNR);
		Thread.sleep(2000);
        search.click();
        Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(2000);
		surgeon.click();
		Thread.sleep(2000);
		surgeon.sendKeys(sname);
		Thread.sleep(2000);
		urgency.sendKeys(urgencyName);
		Thread.sleep(2000);
		patientAllergy.sendKeys(patientAlllergy);
		Thread.sleep(3000);
		speciaity.sendKeys(speciality);
		Thread.sleep(3000);
		notes.sendKeys(notesBySurgeon);
		Thread.sleep(3000);
        next.click();
        Thread.sleep(3000);
        createCaseAffectedAreaPage.clickOnhip();
        Thread.sleep(5000);
        //click on 27245
        createCaseProcedureSelectionPage.createCaseProcedureSelection();
		 Thread.sleep(3000);
		 //will click on system selection checkbox
		 createCaseSystemSelectionPage.createCaseSystemSelectionOption1();
		 Thread.sleep(3000);
		 //click on select button on system selection check box
		// createCaseSystemSelectionPage.clickOnSelectButton.click();
		// Thread.sleep(1000);
		 //click on procede to cart option on confirmation popup
		 createCaseSystemSelectionPage.proceedToCart();
		 Thread.sleep(1000);
		 
		 createCaseSetSelectionPage.createCaseOpenQuantity(); 
		 Thread.sleep(1000);
		
 		 createCaseSystemSelectionPage.selectAnesthesiaRequest();
		 Thread.sleep(1000);
 		// anestesiaRequests.sendKeys(anasthesiaRequest);
 		 //Thread.sleep(1000);
 		 medications.sendKeys(medicationss);
 		 Thread.sleep(1000);
 		 positionSide.sendKeys(side);
 		 Thread.sleep(1000);
 		 systemPosition.sendKeys(position);
 		 Thread.sleep(1000);
 		 positioningInformation.sendKeys(positioningComments);
 		 Thread.sleep(1000);
 		 instructions.sendKeys(instructionss);
 	}
		 
		
	
	public void createCaseProcedureSelectionFlowData(String Status, String lastName, String firstName, String mNR,String surgeonName, String urgencyName, String patientAlllergy,String speciality, String procedureSelection,
		String OpenQuantity,	String AnasthesiaRequest, String Medications, String Side, String Position, String PositioningComments, String Instructions ) throws InterruptedException 
	{
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		patientMRN.sendKeys(mNR);
		Thread.sleep(2000);
        search.click();
        Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(3000);
		surgeon.sendKeys(surgeonName);
		Thread.sleep(3000);
		urgency.sendKeys(urgencyName);
		Thread.sleep(2000);
		patientAllergy.sendKeys(patientAlllergy);
		Thread.sleep(3000);
		speciaity.sendKeys(speciality);
		Thread.sleep(3000);
		
		procedure.sendKeys(procedureSelection);
		Thread.sleep(3000);
		procedure.sendKeys(Keys.EQUALS);
		Thread.sleep(3000);
	   // procedure.click();
		procedure.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		 next.click();
			Thread.sleep(3000);
		 createCaseSystemSelectionPage.createCaseSystemSelectionOption1();
		 Thread.sleep(3000);	 
		// createCaseSystemSelectionPage.clickOnSelectButton.click();
		// Thread.sleep(1000);
		 createCaseSystemSelectionPage.proceedToCart();
		 Thread.sleep(1000);
		 createCaseSetSelectionPage.createCaseSetSelectioncheckbox();
		 Thread.sleep(1000);
		 Thread.sleep(1000);
		 createCaseSetSelectionPage.createCaseOpenQuantity(); 
		 Thread.sleep(1000);
		// createCaseSetSelectionPage.createCaseOpenQuantity(); 
		// Thread.sleep(1000);
		// openQuantity.clear();
		// openQuantity.sendKeys(OpenQuantity);
        // Thread.sleep(1000);
		 createCaseSystemSelectionPage.selectAnesthesiaRequest();
		 Thread.sleep(1000);
		 //anestesiaRequests.sendKeys(AnasthesiaRequest);
		// Thread.sleep(1000);
		 medications.sendKeys(Medications);
		 Thread.sleep(1000);
		 positionSide.sendKeys(Side);
		 Thread.sleep(1000);
		 systemPosition.sendKeys(Position);
		 Thread.sleep(1000);
		 positioningInformation.sendKeys(PositioningComments);
		 Thread.sleep(1000);
		 instructions.sendKeys(Instructions);
		 
	}
	

	public void createCasePreferenceCardData(String Status, String lastName, String firstName, String MNR,String SurgeonName, String UrgencyName, String patientAlllergy,String Speciality,String PhysicianAssistant, String NotesBySurgeon, String PreferenceCardSelection,
			String OpenQuantity,	String AnesthesiaRequest, String Medications,  String  Side, String Position,   String PositioningComments, String Instructions) throws InterruptedException 
	{
		
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		patientMRN.sendKeys(MNR);
		Thread.sleep(2000);
        search.click();
        Thread.sleep(2000);
		selectPatient.click();
		Thread.sleep(2000);
		surgeon.click();
		Thread.sleep(2000);
		surgeon.sendKeys(SurgeonName);
		Thread.sleep(2000);
		urgency.sendKeys(UrgencyName);
		Thread.sleep(2000);
		patientAllergy.sendKeys(patientAlllergy);
		Thread.sleep(3000);
		speciaity.sendKeys(Speciality);
		Thread.sleep(3000);
		physicianAssistant.sendKeys(PhysicianAssistant);
		Thread.sleep(3000);
		notes.sendKeys(NotesBySurgeon);
		Thread.sleep(3000);
		preferenceCard.click();
		Thread.sleep(3000);
		searchPreferenceCard.click();
		Thread.sleep(3000);
		searchPreferenceCard.sendKeys(PreferenceCardSelection);
		Thread.sleep(3000);
		searchPreferenceCard.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
	   // searchPreferenceCard.click();
		searchPreferenceCard.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		quickPick.click();
		 Thread.sleep(1000);
	    createCaseSetSelectionPage.createCaseCptCodeBox();
		 Thread.sleep(1000);
		 createCaseSystemSelectionPage.proceedToCart();
		 Thread.sleep(1000);
		 createCaseSetSelectionPage.createCaseSetSelectioncheckbox();
		 Thread.sleep(1000);
		 createCaseSetSelectionPage.createCaseOpenQuantity(); 
		 Thread.sleep(1000);
		 createCaseSystemSelectionPage.selectAnesthesiaRequest();
		 Thread.sleep(1000);
		// createCaseSystemSelectionPage.selectAnesthesiaRequest();
		// Thread.sleep(1000);
		// anestesiaRequests.sendKeys(AnesthesiaRequest);
		// Thread.sleep(1000);
		 medications.sendKeys(Medications);
		 Thread.sleep(1000);
		 positionSide.sendKeys(Side);
		 Thread.sleep(1000);
		 systemPosition.sendKeys(Position);
		 Thread.sleep(1000);
		 positioningInformation.sendKeys(PositioningComments);
		 Thread.sleep(1000);
		 instructions.sendKeys(Instructions);
		    
	
		
		
	}
 
	
   
	public void clickSearchButton() {
		search.click();
	}
	

	public void createCaseSelectPatientButton() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	
		jse.executeScript("arguments[0].click()", selectPatient);
		jse.executeScript("arguments[0].click()", search);
	
	}
	
	
	public void userSearchCases(String Status, String lastName, String firstName, String MRN, String speciality, String caseNumber) throws InterruptedException 
	{
		
		
		patientLastName.sendKeys(lastName);
		Thread.sleep(2000);
		
		patientFirstName.sendKeys(firstName);
		Thread.sleep(2000);
		
		patientMRN.sendKeys(MRN);
		Thread.sleep(2000);
		
		specialitySelection.sendKeys(speciality);
		Thread.sleep(2000);
		
		caseNumbers.sendKeys(caseNumber);
		Thread.sleep(2000);
		
		
		search.click();
		
		
	}

	
	
}
