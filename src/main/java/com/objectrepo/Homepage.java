package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.util.Webdriver_Utility;

public class Homepage {
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orgbtn;

	public WebElement getOrgbtn() {
		return orgbtn;

	}

	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactbtn;

	public WebElement getContactbtn() {
		return contactbtn;
	}

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") 
	private WebElement signoutlogo;

	@FindBy(xpath="//a[@href='index.php?module=Users&action=Logout']")
	private WebElement signout;

	public WebElement getSignoutlogo() {
		return signoutlogo;
	}

	public WebElement getSignout() {
		return signout;
	}

	@FindBy(xpath="//a[@href='javascript:;']")
	private WebElement moreoption;


	public WebElement getMoreoption() {
		return moreoption;
	}

	public void orgbtn() {
		orgbtn.click();
		
	}
	public void gotomore(WebDriver driver) {
		Webdriver_Utility wbu=new Webdriver_Utility();
		wbu.Mouse_Hover(driver, moreoption);
			
	}
	public void gotosignout(WebDriver driver) {
		Webdriver_Utility wbu=new Webdriver_Utility();
		wbu.Mouse_Hover(driver, signoutlogo);
	}

}
