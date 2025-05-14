package genericUtility;

import java.awt.event.ItemListener;
import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtility extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			wutil.getPhoto(driver);
		} catch (IOException e) {

			e.printStackTrace();
		}
		



	}
	
	

}
