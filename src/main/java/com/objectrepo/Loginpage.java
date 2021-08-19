package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement usernametxtfield;

	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordtxtfield;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginbtn;

	public WebElement getUsernametxtfield() {
		return usernametxtfield;
	}

	public WebElement getPasswordtxtfield() {
		return passwordtxtfield;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void login(String username, String password) {
		usernametxtfield.sendKeys(username);
		passwordtxtfield.sendKeys(password);
		loginbtn.click();

	}
}
