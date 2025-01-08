package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P04_HoverCategory;

import static drivers.DriverHolder.getDriver;

public class TC05_Changecurrency extends TestBase{

    P04_HoverCategory hoverCategoryobj;
    P01_HomePage homePageObj;
    @Test
    public  void  ChosseCurrency() throws InterruptedException {

        hoverCategoryobj=new P04_HoverCategory(getDriver());
        homePageObj=new P01_HomePage(getDriver());
        homePageObj.goToLoginPage();
        homePageObj.login(TC01_Register.email, TC01_Register.pass);
        hoverCategoryobj.ChooseCurrency();
        Thread.sleep(2000);
        Assert.assertTrue(getDriver().getPageSource().contains(hoverCategoryobj.Getword()));


    }
}
