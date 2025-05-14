package genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
		
	}
	
	//...>mouse&keyboard Actions
	
	public void mouseHover(WebDriver driver,WebElement element) {
		
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();	
	}
    public void rightClick(WebDriver driver,WebElement element) {
		
		Actions act=new Actions(driver);
		act.contextClick(element).perform();	
	}
   public void doubleClick(WebDriver driver,WebElement element) {
		
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();	
	}
	


   public void scrolling(WebDriver driver,WebElement element) {
		
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
   public void clickAndHold(WebDriver driver,WebElement element) {
		
		Actions act=new Actions(driver);
		act.clickAndHold(element).perform();	
	}
   public void drangAndDrop(WebDriver driver,WebElement element1,WebElement element2) {
		
		Actions act=new Actions(driver);
		act.dragAndDrop(element1, element2).perform();	
	}

//...>Dropdowns
   
   public void selectDropDownByIndex(WebElement element,int index) {
	 Select sc=new Select(element);
			 sc.selectByIndex(index);;
	
	}
   public void selectDropdownByValue(WebElement element,String value) {
	  Select sc=new Select(null);
	  sc.selectByValue(value);
	  
	  
    }
   public void selectDropdownByText(WebElement element,String text) {
	  Select sc=new Select(element);
	  sc.selectByVisibleText(text);
    }
  
   //...>iframe
   
   
   public void switchToFrame(WebDriver driver,int index) {
	  driver.switchTo().frame(index);
 
    }
   public void switchToFrame(WebDriver driver,String nameOrId) {
	   
	   driver.switchTo().frame(nameOrId);
    }
   
    public void swictchToFrame(WebDriver driver,WebElement frameElement) {
	   driver.switchTo().frame(frameElement);
	   
	//.....>
	   
   }
    public void switchToAlertAndaccept(WebDriver driver) {
    	driver.switchTo().alert().accept();
    }
    
    public void switchToAlertAndCancel(WebDriver driver) {
    	driver.switchTo().alert().dismiss();
    	
    }
    public Alert swtichToAlert(WebDriver driver) {
    	return driver.switchTo().alert();
    	
    }
    
    public void getPhoto(WebDriver driver) throws IOException {
    	
    	JavaUtility jUtil=new JavaUtility();
    	TakesScreenshot ts=(TakesScreenshot) driver;
    	File temp = ts.getScreenshotAs(OutputType.FILE);
    	File dest=new File("./screenshots/"+jUtil.getSystemTime()+".png");
    	
    	FileHandler.copy(temp, dest);
    	
    }

	

}
