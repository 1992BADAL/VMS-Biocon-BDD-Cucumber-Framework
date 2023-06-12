package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Display_VisitorsPgObj {
	
	//Create WebDriver Object
	WebDriver ldriver;
	
	//Create Constructor
	public Display_VisitorsPgObj(WebDriver rdriver) {
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@value='Visit Approved']")
	WebElement VisitApproved_Btn;
	
	@FindBy(xpath="(//button[normalize-space()='Refresh'])[1]")
	WebElement Refresh;
	
	@FindBy(xpath="//*[@id=\\'simple-tabpanel-0\\']/div/p/div/div/div[2]/table/tbody/tr/td[1]/p")
	WebElement SlctVisitorDetails;
	
	@FindBy(xpath="(//input[contains(@type,'checkbox')])[1]")
	WebElement GovId_CheckBox;
	
	@FindBy(xpath="(//li[@id='-option-1'])[1]")
	WebElement AdharCard;
	
	@FindBy(xpath="//input[@name='gov_id_number']")
	WebElement AdharNumber;
	
	@FindBy(xpath="(//button[normalize-space()='Capture'])[1]")
	WebElement ImageCapture;
	
	@FindBy(xpath="(//button[normalize-space()='Update Details'])[1]")
	WebElement UpdateDetails;
	
	@FindBy(xpath="(//button[normalize-space()='Re-Print Pass'])[1]")
	WebElement PrintPassBtn;
	
	@FindBy(xpath="//button[normalize-space()='Print']")
	WebElement ShowPrint;
	
	public void ApprovedVisits() {
		VisitApproved_Btn.click();
		Refresh.click();
	}
	public void SelctVsitorsDetails() {
		SlctVisitorDetails.click();
	}
	public void GovIdCheckBox() {
		GovId_CheckBox.click();
	}
	public void AdharCard() {
		AdharCard.click();
	}
	public void AdharCardNumber() throws InterruptedException {
		AdharNumber.click();
		AdharNumber.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		AdharNumber.clear();
		Thread.sleep(2000);
		AdharNumber.sendKeys("MONDAL1992BADAL");
	}
	public void ImageCapture() {
		ImageCapture.click();
	}
	public void Updates() {
		UpdateDetails.click();
	}
	public void PrintPass() {
		PrintPassBtn.click();
	}
	public void ResultPrintPassShow() {
		WebDriver driver = null;
		WebElement Print = driver.findElement(By.xpath("//button[normalize-space()='Print']"));
		 
		   // Check if the element is present in the DOM
	    if (Print != null) {
	     	System.out.println("sprint is PASS");
	    	driver.close();
	    } else {
	      // Log an error message or throw an exception
	      System.out.println("Element not found!");
	      driver.quit();
	    }
	}

}
