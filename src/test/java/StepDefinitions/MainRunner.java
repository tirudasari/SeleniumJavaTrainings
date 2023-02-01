package StepDefinitions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin={"pretty",
//        "html:target/cucumber",
//        "summary"},
        features={"src/main/java/Features/Login2.feature",
                  "src/main/java/Features/Login.feature"},
        glue={"StepDefinitions"}
//        snippets=CAMELCASE,
//        dryRun = false,
//        tags="@SmokeTest"

)

public class MainRunner {



}
