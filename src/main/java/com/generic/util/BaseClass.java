package com.generic.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.beust.jcommander.Parameter;
import com.objectrepo.Homepage;
import com.objectrepo.Loginpage;

public class BaseClass {

	public WebDriver driver;
	public Webdriver_Utility wbu=new Webdriver_Utility();
	public readdatausingpropertyfile prop=new readdatausingpropertyfile();
	Loginpage lp=new Loginpage(driver);
    
	@BeforeSuite(groups={"Smoke Test", "Regression Test"})
	public void setup_JDBC_Report() {
		System.out.println("setup for jdbc and report is done");
	}
	@AfterSuite(groups={"Smoke Test", "Regression Test"})
	public void setup_JDBC_Report_close() {
		System.out.println("setup for jdbc and report is closed");
	}
	//@Parameter
	@BeforeClass(groups={"Smoke Test", "Regression Test"})
	public void launch_Browser() throws FileNotFoundException, IOException {
		String Browser=System.getProperty("browser");
		//String Browser=	prop.getdata("Browser");
		if(Browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
			System.out.println("ChromeDriver is launched");
		}
		else {
			System.out.println("Firefoxdriver is lounched");
		}
	//	String URL=prop.getdata("url");
		String URL=System.getProperty("url");
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterClass(groups={"Smoke Test", "Regression Test"})
	public void close_Browser() {
		driver.close();
		System.out.println("Browser is closed");
	}
	@BeforeMethod(groups={"Smoke Test", "Regression Test"})
	public void loginVTiger() throws FileNotFoundException, IOException {
		Loginpage lp=new Loginpage(driver);
		lp.login(prop.getdata("un"), prop.getdata("pwd"));
	}
	
	
	@AfterMethod(groups={"Smoke Test", "Regression Test"})
	public void logoutVTiger() {
		Homepage hp=new Homepage(driver);
		hp.getSignoutlogo();
		hp.getSignout();
		
	}

	
	
}
