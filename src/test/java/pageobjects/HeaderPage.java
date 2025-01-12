package pageobjects;

import configurations.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage {
    WebDriverManager webDriverManager = new WebDriverManager();
    WebDriver driver = webDriverManager.getDriver();
    By headerProducts = By.xpath("//a[contains(text(), 'Products')]");
    By headerCart = By.xpath("//a[contains(text(), 'Cart')]");
    By headerSignupLogin = By.xpath("//a[contains(text(), 'Signup / Login')]");
    By headerHome = By.xpath("//a[contains(text(), 'Home')]");
    By headerTestCases = By.xpath("//a[contains(text(), 'Test Cases')]");
    By headerVideoTutorials = By.xpath("//a[contains(text(), 'Video Tutorials')]");
    By headerApiTesting = By.xpath("//a[contains(text(), 'API Testing')]");
    By headerContactUs = By.xpath("//a[contains(text(), 'Contact us')]");
    By titleHome = By.xpath("//h2[contains(text(), 'Features Items')]");
    By titleProducts = By.xpath("//h2[contains(text(), 'All Products')]");
    By titleCart = By.xpath("//li[contains(text(), 'Shopping Cart')]");
    By titleSignupLogin = By.xpath("//h2[contains(text(), 'Login to your account')]");
    By titleTestCases = By.xpath("//b[contains(text(), 'Test Cases')]");
    By titleApiTesting = By.xpath("//b[contains(text(), 'APIs List for practice')]");
    By titleVideoTutorials = By.xpath("//span[contains(text(), 'AutomationExercise')]");
    By titleContactUs = By.xpath("//h2[contains(text(), 'Contact')]");
    By btnClose = By.xpath("//span[contains(text(), 'Close')]");
    public By iframeAdvertisement = By.id("ad_iframe");
    public HeaderPage() {
    }
    /**
     * Clicks on the header link based on the provided link text.
     *
     * @param  link  the text of the header link to click on
     */
    public void clickHeaderLink(String link){
        switch (link.toLowerCase()){
            case "home":
                driver.findElement(headerHome).click();
                break;
            case "products":
                driver.findElement(headerProducts).click();
                break;
            case "cart":
                driver.findElement(headerCart).click();
                break;
            case "signup / login":
                driver.findElement(headerSignupLogin).click();
                break;
            case "test cases":
                driver.findElement(headerTestCases).click();
                break;
            case "api testing":
                driver.findElement(headerApiTesting).click();
                break;
            case "video tutorials":
                driver.findElement(headerVideoTutorials).click();
                break;
            case "contact us":
                driver.findElement(headerContactUs).click();
                break;
        }
    }
    /**
     * Verifies the title and performs corresponding actions based on the given title.
     *
     * @param  title    the title to be verified and acted upon
     */
    public void verifyTitle(String title){
        switch (title.toLowerCase()){
            case "home":
                driver.findElement(titleHome).click();
                break;
            case "products":
                driver.findElement(titleProducts).click();
                break;
            case "cart":
                driver.findElement(titleCart).click();
                break;
            case "signup / login":
                driver.findElement(titleSignupLogin).click();
                break;
            case "test cases":
                driver.findElement(titleTestCases).click();
                break;
            case "api testing":
                driver.findElement(titleApiTesting).click();
                break;
            case "video tutorials":
                driver.findElement(titleVideoTutorials).click();
                break;
            case "contact us":
                driver.findElement(titleContactUs).click();
                break;
        }
    }
    /**
     * Clicks the close button if it is displayed.
     */
    public void clickCloseBtn(){
        if (driver.findElement(btnClose).isDisplayed()){
            driver.findElement(btnClose).click();
        }
    }
}
