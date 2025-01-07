package steps;

import configurations.BaseTest;
import configurations.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pageobjects.HeaderPage;

import java.util.Set;

public class HeadersSteps extends BaseTest {
    HeaderPage headerPage = new HeaderPage(driver);
    @When("the user click on {string} header link")
    public void theUserClickOnHeaderLink(String link) {
        if (link.equals("Video Tutorials")) {
            headerPage.clickHeaderLink(link);
        } else {
            headerPage.clickHeaderLink(link);
            driver.navigate().refresh();
            headerPage.clickHeaderLink(link);
        }
    }
    @Then("the user sees {string} title")
    public void theUserSeesTitle(String title) {
        if (title.equals("Video Tutorials")) {
            utils.switchBrowserTab();
        }
        headerPage.verifyTitle(title);
        tearDown();
    }
}
