package com.ort.qa.pages;


import org.openqa.selenium.support.PageFactory;

import com.ort.qa.util.DropDownHandler;
import com.ort.qa.util.RepositoryPages;

public class CreateCaseSystemSelectionPage extends RepositoryPages
{

  
 /*Actions:
 */
	
	public CreateCaseSystemSelectionPage() 
	{
		PageFactory.initElements(driver, this);
	}


	//Select the check box in the System selection page
	public void createCaseSystemSelectionOption1() {
		try {
			if (checkboxSystem1.isDisplayed()) {
				checkboxSystem1.click();
				Thread.sleep(2000);
				if (checkboxSystem2.isDisplayed()) {
					checkboxSystem2.click();
					clickOnSelectButton.click();
					}
			}
		}
		catch (InterruptedException e) {
			Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			
		
	} 
	
	/*public void createCaseSystemSelectionOption1() throws InterruptedException
	{
		if (checkboxSystem1.isDisplayed()) {
				checkboxSystem1.click();
				if (checkboxSystem2.isDisplayed()) {
					checkboxSystem2.click();
					clickOnSelectButton.click();
				}}
		
		else if (selectPreferenceCard.isDisplayed()) {
			selectPreferenceCard.click();
			DropDownHandler dp =new DropDownHandler(driver);
			  dp.selectUsingVisibleText(selectPreferenceCard,"IM HIP SYNTHES TFNA (TROCANTERIC FIXATION NAIL ADVANCED)(INTRAMEDULLARY)");
			
		
			 //selectPreferenceCard.sendKeys(" IM HIP STRYKER GAMMA NAIL      (INTRAMEDULLARY)");
		}}
		*/
		
		
		public void proceedToCart()
		{
			proceedToCart.click();
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void selectAnesthesiaRequest() 
	{
		selectAnesthesiaRequest.click();
		selectCheckboxAC.click();
	}
	
		


 /*	Select 2nd System	
 */

	public void createCaseSystemSelectionOption2()
	{
		checkboxSystem2.click();
		select.click();
				
	}
	
 /* If no system is found
 */

	public void createCaseSystemSelectionSelectSystem()
	{
		
 /*	Click here link to open Confirmation pop-up
 */ 
		
		clickOnSelectButton.click();
		
 /* Confirmation pop-up will open.
 */
		
						
	}
	

 /*	Confirmation pop-up
 */
 
	public void createCaseConfirmationPopUp() 
	{
 /*	Redirects user to Set selection sub-module
 */
		
		proceedToCart.click();
		
 /*		Redirects user to Basic details sub-module
 */
		
		selectAnotherProcedure.click();
		
 /*		Close pop-up byt clicking on Icon
 */

		closeIcon.click();
		
	}
	
 /*	Back to previous sub-module
 */

	public void createCaseSystemSelectionBack()
	{
		back.click();
	}
	

}
