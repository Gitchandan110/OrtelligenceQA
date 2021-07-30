package com.ort.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.ort.qa.util.RepositoryPages;

public class ORReadyPage extends RepositoryPages {
	
	public ORReadyPage(WebDriver dr) 
	{
		driver=dr;
		PageFactory.initElements(driver, this);
	}
	
public void oRReady(String Status, String lastName, String firstName, String mRN, String speciality, String caseNumber) 
	
	{
		patientLastName.sendKeys(lastName);
		
		
		patientFirstName.sendKeys(firstName);
	
		
		patientMRN.sendKeys(mRN);
		
		
		specialitySelection.sendKeys(speciality);
		
		
		caseNumbers.sendKeys(caseNumber);
		
	}

//Click on the case number link
public void clickOnCaseNumberLink()
{
	clickonORCaseNumberLink.click();
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
public void clickOnBackButton() 
{
	
	backButton.click();
}

//click on Update Button on create Cart Page After clicking on Cart Details Button
public void clickOnUpdateButton() 
{
	
	updateButton.click();
}

//Click on the Start Operation Link on OR Ready Page
public void clickOnStartOperationLink() 
{
	
	startOperationORLink.click();
}

//click on Cancle Case Link on OR READY Page
public void clickOnCancleCase()
{
	
	cancleCaseORLink.click();
}

//Click on Virtual Repository Link
      public void clickOnVirtualRepository() 
     {
	
	virtualRepositoryORLink.click();
	
     }
//Click on Case Details Link 
     public void clickOnCaseDetailsLink()
    {
	
	caseDetailsORLink.click();
     }
 
//click on sound Check button in voice commaND PAGE
public void clickOnSoundCheckButton() 
{
	
	soundCheckButton.click();
}

//CLICK ON "NEXT" button on Voice Command Page
      public void clickOnNextButton() 
     {

	nextButtonOR.click();
    }

      
      //clcick on the Back Button in Voice Control Page
      public void clickOnVCBackButton() 
    {
	
	backButtonVC.click();
    }

      //click on the plus sign IN Search Operation Page to Add Another Procedure
    public void addAnotherProcedure() 
    {
	
	addProcedureCurserPointer.click();
    }

      //click on All Trays Link
    public void clickOnAllTrays()
   {
	clickOnAllTrays.click();
    }

    //After clicking on "+" sign of ADD Procedure, Search Procedure filed should editable 
    public void clickOnSearchProcedure() 
   {  
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("arguments[0].click()", selectProcedure);
    	selectProcedure.sendKeys("20693");
    }
    
    public void clickOnFirstProcedure() throws InterruptedException 
    {
    	
    	Thread.sleep(2000);
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("arguments[0].click()", firstProcedure);
    	Thread.sleep(2000);
    }
    
    public void clickoOnChildProcedure()throws InterruptedException {
    	
	     JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("arguments[0].click()", childProcedure);
    	Thread.sleep(2000);
    	childProcedure.sendKeys("Adjustment Exfix Femoral Shaft");
    	jse.executeScript("arguments[0].click()", okButton);
    	
    	 
    	//DropDownHandler dp =new DropDownHandler(driver);
    	//dp.selectUsingVisibleText(procedureDropdown,"Adjustment Exfix Femoral Shaft");	
    	//firstProcedure.click();
	   //selectProcedure.click();
   }
    //click on + button to add another system
    public void addAnotherSystem() throws InterruptedException
    { 
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", addSystemCurserPointer);
	Thread.sleep(2000);
	
    }
    

    // Search Items filed should be cliackable and editable
   public void clickOnSearchField() throws InterruptedException 
   {
	   Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", clickOnSearch);
	    clickOnSearch.sendKeys("TFNA");
	   
   }
   
   //click on the Inventory Control Form Link
   public void clickOnInventoryControlForm() throws InterruptedException
   {
	   Thread.sleep(2000);
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("arguments[0].click()", inventoryControlForm);
	  // inventoryControlForm.click();
	   Thread.sleep(2000);
	   jse.executeScript("arguments[0].click()", closeButtonOnICF);
	  // closeButtonOnICF.click();
   }
   
   
  
    
   //click on Virtual Repository Button below Inventory Control Form
   public void clickOnVirtualRepositoryLink() throws InterruptedException
   {
	   Thread.sleep(2000);
	   virtualRepositoryButton.click();
   }
   
   
   //Check Previous Arrow is clickable or not
  public void clickOnPreviousArrow() throws InterruptedException
  {
	  Thread.sleep(2000);
	  previousTrayCursor.click();
  }
  
  //

}
