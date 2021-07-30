package com.ort.qa.util;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ort.qa.base.TestBase;



public class RepositoryPages extends TestBase {
	

	
	
//Login Page xpath
		
		@FindBy(name="username")
		protected WebElement username;

		@FindBy(name="password")
		protected WebElement password;

		@FindBy(xpath="//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div[1]/div/form/div[3]/button")  
		protected WebElement signUpBtn;

		@FindBy(xpath="//img[contains(@class,org-logo__image)]")
		protected WebElement ortLogo;
		
		@FindBy(xpath="//div[text()='Incorrect username or password. Please try again.']")
		protected WebElement errorMsgForInvalidMail;

		@FindBy(xpath="//a[text()='Forgot Password']")
		protected WebElement forgotPassword;
		
		@FindBy(xpath="//a[text()='Forgot Password link']")
		protected WebElement forgotPasswordlink;
		
		@FindBy(xpath="//*[@id=\"page-ui-container\"]/div/div/div/div[2]/div[1]/div/div/div/text()") 
		protected WebElement passwordResetMsg;
		
		@FindBy(id="cancel-button")
		protected WebElement clickOnCancleButtonLink;
		
		@FindBy(id ="recovery-code")
		protected WebElement recoveryCode;  

		@FindBy(id ="new") 
		protected WebElement enterNewPassword; 

		@FindBy(id ="verify")
		protected WebElement verifyNewPassword;

		@FindBy(xpath="//button[@type='submit']")
		protected WebElement save;
		
//Select Facility Page	
		    
		    //Select Facility Dropdown*
			@FindBy(xpath="//select[@name='locationId']")
			protected WebElement facilityDropdown;

		    //	Confirm button
			@FindBy(xpath="//button[text()='Confirm']")
			protected WebElement confirm;	
			 
//Dashboard Page 
			
			//creat case menu link
			@FindBy(xpath="(//a[@class='menu-font'])[4]")
			protected WebElement createcase;	
			
			// create case dashboard link
			@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[4]")
			protected WebElement dashboardCreateCase;
			
			//InProgress Menu Link 
			@FindBy(xpath="(//a[text()='In-Process'])[1]")
			public WebElement menuInProcess;
			
			//InProgrss Dashboard Link
			@FindBy(xpath="(//div[@class='rcorners3 border border-primary flexchild pointer-div'])[1]")
			public WebElement dashboardInProcess;  
			
			//Cart Review Link
			@FindBy(xpath="(//a[text()='Cart Review'])[1]")
			public WebElement menuCartReview;
			
			//ORReady link
			@FindBy(xpath="(//a[text()='ORtelligence'])[1]")
			//@FindBy(xpath="//a[@class='menu-font menu-active']")
			protected WebElement menuORReadyLink;
			
			
//Find Patient Page
			
			//PatientLastName
			@FindBy(xpath="//input[@id='lastName']")
			protected WebElement patientLastName;
		
			//patient first name
			@FindBy(xpath="//input[@id='firstName']")
			protected  WebElement patientFirstName;
		 
			//patient DOB
			@FindBy(xpath="//input[@id='dob']")
			protected  WebElement patientDOB;

		     //	Date of Birth Calendar icon	
			@FindBy(xpath="//span[@class='date-picker-icon']")
			protected WebElement patientDOBIcon;
			
		     //MRN# Number	
			@FindBy(xpath="//input[@id='mrn']")
			protected  WebElement patientMRN;
			
		    //Search button	On Find Patient Page
			@FindBy(xpath="//button[text()='Search']")
			public  WebElement search;
			
		    //	Select Patient Button on Find Patient Page
			@FindBy(xpath="//button[@name='Select']")
			protected	WebElement selectPatient;
			
			@FindBy(xpath="//select[@id='specialtyId']")
			public WebElement specialitySelection;
			
			@FindBy(xpath="//input[@id='caseId']")
			public WebElement caseNumbers;
			
			//@FindBy(xpath="")
			@FindBy(xpath="//parent::td[@class='border-right' and @scope='row']//a[@class='a-pointer']")
			public WebElement caseNumberLink;
			
			
//Create Case Xpaths
			
			//select surgeon on create case
			@FindBy(xpath="//select[@formcontrolname='surgeon']")
			protected WebElement surgeon;

			//Patient Latex Allergy
			@FindBy(xpath="//select[@formcontrolname='hasLatexAlergy']")
			protected WebElement patientAllergy;
			
			//SECOND SURGEON PLUS ICON
			@FindBy(xpath="//i[@class='fa fa-plus padding-plus-layout cursor-pointer']")
			WebElement secondSergeonPlusIcon;
			
			//Second Surgeon field
			@FindBy(xpath="//select[@id='surgeonPlus']")
			WebElement secondSurgeon;
			
			//Surgeon Latex allergy
			@FindBy(xpath="//select[@formcontrolname='surgeonHasLatexAlergy']") 
			WebElement surgeonAllergy;
			
			//second surgeon Latex Allergy
			@FindBy(xpath="(//select[@formcontrolname='secondSurgeonHasLatexAlergy']")
			WebElement secondSurgeonAllergy;
			
			//Surgery Date and Time
			//Text Field is generally auto filled based upon Urgency but User can manually enter data 
			@FindBy(xpath="//input[@class='form-control ng-untouched ng-pristine ng-invalid']")
			WebElement surgeryDateTime;
			
			//Surgery Date/Time* Calendar
			@FindBy(xpath="//span[@class='input-group-append']")
			WebElement surgeryDateTimeCalenderIcon;
			
			//select urgency on create case page
			@FindBy(xpath="//select[@formcontrolname='urgency']")
			protected WebElement urgency;
			
			//select speciallity on create case page
			@FindBy(xpath="//select[@id='specialtyId']")
			protected WebElement speciaity;
			
			//next button on create case Page
			@FindBy(xpath="//button[text()='Next']")
			protected WebElement next;
			
			//notes by Doctor on create case Page
			@FindBy(xpath="//textarea[@id='notesbydoctor']")
			protected WebElement notes;
			
			//physician Assistant
			@FindBy(xpath="//select[@formcontrolname='physicianAssistant']")
			protected WebElement physicianAssistant;
			
			//Select Prcedure field
			@FindBy(xpath="//input[@id='selectProcedure']")
			protected WebElement procedure;
			
			//Preference Card Field
			@FindBy(xpath="//span[contains(text(),'Select Preference Card ')]")
			protected WebElement preferenceCard;
			
			//Search Preference Card Field
			@FindBy(xpath="//input[@name='search-text']")
			protected WebElement searchPreferenceCard;
			
			
			//QuickPick Button 
			@FindBy(xpath="//button[text()='Quick Pick']")
			protected WebElement quickPick;
			
			//Diagnosis Code field
			@FindBy(xpath="//input[@id='diagnosisCodes']")
			WebElement diagnosisCode;
			
			//Diagnosis Code Search(Search ICD 10 Codes) Button
			@FindBy(xpath="//a[text()='Search ICD 10 Codes']")
			WebElement diagnosisCodeSearch;
			
			//upload Image photo label
			@FindBy(xpath="//label[@id='upload-drop-zone']")
			WebElement uploadImagePhoto;

			//upload Image browse label
			@FindBy(xpath="//div[@class='upload-drop-zone'] //label[@class='cursor-pointer' and @for='uploadImage']")
			WebElement uploadImageBrowse;	
	
			//Error Msg Field if surgeon field is blank while creating case
			@FindBy(xpath="//button[text()=' Please select Surgeon ']")
			protected WebElement errorMsg;
			
//Procedure Selection Page Xpath
			
			@FindBy(xpath="(//button[text()='Select'])[15]")
			public WebElement selectProcedure2;
			
			//Select Button 27245
			@FindBy(xpath="(//button[@class='btn btn-primary'])[15]")
			public WebElement selectProceduree ;
			
			//select prefernce card 
			@FindBy(xpath="//select[@formcontrolname='preferenceCard']")
			protected WebElement selectPreferenceCard;
			
			//Click on Back Button
			@FindBy(xpath="//button[text()='Back']")
			protected WebElement back;
			

		 	@FindBy(xpath="//button[text()='Select another Procedure']")
		 	WebElement selectAnotherProceedToCart;	
			
	//system Selection
		 	
		 	/*	System found
		 	 * 	Checkbox 1st option
		 	 */ 

		 		
		 		@FindBy(xpath="(//input[@type='checkbox'])")
		 		protected WebElement checkBoxElement;
		 		
		 		@FindBy(xpath="(//input[@type='checkbox'])[1]")
		 		public WebElement checkboxSystem1;
		 		
		 	 /*	Checkbox 2nd option
		 	 */ 
		 		
		 		@FindBy(xpath="(//input[@type='checkbox'])[2]")
		 		public WebElement checkboxSystem2;

		 	 /*	Back button
		 	 */
		 		
		 		//@FindBy(xpath="//button[text()='Back']")
		 		//public WebElement back;

		 	 /*	Select button
		 	 */
		 		
		 		@FindBy(xpath="//button[text()='Select']")
		 		public WebElement select;
		 		
		 	 /*	System not found exception
		 	 *	Click here link to open pop-up
		 	 */
		 		
		 		@FindBy(xpath="(//button[@class='btn btn-primary'])[2]")
		 		public WebElement clickOnSelectButton;

		 	 /*	Pop-up - Proceed to Cart button
		 	 */
		 		
		 		@FindBy(xpath="//button[text()='Proceed to Cart']")
		 		protected WebElement proceedToCart;
		 		
		 	 /*	Pop-up - Select another Procedure button
		 	 */
		 		
		 		@FindBy(xpath="//button[text()='Select another Procedure']")
		 		public WebElement selectAnotherProcedure;

		 	 /*Pop-up - Close Icon
		 	 */
		 		
		 		@FindBy(xpath="//button[@class='close']")
		 	public	WebElement closeIcon;

		 	
		 	
			
 //Create Cart Page xpath			
			//Anesthesia requests
			@FindBy(xpath="//select[@formcontrolname='anestesiaRequests']")
			protected	WebElement anestesiaRequests;
			

			//Select Anesthesia Request
			@FindBy(xpath="//span[contains(text(),'Select Anesthesia Request')]")
			protected WebElement selectAnesthesiaRequest;
			
			//Select first checkbox which contains AC
			@FindBy(xpath="//div[contains(text(),'A/C')]")
			protected WebElement selectCheckboxAC;
		
			
			//medications
			@FindBy(xpath="//textarea[@formcontrolname='medications']")
			protected WebElement medications;
			
			//position Side
			@FindBy(xpath="//select[@formcontrolname='positionSide']")
			protected WebElement positionSide;
			
			//System Position
			@FindBy(xpath="//select[@formcontrolname='systemPosition']")
			protected WebElement systemPosition;
			
			//Positioning Information
			@FindBy(xpath="//textarea[@formcontrolname='positioning_information']")
			protected WebElement positioningInformation;
			
			//Instructions
			@FindBy(xpath="//textarea[@formcontrolname='instructions']")
			protected WebElement instructions;
			
			@FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-create-case/app-addsets/form/div[1]/div[2]/div/table/tbody/tr[2]/td[3]/input")
			protected WebElement openQuantity ;
			
//Open Cases Page
			
			//procedure Details Xpath on Confirmation Pop Up
			
			@FindBy(xpath="//button[contains(text(),'Procedure Details')]")
			protected WebElement procedureDetailsButton;
			
			@FindBy(xpath="//button[contains(text(),'Cart Details')]")
			protected WebElement cartDetailsButton;
			
			@FindBy(xpath="//button[@class='btn btn-primary']")
			protected WebElement backButton;
			
			@FindBy(xpath="//button[contains(text(),'Update')]")
			protected WebElement updateButton;
			
//SuperUser CaseQueue Page
			
			@FindBy(xpath="//button[contains(text(),'Confirm Cart')]")
			protected WebElement confirmCartButton;
	

//OR Ready Page
			
////td[@class='border-right']//a[contains(text(),' Start')]
		 
			//click on Case Number Link 
		@FindBy(xpath="(//a[@href='javascript:void(0);'])[7]")	
		protected WebElement clickonORCaseNumberLink;
			
		//Click on Start operation Link on OR Page-Below Find Patient
         @FindBy(xpath="(//a[@href='javascript:void(0);'])[4]")
         protected WebElement startOperationORLink;
         
         //click on cancle Case OR link-Below Find Patient
         @FindBy(xpath="(//a[@href='javascript:void(0);'])[5]")
         protected WebElement cancleCaseORLink;
         
         //case details Link on OR page-Below Find Patient
         @FindBy(xpath="(//a[text()='Case Details'])[1]")
         protected WebElement caseDetailsORLink;
         
         //Virtual Repositry Link on OR Page-Below Find Patient
         @FindBy(xpath="(//a[@href='javascript:void(0);'])[6]")
         protected WebElement virtualRepositoryORLink;
         
         //Sound check Button on the Voice Command Page
         @FindBy(xpath="//button[text()='Sound Check']")
         protected WebElement soundCheckButton;
         
         //Next Button on Voice Command Page in OR-Ready Functionality
         @FindBy(xpath="//button[text()='Next']")
         protected WebElement nextButtonOR;
         
         //Back bUTTON ON vOICE cOMMAND pAGE In OR-Ready Page
         @FindBy(xpath="//button[text()='Back']")
         protected WebElement backButtonVC;
         
         //Add procedure curser Pointer '+' sign pointer
         @FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-or/app-begin-surgery/div[3]/form/div[1]/div[1]/label/i[1]")
         protected WebElement addProcedureCurserPointer;
         
         @FindBy(xpath="//a[contains(text(),'All Trays')]")
         protected WebElement clickOnAllTrays;
         
         @FindBy(xpath="//input[@formcontrolname='selectProcedure']")
         protected WebElement selectProcedure;
         
         @FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-or/app-begin-surgery/div[2]/app-search-instrument/div/form/input")
         protected WebElement clickOnSearch;
         
         //Inventory Control Form Link
         @FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-or/app-begin-surgery/div[3]/form/div[1]/div[4]/label/b")
         protected WebElement inventoryControlForm;
         
         //Close Button on the Inventory Control Form
         
         @FindBy(xpath="/html/body/ngb-modal-window/div/div/div[3]/button[1]")
        // @FindBy(xpath="//button[contains(text(),'Close')]")
         protected WebElement closeButtonOnICF;
         
         //Virtual Repository Button on Surgery Screen 
         @FindBy(xpath="//button[contains(text(),'Virtual Rep')]")
         protected WebElement virtualRepositoryButton;
         
         //Add system curser pointer '+' sign pointer
         @FindBy(xpath="//i[@ngbtooltip=\"Add System\"]")
         protected WebElement addSystemCurserPointer;
         
         // < Previous Tray Cursor 
         @FindBy(xpath="//i[@class=\"fas fa-chevron-circle-left cursor-pointer padding-top10 icon-color-dark-blue\" and @placement=\"center\"]")
         protected WebElement previousTrayCursor;
         
         //> Next Tray Cursor
         @FindBy(xpath="//i[@class=\"fas fa-chevron-circle-right cursor-pointer icon-color-dark-blue\" and @placement=\"center\"]")
         protected WebElement nextTrayCursor;
         
         //Left Cursur Pointer
         @FindBy(xpath="//i[@class=\"fas fa-angle-left cursor-pointer padding-top10 fa-2x\"]")
         protected WebElement leftCursorPointer;
         
         //Right Cursor Pointer
         @FindBy(xpath="//i[@class=\"fas fa-angle-right cursor-pointer padding-top10 fa-2x icon-color-dark-blue\"]")
         protected WebElement rightCursorPointer;
         
         //Repeat Cursor Pointer
         @FindBy(xpath="//i[@class=\"fas fa-retweet cursor-pointer padding-top10 icon-color-dark-blue\"]")
         protected WebElement repeatCursorPointer;
         
         //Pause Cursor Pointer
         @FindBy(xpath="//i[@class=\"fas fa-pause-circle cursor-pointer padding-top10 icon-color-dark-blue\"]")
         protected WebElement pauseCursorPointer;
         
         //Voulume UP Cursor Pointer
         @FindBy(xpath="//i[@class=\"fas fa-volume-up cursor-pointer padding-top10 icon-color-dark-blue\"]")
         protected WebElement volumeUpCursorPointer;
         
         //Left Arrow Pointer to hide steps
         @FindBy(xpath="//img[@class=\"cursor-pointer padding-top10 step-arrow-Tray-left arrow-size ng-star-inserted\"]")
         protected WebElement leftArrowPointer;
         
         //Right Arrow pointer to hide Trays
         @FindBy(xpath="cursor-pointer padding-top10 step-arrow-Instrument-left arrow-size ng-star-inserted")
         protected WebElement rightArrowPointer;
         
         //Back Button On the Surgery Screen
         @FindBy(xpath="//button[contains(text(),'Back')]")
         protected WebElement backButtonSurgeryScreen;
         
         //Complete Button On The Surgery Screen
         @FindBy(xpath="//button[contains(text(),'Complete')]")
         protected WebElement completeButtonSurgeryScreen;
         
         
         @FindBy(xpath="//button[@id=\"ngb-typeahead-0-0\"]")
         protected WebElement firstProcedure;
         
         @FindBy(xpath="//select[@formcontrolname=\"childProcedure\"]")
         protected WebElement childProcedure;
         
         @FindBy(xpath="//option[contains(text(),'Select Procedure')]")
         protected WebElement procedureDropdown;
         
         @FindBy(xpath="//button[contains(text(),'Ok')]")
         protected WebElement okButton;
         
         
         
//Cart Review Page
         
         @FindBy(xpath="(//a[@class='a-pointer'])[2]")
         protected WebElement clickOnCartReviewCaseLink;
         
         
         
         
         @FindBy(xpath="(//a[@class='a-pointer'])[2]")	
 		 protected WebElement clickonCartReviewLink;
         
         @FindBy(xpath="(//button[@class='btn btn-primary'])[3]")
         protected WebElement cartDetailsCartReviewButton;
         
         @FindBy(xpath="(//button[@class='btn btn-primary'])[2]")
         protected WebElement allergyAlertCRButton;
         
         @FindBy(xpath="//input[@value='avl']")
         protected WebElement manageCartCartReviewRadioButton;
       
         @FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-case-view/app-manage-cart/div/form/div[1]/div[2]/div/table/tbody/tr[3]/td[4]/label[2]/input")
         protected WebElement manageCartCRRadioButton2;
         
         @FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-case-view/app-manage-cart/div/form/div[1]/div[2]/div/table/tbody/tr[3]/td[5]/select")
         protected WebElement selectRemark;
         
         @FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-case-view/app-manage-cart/div/form/div[1]/div[2]/div/table/tbody/tr[3]/td[6]/div/input")
         protected WebElement timeToAvailability;
         
         @FindBy(xpath="//span[text()='Set']")
         protected WebElement clickOnSet;
         
         @FindBy(xpath="(//input[@value='avl'])[2]")
         protected WebElement manageCartCRRadioButton1;
         
         @FindBy(xpath="(//input[@value='avl'])[3]")
         protected WebElement manageCartCRRadioButton3;
         
         @FindBy(xpath="(//input[@value='avl'])[4]")
         protected WebElement manageCartCRRadioButton4;
         
         @FindBy(xpath="(//input[@value='avl'])[5]")
         protected WebElement manageCartCRRadioButton5;
         
         @FindBy(xpath="(//button[@type='button'])[6]")
         protected WebElement manageCartDoNotOpenButton;
         
         @FindBy(xpath="(//input[@value='avl'])[6]")
         protected WebElement manageCartCRRadioButton6;
         
         @FindBy(xpath="(//button[@type='button'])[6]")
         protected WebElement manageCartcloseButton;
         
         @FindBy(xpath="(//input[@value='avl'])[7]")
         protected WebElement manageCartCRRadioButton7;
         
         @FindBy(xpath="//button[@type='button' and contains(text(),'Close')]")
         protected WebElement manageTrayNotOpenButton;
        
         @FindBy(xpath="(//input[@value='avl'])[8]")
         protected WebElement manageCartCRRadioButton8;
         
         @FindBy(xpath="//button[@type='button' and contains(text(),'Close')]")
         protected WebElement TrayIsNotOpenButton;
         
         @FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-case-view/app-manage-cart/div/form/div[3]/div[1]/div/div/div[2]/div/i")
         protected WebElement manageCartCRSupplies;
         
         @FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-case-view/app-manage-cart/div/form/div[3]/div[3]/div[1]/table/tbody/tr[1]/th[4]/div/a")
         protected WebElement manageCartCRAllAvailable;
         
         @FindBy(xpath="/html/body/ngb-modal-window[6]/div/div/div[3]/button")
         protected WebElement supplyClosePopupButton;
         
         @FindBy(xpath="(//button[text()='Confirm Cart']")
         protected WebElement manageCartCRConfirmCart;
         
         @FindBy(xpath="//button[text()='Back']")
         protected WebElement clickOnBackButton;
         
         @FindBy(xpath="(//a[@class='a-pointer'])[2]")	
 		 protected WebElement clickonCReviewLink;
         
         @FindBy(xpath="(//button[@class='btn btn-primary'])[2]")
         protected WebElement ProcedureDetailsButton;
         
         //Select Surgeon Dropdown*
         @FindBy(xpath="//*[@id=\"surgeon\"]")
		 protected WebElement surgeonDropdown;
         
       //Select Physician Assistant Dropdown*
         @FindBy(xpath="/html/body/app-root/app-full-layout/div[1]/app-case-view/app-case/form/div/div[2]/div[1]/div[2]/select")
		 protected WebElement physicianAssistant1;
         
         @FindBy(xpath="/html/body/ngb-modal-window/div/div/div[3]/button[1]")
         protected WebElement conformationYes;
         
         @FindBy(xpath="//select[@class='form-control ng-pristine ng-valid ng-star-inserted ng-touched']")
   		 protected WebElement patientLatexAllergy;
         
         
         @FindBy(xpath="//i[@class='fa fa-plus-circle icon-size cursor-pointer']")
         protected WebElement imNailHip;
         
         @FindBy(xpath="//*[@id=\"notesbydoctor\"]")
         protected WebElement clickOnNotes;
         
         @FindBy(xpath="/html/body/ngb-modal-window/div/div/div[3]/button[2]")
         protected WebElement clickOnConformationPopup;
         
         @FindBy(xpath="//button[@class='btn btn-primary']")
         protected WebElement backButtonView;
         
         @FindBy(xpath="//button[@class='btn btn-primary']")
         protected WebElement backButtonView1;
         
}