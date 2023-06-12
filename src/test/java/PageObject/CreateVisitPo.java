package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVisitPo {
	//Create WebDriver object
	WebDriver ldriver;
	//Create Constructor
	public CreateVisitPo(WebDriver rDriver) {
		
		ldriver = rDriver;
		
		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath = "/html/body/div/div[5]/form/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/input")
	WebElement Visiting_Location_Dropdown;
	
	@FindBy(xpath = "(//li[@id='-option-0'])[1]")//Biocon_Campus
	WebElement Visiting_Location;
	
	@FindBy(xpath = "(//input[@role='combobox'])[2]")
	WebElement Building_Name_Dropdown;
	
	@FindBy(xpath = "(//li[@id='-option-2'])[1]")//HR
	WebElement Building_Name;
	
	@FindBy(xpath = "(//input[@role='combobox'])[3]")
	WebElement Visitor_Sub_Type_Dropdown;
	
	@FindBy(xpath = "(//li[@id='-option-1'])[1]")//Media
	WebElement Visitor_Sub_Type;
	
	@FindBy(xpath = "(//input[@role='combobox'])[4]")
	WebElement Number_of_Visitor_Dropdown;
	
	@FindBy(xpath = "(//li[@id='-option-0'])[1]")//1
	WebElement Number_of_Visitor;
	
	@FindBy(xpath = "//input[@id=':rh:']")
	WebElement Company_Name;
	
	@FindBy(xpath = "//input[@id='ack_checkbox']")
	WebElement Gov_Id_Checkbox;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[5]/form[1]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement Email_Field;
	
	@FindBy(xpath = "(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[35]")
	WebElement Search_button;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement CreateVisit_button;
	
	@FindBy(xpath = "//span[normalize-space()='Your Visit is Successfully Created']")
	WebElement Actual_Message;
	
	//Action Methods for web elements
	
	public void ClickOnVisitingLocationDropdownList() {
		Visiting_Location_Dropdown.click();
	}  
	
	public void SelectVisitingLocation() {
		Visiting_Location.click();
	}
	
	public void ClickOnBuildingNameDropdownList() {
		Building_Name_Dropdown.click();
	}
	
	public void SelectBuildingName() {
		Building_Name.click();
	}
	
	public void ClickOnVisitorSubTypedropdowmList() {
		Visitor_Sub_Type_Dropdown.click();
	}
	
	public void SelectVisitorSubType() {
		Visitor_Sub_Type.click();
	}
	
	public void ClickOnNumberOfVisitorDropdownList() {
		Number_of_Visitor_Dropdown.click();
	}
	
	public void SelectNumberOfVisitors() {
		Number_of_Visitor.click();
	}
	
	public void EnterVisitorCompanyName() {
		Company_Name.sendKeys("Skyvill.in");
	}
	
	public void ClickOnGovIdcheckbox() throws InterruptedException {
		Gov_Id_Checkbox.click();
		Thread.sleep(2000);
	}
	
	public void EnterEmailOfVisitor() {
		 Email_Field.click();
		 Email_Field.sendKeys("bhanuprakash.resoluteai@gmail.com");
	}
	
	public void ClickOnSearchButton() throws InterruptedException {
		Search_button.click();
		Thread.sleep(4000);
	}
	
	public void ClickOnCreateVisitButton() throws InterruptedException {
		CreateVisit_button.click();
		Thread.sleep(2000);
	}
	
	public String MessageVerification() {
		return Actual_Message.getText();
	}
	
	
}
