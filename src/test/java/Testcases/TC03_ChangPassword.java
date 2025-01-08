package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P05_forgotten;

import static drivers.DriverHolder.getDriver;

public class TC03_ChangPassword extends TestBase{
    P01_HomePage homePageObj;
    P05_forgotten forgetObj;

@Test
    public void changePassword() throws InterruptedException {
    homePageObj=new P01_HomePage(getDriver());
    forgetObj=new P05_forgotten(getDriver());

    homePageObj.goToLoginPage();
    homePageObj.goToChangePassPage();
    forgetObj.ClickOncontinueButton(TC01_Register.email);
        Thread.sleep(2000);
        Assert.assertTrue(getDriver().getPageSource().contains("An email with a confirmation link has been sent your email address."));
    }
}
