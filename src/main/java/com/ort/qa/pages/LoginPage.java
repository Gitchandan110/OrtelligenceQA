package com.ort.qa.pages;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.ort.qa.util.RepositoryPages;




public class LoginPage extends RepositoryPages{ 
		

 /* we have to use Page Factory-Object Repository
 * Here we will segregate all XPath using @FindBy annotation
 */
	WebDriver driver;
	
	
 /*
 * using @FindBy annotation we have created different WebElements of login page
 * Now we are initializing the elements using PageFactory
 * Initializing the Page Objects:
 * creating loginpage constructor
 */
	
	public LoginPage(WebDriver dr)
	
	{
		driver=dr;
		

 /* PageFactory is a class and InitElements is method 
 * driver is coming from base class  //'this' means current class object, instead of this we can write LoginPage.class but better to use 'this'
 */

	
		PageFactory.initElements(driver, this);                                              
	}

    // Actions:

	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}

 /* isDisplayed method will return true or false if the logo is available
 */
	
	public boolean validateORtLogo() 
	{
		return ortLogo.isDisplayed();   
	}
	
	public NurseForgotPasswordPage clickOnForgotPasswordLink() {
		forgotPasswordlink.click();
		return new NurseForgotPasswordPage();
	}

	public LoginPage clickOnCancleLink() {
		clickOnCancleButtonLink.click();
		return new LoginPage(driver);
	}



	public NurseDashboardPage login(String un, String pwd) throws InterruptedException{

		username.sendKeys(un);
		password.sendKeys(pwd);
		Thread.sleep(2000);
		signUpBtn.click();
		return new NurseDashboardPage(driver); 
	}
	

}


//deleted SelectFacilityPage login1 method: 03/06/2021














