package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgpage {
	public CreateNewOrgpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgname;

	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebtn;
	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getSave() {
		return savebtn;
	}

	public void createorgpage(String name) {
		orgname.sendKeys(name);
		savebtn.click();
	}
}
