package Com.Vtiger;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.generic.util.BaseClass;
import com.objectrepo.Createcontactpage;
import com.objectrepo.CreatenewContactpage;
import com.objectrepo.Homepage;

public class Vtiger_Create_Contact extends BaseClass{
	
     @Test(groups="Smoke Test")
     public void createContact() throws FileNotFoundException, IOException  {
    	 Homepage hp=new Homepage(driver);
    	 hp.getContactbtn().click();
    	 
    	 Createcontactpage ccp=new Createcontactpage(driver);
    	 ccp.getCreatecontactbtn().click();
    	 
    	 CreatenewContactpage cncp=new CreatenewContactpage(driver);
    	 cncp.getEnterfirstName().sendKeys(prop.getdata("firstname"));
    	 cncp.getEnterlastname().sendKeys(prop.getdata("lastname"));
    	 cncp.getSavebtn().click();
    	 
    	 
    	 
    	 
    	 
     }
}
