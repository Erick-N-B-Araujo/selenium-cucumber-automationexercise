package configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Utils utils;

    /**
     * Setup method to configure the WebDriver for Chrome browser,
     * maximize the window, and set a 10-second wait.
     */
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10L);
        utils = new Utils(driver);
        driver.manage().window().maximize();
    }

    /**
     * Tears down the resources used by the function.
     */
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
