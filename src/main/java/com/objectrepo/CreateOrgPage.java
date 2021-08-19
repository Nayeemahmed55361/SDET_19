package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrgPage {
	public CreateOrgPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createorg;

	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgname;

	@FindBy(xpath="//input[@value='  Save  ']")
	private WebElement savebtn;

	public WebElement getCreateorg() {
		return createorg;
	}

	public WebElement getOrgname() {
		return orgname;
	}

	public WebElement getSave() {
		return savebtn;
	}

	public void createorgpage(String name) {
		createorg.click();
		orgname.sendKeys(name);
		savebtn.click();
	}

}
