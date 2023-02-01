package TestNGDemo;

import StepDefinitions.commonmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Testngdemotest {
  WebDriver driver;

    commonmethods common = new commonmethods();


  @BeforeMethod
    public void loginpage()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test(priority = 2)
    public void Login()
    {
       System.out.println("This is Test case 1");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath(("//input[@id='password']"))).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

    }

    @Test(priority = 3)
    public void Addtocart()
    {
        System.out.println("This is Test case 2");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath(("//input[@id='password']"))).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();


    }

    @Test(priority = 1)
    public void removefromcart()
    {
        System.out.println("This is Test case 3");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath(("//input[@id='password']"))).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();


    }

    @Test(invocationCount = 10)
    public void clicallitems()
    {
        System.out.println("This is Test case 4");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath(("//input[@id='password']"))).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();


    }


    @Test
    public void Delete()
    {
        System.out.println("This is Test case with default priority");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath(("//input[@id='password']"))).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();



    }

    @AfterMethod
    public void closebrowser()
    {
        driver.close();
//        driver.quit();
    }

    @AfterTest
    public void report()
    {

    }

}
