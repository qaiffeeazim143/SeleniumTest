package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Login')]")
    public WebElement Login ;
	
	

	@FindBy(how=How.XPATH,using="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
    public WebElement UserEmailOrMobileNumber ;
	
	

    @FindBy(how=How.XPATH,using="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
    public WebElement UserPassword ;
    
    @FindBy(how=How.XPATH,using="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
    public WebElement LoginButton ;
    
    public void clickLogin() {
    	Login.click();
   	  
     }
    
    public void enterUserMailorMobile(String EnterMailOrMobile) {
    	UserEmailOrMobileNumber.sendKeys(EnterMailOrMobile);
  	  
    }
    
    public void enterPassword(String Password) {
    	UserPassword.sendKeys(Password);
     	  
       }
    public void clickLoginButton() {
    	LoginButton.click();
   	  
     }
			
			
}
