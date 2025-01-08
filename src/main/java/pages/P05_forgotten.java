package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_forgotten {
    public  P05_forgotten(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="input-email")
    WebElement mail;
    @FindBy(xpath="//input[@value='Continue']")
    WebElement Continue;
    public  void  ClickOncontinueButton(String mail1)
    {
        mail.sendKeys(mail1);
        Continue.click();
    }
}
