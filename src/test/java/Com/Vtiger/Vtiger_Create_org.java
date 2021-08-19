package Com.Vtiger;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.generic.util.BaseClass;
import com.objectrepo.CreateNewOrgpage;
import com.objectrepo.CreateOrgPage;
import com.objectrepo.Homepage;

public class Vtiger_Create_org extends BaseClass{
	
	@Test(groups="Regression Test")
    public void Create() throws FileNotFoundException, IOException {
		Homepage hp=new Homepage(driver);
		hp.getOrgbtn().click();
		
		CreateOrgPage cop=new CreateOrgPage(driver);
		cop.getCreateorg().click();
		
		CreateNewOrgpage cnop=new CreateNewOrgpage(driver);
		cnop.getOrgname().sendKeys(prop.getdata("orgname"));
		cnop.getSave().click();
	}
	
}
