package com.generic.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass2 {


	public WebDriver driver;
	public Webdriver_Utility wbu=new Webdriver_Utility();
	public readdatausingpropertyfile prop=new readdatausingpropertyfile();

	@BeforeMethod
	public void setup() throws FileNotFoundException, IOException 
	{

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getdata("url"));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}




}
