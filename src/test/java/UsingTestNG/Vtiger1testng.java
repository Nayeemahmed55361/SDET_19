package UsingTestNG;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.generic.util.readdatausingpropertyfile;

public class Vtiger1testng {
	WebDriver driver;
	readdatausingpropertyfile rp=new readdatausingpropertyfile();
	@BeforeMethod
	public void setup() throws FileNotFoundException, IOException {
    driver.get(rp.getdata("url"));
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    @Test
    public void test() throws FileNotFoundException, IOException {
    	driver.findElement(By.name("user_name")).sendKeys(rp.getdata("un"));
		driver.findElement(By.name("user_password")).sendKeys(rp.getdata("pwd"));
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys("Nayeem");
		driver.findElement(By.xpath("//img[@title='Select']")).click();
	 
    	
    }
    
    @AfterMethod
    public void end() {
    	driver.close();
    }
    
    }
    
    
    
    
    
   
	
	
