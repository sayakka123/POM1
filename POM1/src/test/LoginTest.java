package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{
@Test(priority=0)
public void verifyTitleOfLoginPg()
{
	String verifyTitleOfLoginPg=loginpage.titleOfLoginPg();
	Assert.assertEquals(verifyTitleOfLoginPg, "Login");
}

@Test(priority=1)
public void verifyTitleOfBuild()
{
	String verifyTitleOfBuild=loginpage.getBuildTitle();
	Assert.assertEquals(verifyTitleOfBuild, "OrangeHRM")
	;
}
@Test(priority=-1)
public void verifyUrl()
{
	String url=loginpage.getUrl();
	Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@Test(priority=2)
public void verifyLognWithCorrectCredintial()
{
	loginpage.setUserName("Admin");
	loginpage.setPassword("admin123");
	loginpage.clickLoginbtn();
	String verifydashboardtitle=dashboardpg.getDashboardTitle();
	Assert.assertEquals(verifydashboardtitle, "DashBoard");
}
}
