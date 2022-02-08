package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	
WebDriver driver;
	
	public CartPage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	@FindBy(how=How.XPATH,using="//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
    public WebElement EmailOrMobileNumberValue ;
	
	 @FindBy(how=How.XPATH,using="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	    public WebElement PassValue ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
	    public WebElement LogButtonClick;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
	    public WebElement SearchedValue ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")
	    public WebElement searchedButtonClick ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[2]/div[1]/span[1]/label[1]/div[1]")
	    public WebElement CompareClick ;
	 
	 @FindBy(how=How.XPATH,using="//span[contains(text(),'COMPARE')]")
	    public WebElement CompareCont ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]")
	    public WebElement ChooseProduct ;
	 
	 @FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")
	    public WebElement addToCart ;
	 
	 
	 public void enterUserMailValue(String EnterMailOrMobile) {
	    	EmailOrMobileNumberValue.sendKeys(EnterMailOrMobile);
	  	  
	    }
	 public void enterPassValue(String Password) {
	    	PassValue.sendKeys(Password);
	     	  
	       }
	 
	 public void clickedLoginButtonClick() {
	    	LogButtonClick.click();
	   	  
	     }
	 public void enterSearchedValue(String userSearch) {
	    	SearchedValue.sendKeys(userSearch);
	  	  
	    }
	 
	 public void pressSearchedButtonClick() {
	    	searchedButtonClick.click();
	   	  
	     }
	 public void pressCompareClick() {
		    CompareClick.click();
	   	  
	     }

	 public void pressCompareCont() {
		 CompareCont.click();
	   	  
	     }
	 
	 public void pressChooseProduct() {
		 ChooseProduct.click();
	   	  
	     }
	 public void pressaddtoCart() {
		 addToCart.click();
	   	  
	     }
}
