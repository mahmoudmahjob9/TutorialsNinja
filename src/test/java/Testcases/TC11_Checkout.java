package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P04_HoverCategory;
import pages.P07_Checkout;

import static drivers.DriverHolder.getDriver;
import static util.Utility.*;

public class TC11_Checkout extends TestBase{

    P01_HomePage homePageObj;
    P04_HoverCategory hoverCategoryobj;
    P07_Checkout checkout;
    String Firstname=generateRandomName(10);
    String LastName=generateRandomName(10);
    String adress1=generateRandomAddress();
    String adrees2=generateRandomAddress();
    String city="egypt";
    String company="test";
    String postcode="test seleinum";
    int country=generateRandomNumber(8);
    int zone=generateRandomNumber(8);



    @Test
    public  void  checkout() throws InterruptedException {

        homePageObj=new P01_HomePage( getDriver());
        hoverCategoryobj=new P04_HoverCategory( getDriver());
        checkout=new P07_Checkout( getDriver());
        homePageObj.goToLoginPage();
        homePageObj.login(TC01_Register.email, TC01_Register.pass);
       // homePageObj.login("testyyyy@yahoo.com", "@aujtnYDeJtn9j");
        hoverCategoryobj.SearchByWord("touch ipod");
        hoverCategoryobj.addcart();
        Thread.sleep(2000);
        System.out.println(zone);
        checkout.EnterCheckoutData(Firstname,LastName,company,adress1,adrees2,city,postcode,country,zone);
        Thread.sleep(2000);
        Assert.assertTrue( getDriver().getPageSource().contains("Your order has been"));


    }
}
