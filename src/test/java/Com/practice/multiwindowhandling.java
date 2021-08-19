package Com.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindowhandling {


	public static void main(String[] args) {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
		 driver.get("https://www.naukri.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Set<String> win = driver.getWindowHandles();
		 Iterator<String> it = win.iterator();
		 
		 while(it.hasNext()){
			 String window = it.next();
			 String windowTitle = driver.switchTo().window(window).getTitle();
			 if(windowTitle.equalsIgnoreCase("Genpact"))
			 {
				 System.out.println(windowTitle);
			 }
			}driver.findElement(By.xpath("////img[@alt='Genpact']")).click();
}
}