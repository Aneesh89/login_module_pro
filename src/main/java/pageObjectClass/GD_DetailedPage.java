package pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class GD_DetailedPage {
	
	WebDriver webdriver;
	public GD_DetailedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how = How.ID, using = "addGd")
	private WebElement addGdBtn;
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/form/div[1]/div/div[2]/div/input")
	private WebElement subject_txt;
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/div/div[2]/div/div/div/form/div[2]/div/div[2]/div/textarea")
	private WebElement GD_Brief_txt;
	
	
	
	public void Add_GD_Button()
	{
		addGdBtn.click();
	}
	
	public void enterSubject() 
	{
		subject_txt.sendKeys("haihaihaihaihai");
	}
	
	public void Gd_Brief_TxtArea() 
	{
		GD_Brief_txt.sendKeys("haihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihaihai");
	}
	
	
	
}
