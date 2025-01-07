package hooks;

import configurations.WebDriverManager;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.picocontainer.DefaultPicoContainer;
import org.picocontainer.MutablePicoContainer;

public class DependencyContainer {
    private static MutablePicoContainer container;
    private static WebDriverManager webDriverManager;
    @Before(order = 0)
    public void configureDependencies() {
        if (container == null) {
            container = new DefaultPicoContainer();
            WebDriver driver = webDriverManager.setupDriver();
            container.addComponent(WebDriver.class, driver);
        }
    }
    public static MutablePicoContainer getContainer() {
        if (container == null) {
            throw new IllegalStateException("DependencyContainer has not been initialized.");
        }
        return container;
    }
}
