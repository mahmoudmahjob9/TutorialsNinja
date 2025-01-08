package Testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;

import static drivers.DriverHolder.getDriver;

public class TC02_Login extends TestBase   {

    P01_HomePage homePageObj;
    @Test(priority = 2)
    public  void login()
    {
        homePageObj =new P01_HomePage( getDriver());

        homePageObj.goToLoginPage();
        homePageObj.login(TC01_Register.email, TC01_Register.pass);
       Assert.assertEquals( getDriver().getCurrentUrl(),"https://tutorialsninja.com/demo/index.php?route=account/account");
    }
//    @Test(priority = 2)
//    public  void invalidLogin()
//    {
//        homePage=new  P01_Home(driver);
//        loginPage=new P03_Login(driver);
//        homePage.goToLoginPage();
//        loginPage.login("test@test.com","12345678");
//    }

}
