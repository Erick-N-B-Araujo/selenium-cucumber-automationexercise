package hooks;

import configurations.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotHook {
    private WebDriver driver;
    public ScreenshotHook() {
        this.driver = DependencyContainer.getContainer().getComponent(WebDriver.class);
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not registered in PicoContainer.");
        }
    }
    @After
    public void takeScreenshotOnFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "Screenshot on Failure");
                System.out.println("Screenshot takenasssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
            } catch (Exception e) {
                System.err.println("Error taking screenshot: " + e.getMessage());
            }
        }
    }
}
