package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest {
	//All Locators of page
	@FindBy(xpath="//h5[text()='Login']")
	WebElement txtLoginpg;
	
	@FindBy(name="username")
	WebElement usrname;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement loginBtn;
	
	
	//Initialization of Locators/Variables
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public String titleOfLoginPg()
	{
		return txtLoginpg.getText();
	}
	
	public void setUserName(String username) 
	{
		usrname.sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		pass.sendKeys(password);
	}
	
	public void clickLoginbtn()
	{
		loginBtn.click();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String  getBuildTitle()
	{
		return driver.getTitle();
	}
}


       