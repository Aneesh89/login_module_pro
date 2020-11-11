package runner;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.TestRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import managers.FileReaderManager;

@CucumberOptions(features = { "./features" }, glue = { "stepDefenition" }, tags= {"@t002"})
//plugin = { "pretty","html:target/cucumber-html-report","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }


public class UserManageRunner {

	private TestNGCucumberRunner testNGCucumberRunner;
	WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void setupClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
	
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());

	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void teardownclass() throws Exception {
		testNGCucumberRunner.finish();
		
//		driver.quit();
	}
	
//	@AfterClass
//	 public static void writeExtentReport() {
//	 Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
//	 }

}
