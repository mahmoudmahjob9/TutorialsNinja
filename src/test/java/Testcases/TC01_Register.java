package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;

import static drivers.DriverHolder.getDriver;
import static util.Utility.*;

public class TC01_Register extends TestBase {

    P01_HomePage homePage;

    String firstname = generateRandomName(10);
    String lastName = generateRandomName(10);
    public static String email = generateRandomEmail();
    String phone = generateRandomSaudiNumberWithCountryCode();
    public static String pass = generateComplexPassword(14);
    String confirmpass = pass;


    @Test(priority = 1)
    public void registerWithValidData_p() throws InterruptedException {
        homePage = new P01_HomePage(getDriver());
        homePage.goToRegisterPage();
        homePage.registerWithRandomData(firstname, lastName, email, phone, pass, confirmpass);
        Thread.sleep(2000);
        Assert.assertTrue(getDriver().getPageSource().contains("Your Account Has Been Created!"));


    }
}
