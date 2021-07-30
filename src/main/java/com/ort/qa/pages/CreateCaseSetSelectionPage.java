package com.ort.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ort.qa.base.TestBase;
import com.ort.qa.util.DropDownHandler;

public class CreateCaseSetSelectionPage extends TestBase 
{

	
 /*	click on set Checkbox. 
 */
	
	@FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-create-case/app-addsets/form/div[1]/div[2]/div/table/tbody/tr[2]/td[1]/fieldset")
	WebElement  checkbox1;
	
	
	/*	click on Open quantity 
	 */
	
	@FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-create-case/app-addsets/form/div[1]/div[2]/div/table/tbody/tr[2]/td[3]/input")
	WebElement openQuantity ;
	
	/*	click on Hold quantity
	 */
	

	@FindBy(xpath="(//input[@class='form-control textbox-width-height ng-pristine ng-valid ng-touched'])[2]")
	WebElement holdQuantity ;
	
	/* Records display quantity dropdown
	*/
	@FindBy(xpath="//select[@class='custom-select']")
	WebElement records;
	
 /* Search Set text
 */
	
	@FindBy(xpath="//input[@id='selectSetSubstInstrument']")
	WebElement searchSet;
 /*	Select option xpath is pending
 *	Supplies + icon
 */
	
	@FindBy(xpath="//i[@class='fa fa-plus-circle icon-size']")
	WebElement supplies;
	
 /*	Search Supplies text
 */
	
	@FindBy(xpath="//input[@id='selectSupply']")
	WebElement searchSupplies;	
 /*	Select option xpath is pending
 * 	Anesthesia Request* dropdown
 * 
 */
	
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")
	WebElement anesthesia;
	
	
	
	
 /*	Block Anesthesia type	
 */
	
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")
	WebElement blockAnesthesiaType;
	
 /*	X-Ray Needed* - Yes checkbox
 */
		
	@FindBy(xpath="(//label[@class='form-check-label'])[1]")
	WebElement xRayYes;

 /*	X-Ray Needed* - No checkbox
 */
	
	@FindBy(xpath="(//label[@class='form-check-label'])[2]")
	WebElement xRayNo;	
	
 /*	Medications text
 */
	
	@FindBy(xpath="//textarea[@id='medications']")
	WebElement medications;
	
 /*	Side* dropdown
 */
	
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")
	WebElement side;
	
 /*	Position* dropdown
 */
	
	@FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-create-case/app-addsets/form/div[8]/div[2]/select")
	WebElement position;
	
 /*	Positioning Comments text
 */
	
	@FindBy(xpath="//textarea[@id='positioning_information']")
	WebElement positioningComment;
	
 /*	Instructions text
 */
	
	@FindBy(xpath="//textarea[@id='instructions']")
	WebElement instructions;
	
 /*	Back button
 */
	
	@FindBy(xpath="//button[text()='Back']")
	WebElement back;
	
 /*	Remove Procedure button
 */
	
	@FindBy(xpath="//button[text()='Remove Procedure']")
	WebElement removeProcedure;
	
 /*	This will open a pop-up box
 *	Delete procedure is pending	
 *	Close popup button
 */
	
	@FindBy(xpath="//button[text()='Close']")
	WebElement closePopupButton;	

 /*	Close popup icon
 */
	
	@FindBy(xpath="//button[@class='close']")
	WebElement closePopupIcon;	
	
 /*	Create button
 */
	
	@FindBy(xpath="//button[text()='Create']")
	public WebElement create;	
	
 /*	Confirmation pop-up
 * 	Ok button 
 */
	
	@FindBy(xpath="//button[text()='Ok']")
	WebElement confirmationOk;
	
 /*Click here button to download the Case Details
 */
	@FindBy(xpath="//a[text()='Click here']']")
	WebElement clickHere;

	
	@FindBy(xpath="//select[@id='cptCodePreference']")
	WebElement cptCodeCheck;
	

 /*	Actions:
 *	Basic set and other details
 
 */

	
	public CreateCaseSetSelectionPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void createCaseCptCodeBox() {
		try {
			if (cptCodeCheck.isDisplayed()) {
				cptCodeCheck.sendKeys("27132");
			}
		}
		catch (Exception e) {

				e.printStackTrace();
			}
			
		
	}
	
	
	/*	click on checkbox.
	*/

	public void createCaseSetSelectioncheckbox() {

		try {
			if (checkbox1.isDisplayed()) {

				checkbox1.click();
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
		
	/*	OpenQuantity 
	 * added openQuantity.clear : Priyanka
	*/
		 
	public void createCaseOpenQuantity() 
	{
		openQuantity.clear();
	    openQuantity.sendKeys("2");
	   
	}		
	
	public void createCaseHoldQuantity()
	{
		holdQuantity.sendKeys("2");
	}
 /*	SelectSideDropdoown
 */

	public void createCaseSetSelectionDropdown()
	{
		DropDownHandler dp =new DropDownHandler(driver);
        dp.selectUsingVisibleText(side,"Bilateral");
	}
	
  /*	SelectPositionDropdoown
  */

	public void createCaseSetPositionDropdown()
	{
		DropDownHandler dp =new DropDownHandler(driver);
	    dp.selectUsingVisibleText( position,"Beach Chair");
	}
	
 /*	SelectPositionDropdoown
 */

	public void createCaseClickOnCreate()
	{
	 create.click();
	}

 /*	Remove Procedure button
 */
	
	public void createCaseRemoveProcedure()

	{
		removeProcedure.click();
		
	}

 /*	Remove Procedure - Procedure details pop-up
 */

	public void createCaseProcedureDetailsPopup()

	{
		closePopupButton.click();
		closePopupIcon.click();
		
	}

 /*	Confirmation Pop-up 
 */
 
	public void createCaseConfirmationPopup() 

	{
		clickHere.click();
		confirmationOk.click();
			
	}
	
 /*	OpenQuantity 
 */
	 
		
}
