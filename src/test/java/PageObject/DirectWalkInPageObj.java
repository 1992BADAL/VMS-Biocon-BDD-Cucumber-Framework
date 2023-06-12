package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectWalkInPageObj {
	
	//Create WebDriver object
		WebDriver ldriver;
		//Create Constructor
		public DirectWalkInPageObj(WebDriver rDriver) {
			
			ldriver = rDriver;
			
			PageFactory.initElements(rDriver, this);
		}
		
		@FindBy(xpath="(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[1]")
		WebElement MainMenu;
		
		@FindBy(xpath="(//div[@aria-label='Direct Walk-In'])[1]")
		WebElement DirectWalk_In;
		
		@FindBy(xpath="(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[2]")
		WebElement Minimize_menu;
		
		@FindBy(xpath="(//input[@role='combobox'])[1]")
		WebElement ToMeet;
		
		@FindBy(xpath="(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[21]")
		WebElement Search_button;
		
		@FindBy(xpath="(//button[normalize-space()='Select'])[1]")
		WebElement Select_suggested_Name;
		
		@FindBy(xpath="(//input[contains(@role,'combobox')])[2]")
		WebElement VisitingLocationDropdown;
		
		@FindBy(xpath="(//li[@id='-option-1'])[1]")
		WebElement VisitingLocationName;
		
		
		@FindBy(xpath="(//input[@role='combobox'])[3]")
		WebElement BuildingNameDropdown;
		
		@FindBy(xpath="//li[@id='-option-0']")
		WebElement BuildingName;
		
		@FindBy(xpath="(//input[contains(@role,'combobox')])[4]")
		WebElement VisitoSubTypedropdown;
		
		@FindBy(xpath="(//li[@id='-option-0'])[1]")
		WebElement VisitorSubTypeName;
		
		@FindBy(xpath="//input[@name='visitorCompanyName']")
		WebElement VisitorCompanyName;
		
		@FindBy(xpath="(//input[@role='combobox'])[5]")
		WebElement NumberOfVisitorDropdown;
		
		@FindBy(xpath="//li[@id='-option-0']")
		WebElement NoOfVisitor;
		
		@FindBy(xpath="(//input[@type='checkbox'])[1]")
		WebElement GovIdCheckbox;
		
		@FindBy(xpath="//input[@type='email']")
		WebElement EmailField ;
		
		@FindBy(xpath="(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-vubbuv'])[32]")
		WebElement SearchBtn;
		
		@FindBy(xpath="//input[@id=\':r18:\']")
		WebElement Name;
	
		public void mainMenu() {
			MainMenu.click();
		}
		
		public void directWalkin() {
			DirectWalk_In.click();
		}
		
		public void toMeet() throws Exception {
			Minimize_menu.click();
			Thread.sleep(2000);
			ToMeet.click();
			ToMeet.sendKeys("Badal");
		}
		
		public void searchBtn() {
			Search_button.click();
		}
		
		public void selectSugestedName() {
			Select_suggested_Name.click();
		}
		
		public void visitingLocDropdwn() {
			VisitingLocationDropdown.click();
		}
		
		public void visitingLocName() {
			VisitingLocationName.click();
		}
		
		public void buildingNameDpwn() {
			BuildingNameDropdown.click();
		}
		
		public void buildingNme() {
			BuildingName.click();
		}
		
		public void visitorSubtypeDpwn() {
			VisitoSubTypedropdown.click();
		}
		
		public void vstrSubTypeName() throws InterruptedException {
			VisitorSubTypeName.click();
			Thread.sleep(2000);
		}
		
		public void visitorsCompanyName() {
			VisitorCompanyName.click();
			VisitorCompanyName.sendKeys("SkyVill.in");
		}
		
		public void numbrOfVisitorDrpwn() {
			NumberOfVisitorDropdown.click();
			NoOfVisitor.click();
		}
			
		public void govIdCheckBox() {
			GovIdCheckbox.click();
		}
		
		public void emailField(String emailAdd) throws InterruptedException {
			EmailField.click();
			EmailField.sendKeys(emailAdd);
			Thread.sleep(1000);
		}
		
		//   facitirasequ@jollyfree.com
		
		public void VisitorName(String Nme) {
			Name.clear();
			Name.sendKeys(Nme);
		}
		public void searchButton() throws InterruptedException {
			SearchBtn.click();
			Thread.sleep(3000);
		}
		

}
