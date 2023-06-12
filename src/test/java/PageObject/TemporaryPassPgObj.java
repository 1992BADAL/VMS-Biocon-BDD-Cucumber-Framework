package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TemporaryPassPgObj {
	
	WebDriver ldriver;
	
	public TemporaryPassPgObj(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//div[@aria-label='Temporary Pass']")
	WebElement TempPassIcon;
	
	@FindBy(xpath="//input[@placeholder='Search Employee']")
	WebElement SearchEmp;
	
	@FindBy(xpath="(//input[@role='combobox'])[1]")
	WebElement AccessCardNoDrpdwn;
	
	@FindBy(xpath="(//li[@id='-option-0'])[1]")
	WebElement AccessCrdNo;
	
	@FindBy(xpath="(//button[normalize-space()='Generate Temporary Pass'])[1]")
	WebElement GenerateTempPasss;
	
	@FindBy(xpath="(//button[normalize-space()='Capture'])[1]")
	WebElement CaptureImg;
	
	@FindBy(xpath="//button[normalize-space()='Generate Pass']")
	WebElement GenPass;
	
	@FindBy(xpath="(//button[normalize-space()='Print'])[1]")
	WebElement PrintPass;
	
	public void TemporaryPass() {
		TempPassIcon.click();
	}
	
	public void SearchEmployee() throws InterruptedException {
		SearchEmp.click();
		SearchEmp.sendKeys("Piyush");
		Thread.sleep(2000);
	}
	
	public void AccessCardNumbr() throws InterruptedException {
		AccessCardNoDrpdwn.click();
		Thread.sleep(2000);
		AccessCrdNo.click();
		Thread.sleep(1000);
	}
	
	public void GenTempPass() throws InterruptedException {
		GenerateTempPasss.click();
		Thread.sleep(1000);
	}
	
	public void ImageCapture() throws InterruptedException {
		CaptureImg.click();
		Thread.sleep(2000);
	}
	
	public void GeneratePas() throws InterruptedException {
		GenPass.click();
		Thread.sleep(1000);
	}
	
	public void Printpass() throws InterruptedException {
		PrintPass.click();
		Thread.sleep(1000);
	}

}
