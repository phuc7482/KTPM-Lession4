package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage {
    private WebDriver driver;
    private By formLoginLink = By.linkText("Form authentication");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage clickForm(){
        driver.findElement(formLoginLink).click();
        return new LoginPage(driver);
    }
}
