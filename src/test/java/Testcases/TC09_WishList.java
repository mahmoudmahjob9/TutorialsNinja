package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P04_HoverCategory;

import static drivers.DriverHolder.getDriver;

public class TC09_WishList extends TestBase{

    P01_HomePage homePageObj;
    P04_HoverCategory hoverCategoryobj;
    @Test
    public  void  wishlist() throws InterruptedException {

        homePageObj=new P01_HomePage( getDriver());
        hoverCategoryobj=new P04_HoverCategory( getDriver());
        homePageObj.goToLoginPage();
        homePageObj.login(TC01_Register.email, TC01_Register.pass);
        //homePageObj.login("testyyyy@yahoo.com", "@aujtnYDeJtn9j");
        hoverCategoryobj.SearchByWord("mac");
        hoverCategoryobj.wishlist();

        Thread.sleep(4000);
        Assert.assertTrue( getDriver().getPageSource().contains("Success: You have added"));


    }
}
