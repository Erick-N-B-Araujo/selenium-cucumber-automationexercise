package configurations;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Utils {
    WebDriver driver;
    public Utils(WebDriver driver) {
        this.driver = driver;
    }
    public void switchBrowserTab(){
        Set<String> allWindows = driver.getWindowHandles();
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
}
