package practice.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class forPractice {
	WebDriver driver=new ChromeDriver();
	@BeforeMethod
	public void setup() {


		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void amazon() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//div[@id='brandsRefinements']//span[@class='a-list-item']//span[@class='a-expander-prompt']")).click();
		driver.findElement(By.xpath("//li[@id='p_89/Nokia']//input[@type='checkbox']")).click();

	}
	@AfterMethod
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
}
