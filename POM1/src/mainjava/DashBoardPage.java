package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashBoardPage extends BaseTest {
@FindBy(xpath="//h6[text()='Dashboard']")
WebElement titleOfDashboard;

public DashBoardPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public String getDashboardTitle()
{
	return titleOfDashboard.getText();
}
}
