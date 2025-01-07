package steps;

import configurations.BaseTest;
import configurations.Utils;
import configurations.WebDriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HeaderPage;

public class HeadersSteps extends BaseTest {
    HeaderPage headerPage = new HeaderPage();
    WebDriverManager webDriverManager = new WebDriverManager();
    @When("the user click on {string} header link")
    public void theUserClickOnHeaderLink(String link) {
        if (link.equals("Video Tutorials")) {
            headerPage.clickHeaderLink(link);
        } else {
            headerPage.clickHeaderLink(link);
            webDriverManager.getDriver().navigate().refresh();
            headerPage.clickHeaderLink(link);
        }
    }
    @Then("the user sees {string} title")
    public void theUserSeesTitle(String title) {
        if (title.equals("Video Tutorials")) {
            Utils utils = new Utils(webDriverManager.getDriver());
            utils.switchBrowserTab();
        }
        headerPage.verifyTitle(title);
    }
}
