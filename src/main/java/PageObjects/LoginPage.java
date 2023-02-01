package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

WebDriver driver;

    @FindBy(xpath = "//input[@id='user-name']")
    @CacheLookup
    public WebElement Userid;

    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    public WebElement Password;

    @FindBy(xpath = "//input[@id='login-button']")
    @CacheLookup
    public WebElement Loginbutton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]")
    @CacheLookup
    public WebElement title;

    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void enterdata()
    {
        Userid.sendKeys("standard_user");
        Password.sendKeys("secret_sauce");

    }
//
    public void clickbutton()
    {
       Loginbutton.click();

    }
//
//    public void pageverification()
//    {
//        String header=title.getText();
//        if(header.contains("SWAG"))
//        {
//            System.out.println("Landedon login page");
//        }
//    }



}