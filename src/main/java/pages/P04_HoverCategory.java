package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Utility;

import java.util.List;

import static pages.PageBase.hoverWebElement;

public class P04_HoverCategory {
    Actions actions;
    WebDriver driver;
    public P04_HoverCategory(WebDriver driver)
    {

        PageFactory.initElements(driver,this);
        this.driver= driver ;
        this.actions = new Actions(driver); // Initialize Actions
    }
    public void hoverRa(int index){
        WebElement categoryr= driver.findElement(By.xpath("(//div/ul[@class='nav navbar-nav']/li)["+index+"]"));
        hoverWebElement(driver,categoryr);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @FindBy(xpath = "//span[text()='My Account']")
    WebElement MyAccount;
    @FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=account/logout']")
    WebElement RegisterButton;
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement Search;
    @FindBy(xpath = "(//button[@type='button'])[4]")
    WebElement SearchButton;
    @FindBy(xpath = "(//span[text()='Currency'])")
    WebElement Currency;
    @FindBy(xpath = "(//button[@type='button'])[1]")
    WebElement option1;
    @FindBy(xpath = "(//button[@type='button'])[2]")
    WebElement option2;
    @FindBy(xpath = "(//button[@type='button'])[3]")
    WebElement option3;
    @FindBy(xpath = "(//a[text()='Desktops'])")
    WebElement Desktops;
    @FindBy(xpath = "(//a[text()='Laptops & Notebooks'])")
    WebElement Laptops;
    @FindBy(xpath = "(//a[text()='Components'])")
    WebElement Components;
    @FindBy(xpath = "(//a[text()='Tablets'])")
    WebElement Tablets;
    @FindBy(xpath = "(//a[text()='Software'])")
    WebElement Software;
    @FindBy(xpath = "(//a[text()='Phones & PDAs'])")
    WebElement Phones;
    @FindBy(xpath = "(//a[text()='Cameras'])")
    WebElement Cameras;
    @FindBy(xpath = "(//a[text()='MP3 Players'])")
    WebElement MP3Players;
    @FindBy(xpath  = "//a[contains(@href, 'https://tutorialsninja.com/demo/index.php?route=product/category&path=20')]")
    List<WebElement>  DesktopList;
    @FindBy(xpath = "//a[contains(@href, 'https://tutorialsninja.com/demo/index.php?route=product/category&path=18')]")
    List<WebElement> laptopList;
    @FindBy(xpath = "//a[contains(@href, 'https://tutorialsninja.com/demo/index.php?route=product/category&path=25')]")
    List<WebElement> componentList;
    @FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[7]")
    WebElement AddCart;
    @FindBy(xpath = "(//button[@data-toggle='tooltip'])[3]")
    WebElement wishlist;
    @FindBy(xpath = "(//button[@data-toggle='tooltip'])[4]")
    WebElement comparelist;


    @FindBy(tagName = "strong")
    WebElement STR;


    public void logout()
    {
        MyAccount.click();
        RegisterButton.click();
    }
    public  void  SearchByWord(String word)
    {
        Search.sendKeys(word);
        SearchButton.click();
    }
    public  void  ChooseCurrency()
    {
        Currency.click();
        int x= Utility.generateRandomNumber(3);
        System.out.println(x);
        if(x==1)
        {
            option1.click();
        } else if (x==2) {
            option2.click();
        }
        else {
            option3.click();
        }
        System.out.println(STR.getText());


    }
    public  void  Choosetabmenu() throws InterruptedException {
        int y= Utility.generateRandomNumber(8);
        System.out.println(y);
        if(y==1)
        {
         actions.moveToElement(Desktops).perform();
        }
        else if (y==2) {
            actions.moveToElement(Laptops).perform();

        }

        else if (y==3) {
            actions.moveToElement(Components).perform();

        }
     else if (y==4) {
            actions.moveToElement(Tablets).perform();

        }
        else if (y==5) {
            actions.moveToElement(Software).perform();

        }
        else if (y==6) {
            actions.moveToElement(Phones).perform();

        }
        else if (y==7) {
            actions.moveToElement(Cameras).perform();

        }
        else {
            actions.moveToElement(MP3Players).perform();

        }
        Thread.sleep(2000);


    }
    public  void  ChooseCategorymenu()  {
        int y = Utility.generateRandomNumber(3);
        System.out.println(y);
        if (y == 1) {
            actions.moveToElement(Desktops).perform();
            int randomIndex =Utility.generateRandomNumber(2);
            System.out.println(randomIndex);
            WebElement randomItem = DesktopList.get(randomIndex);
            actions.moveToElement(randomItem).click().perform();

        } else if (y == 2) {
            actions.moveToElement(Laptops).perform();
            int randomIndex =Utility.generateRandomNumber(2);
            System.out.println(randomIndex);
            WebElement randomItem = laptopList.get(randomIndex);
            actions.moveToElement(randomItem).click().perform();
        } else  {
            actions.moveToElement(Components).perform();
            int randomIndex =Utility.generateRandomNumber(5);
            System.out.println(randomIndex);
            WebElement randomItem = componentList.get(randomIndex);
            actions.moveToElement(randomItem).click().perform();

        }
    }

    public  String  Getword()
    {
       return STR.getText();
    }
    public  void  addcart()
    {
        AddCart.click();
    }
    public  void  wishlist()
    {
        wishlist.click();
    }
    public  void  comparelist()
    {
        comparelist.click();
    }


}
