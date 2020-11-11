package stepDefenition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Background;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import extendListner.Extendreportlisten;
import managers.PageObjectManager;
import managers.Webdrivermanager;
import pageObjectClass.CctnsMenuPage;
import pageObjectClass.GD_DetailedPage;
import pageObjectClass.HomePage;
import pageObjectClass.LoginPage;

@Test
public class UserManageStepDef extends Extendreportlisten {

	WebDriver driver;
	Webdrivermanager webDriverManager;
	PageObjectManager pageObjectManager;
	HomePage homePage;
	LoginPage loginPage;
	CctnsMenuPage menuPage;
	GD_DetailedPage gd_detailPage;


	@Given("^User is on the Home Page$")
	public void user_is_on_the_Home_Page() throws Throwable {
		ExtentTest logInfo = null;
		try {
			test = extent.createTest(Feature.class, "User Management Testing");
			test = test.createNode(Background.class, "Navigate to Home Page ");
			logInfo = test.createNode(new GherkinKeyword("Given"), "User is on the Home Page");

			webDriverManager = new Webdrivermanager();
			driver = webDriverManager.getDriver();

			pageObjectManager = new PageObjectManager(driver);
			homePage = pageObjectManager.getHomePage();
			homePage.navigateTo_HomePage();

			logInfo.pass("Home Page Navigation Done Successfully");
//			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
		} catch (AssertionError | Exception e) {
		
			// testStep("FAIL", driver, logInfo, e);
		}
	}
	
	@When("^pass the Incorrect Username$")
	public void pass_the_Incorrect_Username() throws Throwable {
		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("When"),
					"pass the  Username");

			loginPage = pageObjectManager.getLoginPage();
			loginPage.sendUserName();
			Thread.sleep(8000);
			logInfo.pass("Username Successfully Done");
//			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
		} catch (AssertionError | Exception e) {
			
			// testStep("FAIL", driver, logInfo, e);
		}
	   
	}

	@Then("^Pass the Password$")
	public void pass_the_Password() throws Throwable {
		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"Pass the Password");

			loginPage = pageObjectManager.getLoginPage();
			loginPage.sendPassword();	
//			Thread.sleep(8000);
			logInfo.pass("Password Successfully Done");
//			logInfo.addScreenCaptureFromPath(captureScreenShot(driver));
		} catch (AssertionError | Exception e) {
			
			// testStep("FAIL", driver, logInfo, e);
		}
	}

	@Then("^type capcha code$")
	public void type_capcha_code() throws Throwable {
		String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
		driver.findElement(By.name("captcha")).sendKeys(captchaVal);
		Thread.sleep(3000);
	}

	@Then("^click on the submit button$")
	public void click_on_the_submit_button() throws Throwable {
		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"click on the submit button");

			loginPage = pageObjectManager.getLoginPage();
			loginPage.click_Submit_Button();
			Thread.sleep(8000);
			logInfo.pass("click on the submit button Successfully Done");
		} catch (AssertionError | Exception e) {
			
			// testStep("FAIL", driver, logInfo, e);
		}
	}
	
	
	@Then("^select GD menu$")
	public void select_GD_menu() throws Throwable {
		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"select GD menu");

			menuPage = pageObjectManager.getMenuPage();
			Thread.sleep(5000);
			menuPage.GD_Menu_click();
			Thread.sleep(8000);
			menuPage.Add_GD_click();
			Thread.sleep(5000);
//			menuPage.Click_GD_Type_arrouw();
//			menuPage.Click_GD_Type_Depature();
//			Thread.sleep(8000);
			logInfo.pass("select GD menu Successfully Done");
		} catch (AssertionError | Exception e) {
			
			// testStep("FAIL", driver, logInfo, e);
		}
	}
	
	@Then("^Add GD Depature$")
	public void add_GD_Depature() throws Throwable {
		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"Add GD Depature");

			menuPage = pageObjectManager.getMenuPage();
			Thread.sleep(3000);
			menuPage.Click_GD_Type_arrouw();
			Thread.sleep(8000);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CAPS_LOCK);
			robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER); 
			robot.keyPress(KeyEvent.VK_CAPS_LOCK);
			robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
			
			
//			menuPage.Click_GD_Type_Depature();
//			Thread.sleep(8000);
			logInfo.pass("Add GD Depature");
		} catch (AssertionError | Exception e) {
			
			// testStep("FAIL", driver, logInfo, e);
		}
	}
	
	@Then("^Type Arrival$")
	public void type_Arrival() throws Throwable {
		System.out.println("hhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		
	}
	
	
	@Then("^Enter GD Subject And GD Brief$")
	public void enter_GD_Subject_And_GD_Brief() throws Throwable {
		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"Enter GD Subject And GD Brief");

			gd_detailPage = pageObjectManager.getGD_Dtailed_Page();
			Thread.sleep(3000);
			gd_detailPage.Add_GD_Button();
			Thread.sleep(3000);
			gd_detailPage.enterSubject();
			Thread.sleep(3000);
			gd_detailPage.Gd_Brief_TxtArea();
			Thread.sleep(3000);
			
			logInfo.pass("Add GD Depature");
		} catch (AssertionError | Exception e) {
			
			// testStep("FAIL", driver, logInfo, e);
		}
	}
	@Then("^Remove previous session$")
	public void remove_previous_session() throws Throwable {
//		System.out.println("hhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		ExtentTest logInfo = null;
		try {
			logInfo = test.createNode(new GherkinKeyword("Then"),
					"click on the submit button");

			loginPage = pageObjectManager.getLoginPage();
			Thread.sleep(3000);
			loginPage.click_remove_session();
			Thread.sleep(8000);
			loginPage.click_remove_OK();
			logInfo.pass("Remove Session Successfully Done");
		} catch (AssertionError | Exception e) {
			
			// testStep("FAIL", driver, logInfo, e);
		}
	}

}
