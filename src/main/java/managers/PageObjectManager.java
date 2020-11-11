package managers;

import org.openqa.selenium.WebDriver;

import pageObjectClass.CctnsMenuPage;
import pageObjectClass.GD_DetailedPage;
import pageObjectClass.HomePage;
import pageObjectClass.LoginPage;

public class PageObjectManager {

	private WebDriver driver;
	private HomePage homepage;
	private LoginPage loginPage;
	private CctnsMenuPage menuPage;
	private GD_DetailedPage detailed_GD_page;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	public HomePage getHomePage() {

		return (homepage == null) ? homepage = new HomePage(driver) : homepage;

	}

	public LoginPage getLoginPage() {

		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;

	}

	public CctnsMenuPage getMenuPage() {

		return (menuPage == null) ? menuPage = new CctnsMenuPage(driver) : menuPage;

	}
	
	public GD_DetailedPage getGD_Dtailed_Page() {

		return (detailed_GD_page == null) ? detailed_GD_page = new GD_DetailedPage(driver) : detailed_GD_page;

	}

}
