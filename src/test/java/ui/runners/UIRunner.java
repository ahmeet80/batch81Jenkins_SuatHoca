package ui.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","html:target//cucumber-reports.html",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"},
        features="src/test/resources/uiFeatures",
        glue="ui/stepdef",
        tags="@a"  ,
        dryRun= false
)
public class UIRunner {


}
