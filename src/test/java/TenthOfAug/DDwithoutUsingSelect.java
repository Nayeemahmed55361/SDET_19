package TenthOfAug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDwithoutUsingSelect {
	public static void main(String[] args) {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.hdfcbank.com/");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
	     driver.findElement(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li[@value='5']")).click();
	     driver.findElement(By.xpath("//a[text()='Select Product']")).click();
	     driver.findElement(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li[@value='3']")).click();
	     driver.findElement(By.xpath("//div[@class='banner-right at-element-click-tracking']")).click();
	     driver.close();
	     

}
}
