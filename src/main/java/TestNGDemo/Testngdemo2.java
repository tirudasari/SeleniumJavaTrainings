package TestNGDemo;

import StepDefinitions.commonmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

@Listeners(TestNGListenersDemo.class)
public class Testngdemo2 {

    WebDriver driver;

    @BeforeMethod
    public void loginpage2()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }



   @Test
    public void Login2()
    {
        System.out.println("This is Test case 1");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath(("//input[@id='password']"))).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Reporter.log("Test case result is pass");
//        Assert.fail();

    }
    @Test
    public void Login3()
    {
        System.out.println("This is Test case 1");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath(("//input[@id='password']"))).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Reporter.log("Test case result is pass");
//        Assert.fail();

    }
    @Test
    public void Login4()
    {
        System.out.println("This is Test case 1");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath(("//input[@id='password']"))).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Reporter.log("Test case result is pass");
//        Assert.fail();

    }

}
