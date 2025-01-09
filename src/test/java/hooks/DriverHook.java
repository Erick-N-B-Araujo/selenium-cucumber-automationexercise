package hooks;

import configurations.WebDriverManager;
import io.cucumber.java.After;
import org.junit.AfterClass;

public class DriverHook {
    private final WebDriverManager webDriverManager;
    public DriverHook(WebDriverManager webDriverManager) {
        this.webDriverManager = webDriverManager;
    }
    @AfterClass
    public void tearDown() {
        webDriverManager.quitDriver();
    }
}
