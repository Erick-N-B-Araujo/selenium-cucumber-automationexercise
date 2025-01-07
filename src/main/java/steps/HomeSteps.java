package steps;

import configurations.BaseTest;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import pageobjects.HomePage;

import static org.junit.Assert.assertTrue;

public class HomeSteps extends BaseTest {
    HomePage homePage = new HomePage(driver);
    //homePage = new HomePage(driver);
    @Given("the user is on the home page")
    public void theUserIsOnTheHomePage() {
        setup();
        driver.get("https://www.automationexercise.com/search");
        WebElement siteLogo = driver.findElement(homePage.siteLogo);
        assertTrue(siteLogo.isDisplayed());
    }
}
