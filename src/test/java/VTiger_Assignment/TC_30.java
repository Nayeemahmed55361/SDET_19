package VTiger_Assignment;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.generic.util.BaseClass2;
import com.objectrepo.Homepage;
import com.objectrepo.Loginpage;
import com.objectrepo.Morepage;

public class TC_30 extends BaseClass2
{
  
	@Test
	public void tc1() throws FileNotFoundException, IOException {
		
		Loginpage lp=new Loginpage(driver);
	    lp.getUsernametxtfield().sendKeys(prop.getdata("un"));
		lp.getPasswordtxtfield().sendKeys(prop.getdata("pwd"));
		lp.getLoginbtn().click();
		
		Homepage hp=new Homepage(driver);
		hp.getMoreoption().click();
	
		
		Morepage mp=new Morepage(driver);
		mp.getSalesorderbtn().click();
		
		
		
		
		
		
		
		
		
		
	}
    
}
