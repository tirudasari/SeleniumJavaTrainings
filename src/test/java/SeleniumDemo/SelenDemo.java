package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelenDemo {

    public static void main(String args[]) throws InterruptedException {

//        String Driverpath="D:\\SeleniumMaven\\src\\main\\resources\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
        // waits till page load or page objects load, single webpage use. for every instance, history will be removed, cookies

//        driver.navigate().to("http://the-internet.herokuapp.com/"); //it allows you diffrent navigations-->

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//        driver.findElement(By.partialLinkText("Checkboxes")).click();

        driver.findElement(By.xpath("//input[@id='radio1']")).click();
        driver.findElement(By.xpath("//input[@value='Car']")).click();
        WebElement img = driver.findElement(By.xpath("//*[@id='Image1_img']"));
        WebElement lname = driver.findElement(By.xpath("//input[@id='text1']"));

        Actions obj1 = new Actions(driver);
//        obj1.moveToElement(lname).sendKeys("DASA").perform();
        obj1.sendKeys(lname,"Dasa").perform();


//        obj1.moveToElement(img).doubleClick().perform();
//
//        Thread.sleep(10000);
//
//        obj1.keyDown(Keys.CONTROL);
        obj1.contextClick(lname).perform();
//
//        WebElement hoverelement = driver.findElement(By.xpath("//*[@id='developers-menu-toggle']/span"));
//
//
//        obj1.moveToElement(hoverelement).perform();
//
//
//      WebElement li1= driver.findElement(By.xpath("//*[@id='developers-menu-dropdown']/li[6]/a"));
//       obj1.moveToElement(li1).doubleClick().perform();



//        List<WebElement> list1=driver.findElements(By.partialLinkText("Checkboxes"));
//
//        Thread.sleep(10000);
//        driver.navigate().back();
//        Thread.sleep(10000);
//        driver.navigate().forward();
//        Thread.sleep(10000);
//        driver.navigate().refresh();


//        driver.findElement(By.xpath("//input[@id='checkboxes']/text()[1]")).click();

//        WebElement element = driver.findElement(By.id("dropdown"));
//        Select dropdown = new Select(element);
////        dropdown.selectByIndex(0);
//
////        dropdown.selectByValue("1");
//        dropdown.selectByVisibleText("Option 1");

//        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");
//        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
//        driver.findElement(By.xpath("//*[@id='login-button']")).click();


//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header_container']/div[1]/div[2]/div")));
//
//
//        Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(30))
//                        .pollingEvery(Duration.ofSeconds(5));
//        WebElement element1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header_container']/div[1]/div[2]/div")));



//        driver.close(); // close the browser instance
//        driver.quit();  // webdriver object will be quit/close







//        WebDriver driver1= new EdgeDriver();
//        WebDriver driver2= new FirefoxDriver();
//        WebDriver driver3= new InternetExplorerDriver();
//        WebDriver driver4= new SafariDriver();
//        RemoteWebDriver driver5 = new ChromeDriver();
//        ChromeDriver driver6 = new ChromeDriver();


    }

}
