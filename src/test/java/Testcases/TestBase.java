package Testcases;
import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static drivers.DriverHolder.*;
import static pages.PageBase.quitBrowser;


public class TestBase {
//   static   WebDriver driver;

@Parameters("browsername")

    @BeforeTest
    public  void  OpenBrower(@Optional String browsername)
    {
        setDriver(DriverFactory.getNewInstance(""));
//         driver=new ChromeDriver();
//        driver.manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        getDriver().get("https://tutorialsninja.com/demo/index.php?route=common/home");

    }

    @AfterTest
    public void TearDown() {
        //getDriver().quit();
        quitBrowser(getDriver());
    }
}
