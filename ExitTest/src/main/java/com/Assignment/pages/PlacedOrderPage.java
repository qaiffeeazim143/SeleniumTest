package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PlacedOrderPage {
	
WebDriver driver;
	
	public PlacedOrderPage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	

	@FindBy(how=How.XPATH,using="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
    public WebElement EmailOrMobileNumber1 ;
	
	 @FindBy(how=How.XPATH,using="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	    public WebElement Pass1 ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
	    public WebElement LogButton1;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
	    public WebElement Searched1 ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")
	    public WebElement searchedButton1 ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/span[1]/label[1]/div[1]")
	    public WebElement Compare1 ;
	 
	 @FindBy(how=How.XPATH,using="//span[contains(text(),'COMPARE')]")
	    public WebElement CompareCont1 ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")
	    public WebElement ChooseProduct1 ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")
	    public WebElement addToCart1 ;
	 
	 @FindBy(how=How.XPATH,using="//span[contains(text(),'Place Order')]")
	    public WebElement Order ;
	 
	 
	 
	 
	 public void enterUserMail1(String EnterMailOrMobile) {
	    	EmailOrMobileNumber1.sendKeys(EnterMailOrMobile);
	  	  
	    }
	 public void enterPass1(String Password) {
	    	Pass1.sendKeys(Password);
	     	  
	       }
	 
	 public void clickedLoginButton1() {
	    	LogButton1.click();
	   	  
	     }
	 public void enterSearched1(String userSearch) {
	    	Searched1.sendKeys(userSearch);
	  	  
	    }
	 
	 public void pressSearchedButton1() {
	    	searchedButton1.click();
	   	  
	     }
	 public void pressCompare1() {
		    Compare1.click();
	   	  
	     }

	 public void pressCompareCont1() {
		 CompareCont1.click();
	   	  
	     }
	 
	 public void pressChooseProduct1() {
		 ChooseProduct1.click();
	   	  
	     }
	 public void pressaddtoCart1() {
		 addToCart1.click();
	   	  
	     }
	 
	 public void pressOrder1() {
		 Order.click();
	   	  
	     }

}
