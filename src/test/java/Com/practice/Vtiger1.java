package Com.practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.generic.util.readdatausingpropertyfile;

public class Vtiger1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		readdatausingpropertyfile rp=new readdatausingpropertyfile();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(rp.getdata("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(rp.getdata("un"));
		driver.findElement(By.name("user_password")).sendKeys(rp.getdata("pwd"));
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys("Nayeem");
		driver.findElement(By.xpath("//img[@title='Select']")).click();

	}

}
