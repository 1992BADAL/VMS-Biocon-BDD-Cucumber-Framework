package StepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.CreateVisitPo;
import PageObject.DirectWalkInPageObj;
import PageObject.Display_VisitorsPgObj;
import PageObject.ELT_VisitPageObj;
import PageObject.TemporaryPassPgObj;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VmsStepDefination {
	public WebDriver driver;
	public CreateVisitPo CreateVt;
	public DirectWalkInPageObj DirectWIn;
	public ELT_VisitPageObj EltVisitCreate;
	public TemporaryPassPgObj TempPass;
	public Display_VisitorsPgObj DisVisitr;

	@Given("User launch Chrome browser and Open the URL {string}")
	public void user_launch_chrome_browser_and_open_the_url(String vms) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("use-fake-ui-for-media-stream");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		CreateVt = new CreateVisitPo(driver);
		DirectWIn = new DirectWalkInPageObj(driver);
		EltVisitCreate = new ELT_VisitPageObj(driver);
		TempPass = new TemporaryPassPgObj(driver);
		DisVisitr = new Display_VisitorsPgObj(driver);
		// Base URL (employee visit create)
		driver.get(vms);

		// Microsoft Login
		driver.findElement(By.id("i0116")).sendKeys("badal.resoluteai@gmail.com");
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("passwd")).sendKeys("@@Badal79@@");
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("idSIButton9")).click();
		Thread.sleep(2000);

	}

	@And("Select Visiting location dropdown list")
	public void select_visiting_location_dropdown_list() {
		CreateVt.ClickOnVisitingLocationDropdownList();
		CreateVt.SelectVisitingLocation();
	}

	@And("Select Building Name")
	public void select_building_name() {
		CreateVt.ClickOnBuildingNameDropdownList();
		CreateVt.SelectBuildingName();
	}

	@And("Select Visitor Sub-Type")
	public void select_visitor_sub_type() {
		CreateVt.ClickOnVisitorSubTypedropdowmList();
		CreateVt.SelectVisitorSubType();
	}

	@And("Select number of visitor")
	public void select_number_of_visitor() {
		CreateVt.ClickOnNumberOfVisitorDropdownList();
		CreateVt.SelectNumberOfVisitors();
	}

	@And("Select Visitor Company Name")
	public void select_visitor_company_name() {
		CreateVt.EnterVisitorCompanyName();
	}

	@And("Click on Gov Id checkbox")
	public void click_on_gov_id_checkbox() throws InterruptedException {
		CreateVt.ClickOnGovIdcheckbox();
	}

	@And("Write email on email field")
	public void write_email_on_email_field() {
		CreateVt.EnterEmailOfVisitor();
	}

	@And("click on search button")
	public void click_on_search_button() throws InterruptedException {
		CreateVt.ClickOnSearchButton();
	}

	@When("Click on Create visit button")
	public void click_on_create_visit_button() throws InterruptedException {
		CreateVt.ClickOnCreateVisitButton();
		Thread.sleep(1000);
	}

	@Then("Message should displayed {string}")
	public void message_should_displayed(String expectedMessage) throws InterruptedException {

		String ActMessage = CreateVt.MessageVerification();
		System.out.println("Actaul print message is : " + ActMessage);
		Thread.sleep(2000);
		Assert.assertEquals(ActMessage, expectedMessage);
		Thread.sleep(2000);

	}

	@Then("Close the Browser")
	public void close_the_browser() {
		driver.close();
		driver.quit();
	}

	// $$$$$$$$$$$$$$$$$$$$$$$ [ Direct-Walk-in ] $$$$$$$$$$$$$$$$$$//

	@Then("Click on main menu icon")
	public void click_on_main_menu_icon() throws InterruptedException {
		DirectWIn.mainMenu();
		Thread.sleep(2000);
	}

	@And("Select Direct Walk-In")
	public void select_direct_walk_in() {
		DirectWIn.directWalkin();
	}

	@Then("Go to To-Meet box and fill the email or name of the employee")
	public void go_to_to_meet_box_and_fill_the_email_or_name_of_the_employee() throws Exception {
		DirectWIn.toMeet();
	}

	@And("Click on Search field")
	public void click_on_search_field() {
		DirectWIn.searchBtn();
	}

	@Then("Click on Select Btn of suggested Employee Name")
	public void click_on_select_btn_of_suggested_employee_name() {
		DirectWIn.selectSugestedName();
	}

	@And("Select Visiting location from dropdown")
	public void select_visiting_location_from_dropdown() {
		DirectWIn.visitingLocDropdwn();
		DirectWIn.visitingLocName();
	}

	@And("Select Building Name from dropdown")
	public void select_building_name_from_dropdown() {
		DirectWIn.buildingNameDpwn();
		DirectWIn.buildingNme();
	}

	@And("Select Visitor Sub-Type from dropdown")
	public void select_visitor_sub_type_from_dropdown() throws InterruptedException {
		DirectWIn.visitorSubtypeDpwn();
		DirectWIn.vstrSubTypeName();
	}

	@And("Type Visitor Company Name")
	public void type_visitor_company_name() {
		DirectWIn.visitorsCompanyName();
	}

	@And("Select number of visitor from dropdown")
	public void select_number_of_visitor_from_dropdown() {
		DirectWIn.numbrOfVisitorDrpwn();
	}

	@And("Click on Gov Id checkbox1")
	public void click_on_gov_id_checkbox1() {
		DirectWIn.govIdCheckBox();
	}

	@Then("Enters Visitors Email as {string} and Name as {string}")
	public void enters_visitors_email_as_and_name_as(String EmailId, String name) throws InterruptedException {
		DirectWIn.emailField(EmailId); 
		DirectWIn.VisitorName(name);
	}

	@And("click on search btn")
	public void click_on_search_btn() throws InterruptedException {
		DirectWIn.searchButton();
	}

	// @@@@@@@@@@@@@@@@@@@@@@@@@@@ ELT VISIT @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\\

	@Then("Select Create ELT Visit")
	public void select_create_elt_visit() {
		EltVisitCreate.eltVisit();
	}

	@Then("Select number of visitor from dropdown list")
	public void select_number_of_visitor_from_dropdown_list() throws InterruptedException {
		EltVisitCreate.NumberOfVisitorDropDownList();
	}
	
	@Then("Enters Visitors EmailID as {string} and Name as {string}")
	public void enters_visitors_emailid_as_and_name_as(String EmailId, String name) throws InterruptedException {
		EltVisitCreate.emailField(EmailId); 
		EltVisitCreate.VisitorName(name);
	}

	@Then("click on search btn after email")
	public void click_on_search_btn_after_email() {
		EltVisitCreate.SearchAfterEmail();
	}

	// @@@@@@@@@@@@@@@@@@@@@@ Temporary Pass @@@@@@@@@@@@@@@@@@@@@@@@@@@@\\

	@Then("Go to Search Employee box and fill the name of the employee")
	public void go_to_search_employee_box_and_fill_the_name_of_the_employee() throws InterruptedException {
		TempPass.SearchEmployee();
	}

	@Then("Select Temporary Pass Icon")
	public void select_temporary_pass_icon() {
		TempPass.TemporaryPass();
	}

	@Then("Select Access Card number")
	public void select_access_card_number() throws InterruptedException {
		TempPass.AccessCardNumbr();
	}

	@Then("Click on Generate Temporary Pass")
	public void click_on_generate_temporary_pass() throws InterruptedException {
		TempPass.GenTempPass();
	}

	@Then("Click On Capture Image")
	public void click_on_capture_image() throws InterruptedException {
		TempPass.ImageCapture();
	}

	@Then("Click on GENERATE PASS Btn")
	public void click_on_generate_pass_btn() throws InterruptedException {
		TempPass.GeneratePas();
	}

	@Then("Click on Print PASS")
	public void click_on_print_pass() throws InterruptedException {
		TempPass.Printpass();

	}
	
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@ *Display Visitors* @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\\
	
	@Then("Click on Visit Approved button")
	public void click_on_visit_approved_button() {
		DisVisitr.ApprovedVisits();
	}

	@Then("Select Visitor detail for Updating details")
	public void select_visitor_detail_for_updating_details() {
		DisVisitr.SelctVsitorsDetails();
	}

	@Then("Click on GovId CheckBox")
	public void click_on_gov_id_check_box() {
		DisVisitr.GovIdCheckBox();
	}

	@Then("Select one of GovId from dropdown and fill the Id Number")
	public void select_one_of_gov_id_from_dropdown_and_fill_the_id_number() throws InterruptedException {
		DisVisitr.AdharCard();
		DisVisitr.AdharCardNumber();
	}

	@Then("Click on update details")
	public void click_on_update_details() {
		DisVisitr.Updates();
	}

	@When("Click on PRINT PASS btn")
	public void click_on_print_pass_btn() {
		DisVisitr.PrintPass();
	}

	@Then("Result shows as Print Pass")
	public void result_shows_as_print_pass() {
		DisVisitr.ResultPrintPassShow();
	}


}