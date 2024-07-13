package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FaqPage {
	
WebDriver driver;
	
	public FaqPage(WebDriver driver) {
	   	  PageFactory.initElements(driver, this);
	   	  this.driver=driver;
	     }
	
	@FindBy(how=How.XPATH,using="/html/body/div[2]/div/div/button")
    public WebElement forwardChecked2;
	
	@FindBy(how=How.XPATH,using="//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]")
    public WebElement MoreOn2 ;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'Sell on Flipkart')]")
    public WebElement Sell2;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'FAQs')]")
    public WebElement Faq;
	
	public void pressForwardChecked2() {
		 forwardChecked2.click();
	   	  
	     }
	
	public void pressMoreOn2() {
		 MoreOn2.click();
	   	  
	     }
	
	public void pressSell2() {
		Sell2.click();
	   	  
	     }
	
	public void pressFaq() {
		Faq.click();
	   	  
	     }
	

}
