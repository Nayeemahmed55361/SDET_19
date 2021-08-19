package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatenewContactpage {
	public CreatenewContactpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement enterfirstName;

    public WebElement getEnterfirstName() {
		return enterfirstName;
	}

	@FindBy(name="lastname")
    private WebElement enterlastname;
    
    
   @FindBy(xpath="//input[@name='button']")
   private WebElement savebtn;
   
   
	public WebElement getSavebtn() {
	return savebtn;
}


	public WebElement getEnterlastname() {
		return enterlastname;
	}	
	
	
	public void CreatenewContact(String lastname, String firstname) {
		enterfirstName.sendKeys(firstname);
		enterlastname.sendKeys(lastname);
		savebtn.click();
		
	}
	
}

