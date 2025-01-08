package Testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P04_HoverCategory;

import static drivers.DriverHolder.getDriver;
import static util.Utility.generateRandomNumber;

public class TC06_HoverOnMenu extends  TestBase{

    P04_HoverCategory hoverCategoryobj;
    P01_HomePage homePageObj;
    int index =generateRandomNumber(8);
//    @Test
//    public  void  Hoveronmenu() throws InterruptedException {
//        login=new P03_Login(getDriver());
//        hoverCategoryobj=new P04_HoverCategory(getDriver());
//        home=new P01_Home(getDriver());
//        home.goToLoginPage();
//        login.login(TC01_Register.email, TC01_Register.pass);
//        hoverCategoryobj.Choosetabmenu();
//        Thread.sleep(2000);
//
//    }

    @Test(priority = 1)
    public void hoverRandomCategory_P(){

        homePageObj=new P01_HomePage(getDriver());
        homePageObj.goToLoginPage();
        homePageObj.login(TC01_Register.email, TC01_Register.pass);
        // homePageObj.login("testyyyy@yahoo.com", "@aujtnYDeJtn9j");
        hoverCategoryobj =new P04_HoverCategory(getDriver());
        hoverCategoryobj.hoverRa(index);

    }
}
