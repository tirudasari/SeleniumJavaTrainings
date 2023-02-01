package StepDefinitions;


import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStepdefs {

        WebDriver driver;

        commonmethods cmd1 = new commonmethods();
        LoginPage loginPage = new LoginPage(driver);

        @Given("^User opens the Browser and enter the url$")
        public void openbrowser()
        {
          cmd1.launchbrowser();
        }

        @Then("^Verify that Login page is displayed$")
        public void verifythepage()
        {
//                cmd1.pageverification();
        }
        @And("^User enters the userid and password$")
        public void entercredentials()
        {
               loginPage.enterdata();
        }
        @Then("^user clicks on Login button$")
        public void clicklogin()
        {
           cmd1.clickbutton();
        }
        @Then("^Verfy that user is nvigated to Dashboard page$")
        public void verifynavigation()
        {
//           cmd1.verifynavigation();
        }

        @Then("Close the browser")
        public void closeTheBrowser() {
//                cmd1.closebrowser();

        }

        @And("User enters the {string} and {string}")
        public void userEntersTheUseridAndPassword(String userid,String password) {
//                cmd1.passdata(userid,password);

        }

}
