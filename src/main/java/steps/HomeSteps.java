package steps;

import configurations.BaseTest;
import configurations.WebDriverManager;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pageobjects.HomePage;

import static org.junit.Assert.assertTrue;

public class HomeSteps extends BaseTest {
    WebDriverManager webDriverManager = new WebDriverManager();
    HomePage homePage = new HomePage(webDriverManager.getDriver());
    @Given("the user is on the home page")
    public void theUserIsOnTheHomePage() throws InterruptedException {
        webDriverManager.setupDriver();
        webDriverManager.getDriver().get("https://www.automationexercise.com/");
        WebElement siteLogo = webDriverManager.getDriver().findElement(homePage.siteLogo);
        assertTrue(siteLogo.isDisplayed());
    }
}
