package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P07_Checkout {
    public P07_Checkout(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    // locators
    @FindBy(xpath = "(//button[@data-loading-text='Loading...'])[1]")
    WebElement itemButton;
    @FindBy(xpath = "(//a[@href='https://tutorialsninja.com/demo/index.php?route=checkout/checkout'])[2]")
    WebElement checkoutButton;
    @FindBy(id = "input-payment-firstname")
    WebElement firstName;
    @FindBy(id = "input-payment-lastname")
    WebElement lastname;
    @FindBy(id = "input-payment-company")
    WebElement company;
    @FindBy(id = "input-payment-address-1")
    WebElement address1;
    @FindBy(id = "input-payment-address-2")
    WebElement address2;
    @FindBy(id = "input-payment-city")
    WebElement city;
    @FindBy(id = "input-payment-postcode")
    WebElement postcode;
    @FindBy(id = "input-payment-country")
    WebElement country;
    @FindBy(id = "input-payment-zone")
    WebElement  zone1;
    @FindBy(xpath = "//select[@id='input-payment-zone']/option")
    List<WebElement>  zone;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement agree;
    @FindBy(id = "button-payment-address")
    WebElement confirmPaymentAddress;
    @FindBy(id = "button-shipping-address")
    WebElement confirmShippingAddress;
    @FindBy(id = "button-shipping-method")
    WebElement confirmShippingMethod;
    @FindBy(id = "button-payment-method")
    WebElement confirmPaymentMethod;
    @FindBy(id = "button-confirm")
    WebElement confirmOrder;


    public void EnterCheckoutData(String Firstname, String Lastname, String Company, String Adrees1, String Adress2, String City, String PostCode, int x, int y) throws InterruptedException {
        this.itemButton.click();
        this.checkoutButton.click();
        this.firstName.sendKeys(Firstname);
        this.lastname.sendKeys(Lastname);
        this.company.sendKeys(Company);
        this.address1.sendKeys(Adrees1);
        this.address2.sendKeys(Adress2);
        this.city.sendKeys(City);
        this.postcode.sendKeys(PostCode);
    Select option=new Select(country);
    option.selectByIndex(x);
    //zone1.click();
    Thread.sleep(3000);
    zone.get(y).click();
    Thread.sleep(3000);
        this.confirmPaymentAddress.click();
    Thread.sleep(3000);
        this.confirmShippingAddress.click();
    Thread.sleep(2000);
        this.confirmShippingMethod.click();
    Thread.sleep(2000);
        this.agree.click();
        this.confirmPaymentMethod.click();
    Thread.sleep(2000);
        this.confirmOrder.click();
    }
}
