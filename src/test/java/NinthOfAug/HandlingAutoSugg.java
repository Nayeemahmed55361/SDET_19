package NinthOfAug;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSugg {

	public static void main(String[] args) {
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.amazon.in/");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headphones");
     WebElement ele = driver.findElement(By.xpath("//div[@id='issDiv4']"));
     System.out.println(ele.getText());
	}

}
