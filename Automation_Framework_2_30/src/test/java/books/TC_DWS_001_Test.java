package books;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import genericUtility.ListenerUtility;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_DWS_001_Test extends BaseClass {
	@Test
	
	public void clickOnBooks() {
		
    HomePage hp=new HomePage(driver);
    hp.getBooksLink().click();
    Assert.assertEquals(driver.getTitle(),"Demo Web Shop. ","Books page is not displayed");
    Reporter.log("Books page is displayed",true);
		
		
	}

}
