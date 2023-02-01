package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class iframesDemo {

    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//a[text()='Button']")).click();

        int iframecount= driver.findElements(By.tagName("iframe")).size();
        System.out.println("iframes in the page     "+iframecount);

        WebElement ele = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(ele);
        driver.findElement(By.xpath("(//button[text()='A button element'])[1]")).click();

//        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();


        driver.findElement(By.xpath("//a[text()='Accordion']")).click();






    }
}
