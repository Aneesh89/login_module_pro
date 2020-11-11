package pageObjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CctnsMenuPage {
	WebDriver webdriver;
	public CctnsMenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	@FindBy(how = How.XPATH, using = "//div[@id='content3']/div/div/ul/li/ul/li/a[@href='gdentry.htm ?stov=E0A1-N6W1-8B55-TMSL-AVHP-DBEY-KB1V-64GV']")
//	private WebElement GD_details;
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div[4]/div[1]/div/div/ul/li[4]/a/i[2]")
	private WebElement GDMenu;
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[2]/div[4]/div[1]/div/div/ul/li[4]/ul/li[1]/a")
	private WebElement Add_GD;	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[3]/div/div/div[2]/div/form/div[2]/div/div[1]/div/div[1]")
	private WebElement GD_Type_arrow;	
	@FindBy(how = How.XPATH, using = "/html/body/div/div[1]/div[2]/div[3]/div/div/div[2]/div/form/div[2]/div/div[1]/div/div[1]/div/div[1]")
	private WebElement GD_Type_Depature;	
	
	
//	public void click_GD_Details()
//	{
//		Actions action = new Actions(webdriver);
//		WebElement we = webdriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/ul/li[1]"));
//		action.moveToElement(we).moveToElement(webdriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/ul/li[1]/ul/li[1]/a"))).click().build().perform();
//	}
	
	public void GD_Menu_click()
	{
		GDMenu.click();
	}
	
	public void Add_GD_click()
	{
		Add_GD.click();
	}
	public void Click_GD_Type_arrouw()
	{
		GD_Type_arrow.click();
		
//			Select dropdown= new Select(GD_Type_arrow);
//			dropdown.selectByVisibleText("Accidents/Incidents");
		
	}
	public void Click_GD_Type_Depature()
	{
		GD_Type_Depature.sendKeys("arrival");
		
	}
	
	
}
