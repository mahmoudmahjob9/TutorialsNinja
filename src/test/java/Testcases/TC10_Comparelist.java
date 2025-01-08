package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P04_HoverCategory;

import static drivers.DriverHolder.getDriver;

public class TC10_Comparelist extends TestBase{

    P01_HomePage homePageObj;
    P04_HoverCategory hoverCategoryobj;
    @Test
    public  void  compareList() throws InterruptedException {

        homePageObj=new P01_HomePage( getDriver());
        hoverCategoryobj=new P04_HoverCategory( getDriver());
        homePageObj.goToLoginPage();
        homePageObj.login(TC01_Register.email, TC01_Register.pass);
        hoverCategoryobj.SearchByWord("mac");
        hoverCategoryobj.comparelist();

        Thread.sleep(2000);
        Assert.assertTrue( getDriver().getPageSource().contains(" Success: You have added "));


    }
}
