package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createcontactpage {
public Createcontactpage(WebDriver driver) {
     PageFactory.initElements(driver, this);	
}
     
      
      @FindBy(xpath="//img[@alt='Create Contact...']")
      private WebElement createcontactbtn;

     

	public WebElement getCreatecontactbtn() {
		return createcontactbtn;
	}

	
	
      public void createcontactpage() {
    	 
    	  createcontactbtn.click();
    	  
    	  
    	  
      }
}
