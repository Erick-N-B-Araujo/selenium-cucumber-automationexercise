package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public By siteLogo = By.xpath("//img[@src='/static/images/home/logo.png']");
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
}
