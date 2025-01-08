package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_HomePage {
    public P01_HomePage(WebDriver driver)
    {

        PageFactory.initElements(driver,this);
    }
    // locators
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement MyAccount;
    @FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=account/register']")
    WebElement RegisterButton;
    @FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=account/login']")
    WebElement LoginButton;
    @FindBy(id = "input-firstname")
    WebElement FirstName;
    @FindBy(id = "input-lastname")
    WebElement LastName;
    @FindBy(id = "input-email")
    WebElement Email;
    @FindBy(id = "input-telephone")
    WebElement Telephone;
    @FindBy(id = "input-password")
    WebElement Password;
    @FindBy(id = "input-confirm")
    WebElement PasConfirm;
    @FindBy(xpath = "//input[@name='agree']")
    WebElement Agree;
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement Continue;
    //login
    @FindBy(id = "input-email")
    WebElement emaillogin;
    @FindBy(id = "input-password")
    WebElement passLogin;
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;
    @FindBy(xpath = "//a[@href='https://tutorialsninja.com/demo/index.php?route=account/forgotten']")
    WebElement forgettenpass;



    public void goToRegisterPage() {

        MyAccount.click();
        RegisterButton.click();

    }
    public void goToLoginPage() {
        MyAccount.click();
        LoginButton.click();
    }

    public  void  registerWithRandomData(String Fname,String Lname,String email,String phone,String pass,String ConfirmPass) {
        FirstName.sendKeys(Fname);
        LastName.sendKeys(Lname);
        Email.sendKeys(email);
        Telephone.sendKeys(phone);
        Password.sendKeys(pass);
        PasConfirm.sendKeys(ConfirmPass);
        Agree.click();
        Continue.click();
        System.out.println(email);
        System.out.println(pass);
    }
    public void login(String name,String password)
    {
        emaillogin.sendKeys(name);
        passLogin.sendKeys(password);
        loginButton.click();


    }
    public void goToChangePassPage()
    {
        forgettenpass.click();

    }
}
