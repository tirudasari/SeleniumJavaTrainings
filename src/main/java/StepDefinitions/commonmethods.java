package StepDefinitions;

import PageObjects.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class commonmethods {

    LoginPage loginPage =null;

   public static  WebDriver driver;

    public commonmethods(){
        this.loginPage= new LoginPage(driver);
        PageFactory.initElements(driver,loginPage);
    }


    public void launchbrowser()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void enterdata()
    {
        loginPage.Userid.sendKeys("standard_user");
        loginPage.Password.sendKeys("secret_sauce");

    }
    public void clickbutton()
    {
       loginPage.Loginbutton.click();

    }





    public void pageverification()
    {
     String header=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]")).getText();
     if(header.contains("SWAG"))
     {
         System.out.println("Landedon login page");
     }
    }



    public void passdata( String userid, String password)
    {
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userid);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);


    }



    public void verifynavigation()
    {
        System.out.println("Landedon dashboard page");
    }

    public void closebrowser()
    {
        driver.close();
        driver.quit();
    }
}
