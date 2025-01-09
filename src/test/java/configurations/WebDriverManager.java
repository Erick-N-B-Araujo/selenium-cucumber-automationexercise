package configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class WebDriverManager {
    private static WebDriver driver;
    public static WebDriver setupDriver() {
        if (driver == null) {
            //System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            try{
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                URL gridUrl = new URL("http://localhost:4444/wd/hub");
                driver = new RemoteWebDriver(gridUrl, options);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return driver;
    }
    public WebDriver getDriver() {
        return driver;
    }
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
