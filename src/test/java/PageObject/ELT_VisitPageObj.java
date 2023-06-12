package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ELT_VisitPageObj {
	
	//Create WebDriver object
			WebDriver ldriver;
			//Create Constructor
			public ELT_VisitPageObj(WebDriver rDriver) {
				
				ldriver = rDriver;
				
				PageFactory.initElements(rDriver, this);
			}
			
			@FindBy(xpath="//div[@aria-label='Create ELT Visit']")
			WebElement ELT;
			
			@FindBy(xpath="(//input[@role='combobox'])[4]")
			WebElement NoOfVstrDrpDwn;
			
			@FindBy(xpath="//li[@id='-option-0']")
			WebElement NoOfVisitor;
			
			@FindBy(xpath="//input[@type='email']")
			WebElement EmailFld;
			
			@FindBy(xpath="//*[@id=\':r16:\']")
			WebElement Name;
			
			@FindBy(xpath="(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[30]")
			WebElement Srch;
			
			public void eltVisit() {
				ELT.click();
			}
			
			public void NumberOfVisitorDropDownList() throws InterruptedException {
				NoOfVstrDrpDwn.click();
				Thread.sleep(2000);
				NoOfVisitor.click();
			}
			
			public void emailField(String emailAdd) throws InterruptedException {
				EmailFld.click();
				EmailFld.sendKeys(emailAdd);
				Thread.sleep(2000);
			}
			
			//   facitirasequ@jollyfree.com
			
			public void VisitorName(String Nme) throws InterruptedException {
				Name.clear();
				Thread.sleep(2000);
				Name.sendKeys(Nme);
			}
			
			public void SearchAfterEmail() {
				Srch.click();
			}
	
}  
