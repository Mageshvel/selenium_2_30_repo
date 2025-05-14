package computers;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_002_Test extends BaseClass{
	
	@Test
	public void clickOnComputer() {
		HomePage hp=new HomePage(driver);
		
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers", "Computers Home Page Is Not Displayed");
		Reporter.log("Computers Home Page Is  Displayed",true);
	}

	

}
