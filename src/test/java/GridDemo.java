import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridDemo {
    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.WIN10);

        ChromeOptions opts = new ChromeOptions();
        opts.merge(dc);

        String huburl = "http://192.168.0.104:4444/wd/hub";
//        String huburl = "http://localhost:4444/wd/hub";

        WebDriver driver = new RemoteWebDriver(new URL(huburl),opts);
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }
}
