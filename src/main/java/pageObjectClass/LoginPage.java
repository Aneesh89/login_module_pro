package pageObjectClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class LoginPage {
//	WebDriver driver;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "username")
	private WebElement userName;
	
	@FindBy(how = How.NAME, using ="password")
	private WebElement password;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"app\"]/div[1]/div/div[2]/div/div[3]/div/form/div[6]/div/button[2]")
	private WebElement submit;
	@FindBy(how = How.XPATH, using ="/html/body/div[2]/div/div[3]/button[1]")
	private WebElement remove_sessionBtn;
	@FindBy(how = How.XPATH, using ="/html/body/div[2]/div/div[3]/button[1]")
	private WebElement remove_OKBtn;
	
	
	
	
	public void sendUserName() {
		userName.sendKeys("pply123");
	}
	
	public void sendPassword() {
		password.sendKeys("cctns@123");
//		Wait.untilPageLoadComplete(driver);
	}
	
	public void click_Submit_Button() {
		submit.click();	
	}
	public void click_remove_session() {
		remove_sessionBtn.click();	
	}
	public void click_remove_OK() {
		remove_OKBtn.click();	
	}
	
	
}
