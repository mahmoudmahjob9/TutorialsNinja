package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P04_HoverCategory;

import static drivers.DriverHolder.getDriver;

public class TC04_Search extends TestBase {

    P04_HoverCategory hoverCategoryobj;
    P01_HomePage homePageObj;
    @Test
    public  void  Searchbyword() throws InterruptedException {

        hoverCategoryobj=new P04_HoverCategory(getDriver());
        homePageObj=new P01_HomePage(getDriver());
        homePageObj.goToLoginPage();
        homePageObj.login(TC01_Register.email, TC01_Register.pass);
        hoverCategoryobj.SearchByWord("ipod touch");
        Thread.sleep(2000);
        Assert.assertTrue(getDriver().getPageSource().contains("Add to Cart"));

    }
}
