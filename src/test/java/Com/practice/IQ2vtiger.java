package Com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IQ2vtiger {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void getattribute() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		String ele = driver.findElement(By.xpath("//img[@title='Open Calendar...']")).getAttribute("title");
		System.out.println(ele);
		
		String ele1 = driver.findElement(By.xpath("//img[@title='Open Calculator...']")).getAttribute("title");
		System.out.println(ele1);
	}
	
	
	@AfterMethod
	public void end() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
