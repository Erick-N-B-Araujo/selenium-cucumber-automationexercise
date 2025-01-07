package hooks;

import configurations.WebDriverManager;
import io.cucumber.java.After;

public class DriverHook {
    private final WebDriverManager webDriverManager;
    public DriverHook(WebDriverManager webDriverManager) {
        this.webDriverManager = webDriverManager;
    }
    @After
    public void tearDown() {
        webDriverManager.quitDriver();
    }
}
