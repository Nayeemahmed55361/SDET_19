package com.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Morepage {
	public Morepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@name='Sales Order']")
	private WebElement salesorderbtn;

	public WebElement getSalesorderbtn() {
		return salesorderbtn;
	}
  public void Morepage() {
	  salesorderbtn.click();
  }
}
