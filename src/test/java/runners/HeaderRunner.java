package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps", "hooks", "configurations"},
        plugin = {
                "pretty",
                "html:target/header-report.html",
                "json:target/header-report.json"
        },
        tags = "@Header"
)
public class HeaderRunner{
}
