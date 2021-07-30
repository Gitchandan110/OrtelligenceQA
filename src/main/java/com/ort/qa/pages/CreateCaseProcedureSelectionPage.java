package com.ort.qa.pages;


import org.openqa.selenium.support.PageFactory;

import com.ort.qa.util.DropDownHandler;
import com.ort.qa.util.RepositoryPages;

public class CreateCaseProcedureSelectionPage extends RepositoryPages {
	
	
		 	
		 /*	Actions:
	 *	Select 1st Procedure
		- */
			
		 	public CreateCaseProcedureSelectionPage() 
			{
				PageFactory.initElements(driver, this);
			}
			
		 	
		    //Select the 27245 procedure
			public void  createCaseProcedureSelection() 
			{
				selectProceduree.click();
				
				
			}
			
			
			//Select Preference Card
			
			public void selectPreferenceCard()
			{
				try {
					  if (checkboxSystem1.isDisplayed()) {
							checkboxSystem1.click();
							if (checkboxSystem2.isDisplayed()) {
								checkboxSystem2.click();
								clickOnSelectButton.click();
					
	
				/*	if(selectPreferenceCard.isDisplayed()) {
						selectPreferenceCard.click();
					
					if (selectPreferenceCard.isDisplayed()) {
						selectPreferenceCard.click();
						DropDownHandler dp =new DropDownHandler(driver);
						  dp.selectUsingVisibleText(selectPreferenceCard,"IM HIP SYNTHES TFNA (TROCANTERIC FIXATION NAIL ADVANCED)(INTRAMEDULLARY)");
						
					}
						  //selectPreferenceCard.sendKeys(" IM HIP STRYKER GAMMA NAIL      (INTRAMEDULLARY)");
					}
				}}
				}*/
								}}}
			catch (Exception e) {

					e.printStackTrace();
				}
			}	

				
			
			//Click on back button
			public void createCaseProcedureSelectionBack() 
			{
			back.click();
						
			}
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		 	
		
		

}
