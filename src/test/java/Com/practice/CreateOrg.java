package Com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateOrg {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
		 driver.get("http://localhost:8888/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click(); 
			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
			List<WebElement> orgname = driver.findElements(By.xpath(" //table[@class='lvt small']/tbody/tr[*]/td[1]/input"));
			for(int i=0;i<orgname.size();i++) 
			{
			System.out.println(orgname.get(i).getText());
			
			
			
			
	}
	}
	
	
}
	
	
	

