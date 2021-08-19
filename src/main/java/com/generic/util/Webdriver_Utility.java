package com.generic.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_Utility 
{
	/**
	 * this method is used to perform dropdown operation.
	 * @param ele
	 * @param Text
	 */
	public void Drop_Down(WebElement ele,String Text) {
		Select sel=new Select(ele);
		sel.selectByVisibleText(Text);
	}

	/**
	 * this method is used to perform Mose Hover operation.
	 * @param driver
	 * @param ele
	 */
	public void Mouse_Hover(WebDriver driver,WebElement ele) {
		Actions act=new Actions(driver);
		act.moveToElement(ele);
	}

	/**
	 * this method is used to perform Double Click operation.
	 * @param driver
	 * @param ele
	 */
	public void Double_Click(WebDriver driver, WebElement ele) {
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}

	/**
	 * this method is used to perform Right Click operation.
	 * @param driver
	 * @param ele
	 */
	public void Right_Click(WebDriver driver, WebElement ele) {
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}

	/**
	 * this method is used to perform Drag and Drop operation.
	 * @param driver
	 * @param src
	 * @param target
	 */
	public void Drag_Drop(WebDriver driver,WebElement src,WebElement target ) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}

	/**
	 * this method is going to switch to frame based on index.
	 * @param driver
	 */
	public void Frame_Switch(WebDriver driver) {
		driver.switchTo().frame(0);
	}

	/**
	 * this method is going to switch back to the default frame.
	 * @param driver
	 */
	public void Frame_Switchback(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	/**
	 * this method is used to perform Scrollbar operation.
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void Scroll_Bar(WebDriver driver, int x,int y) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("Window.scrollBy(x,y)");
	}

	/**
	 * this method is used to handle alert popup.
	 * @param driver
	 */
	public void Alert_Popup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

}
