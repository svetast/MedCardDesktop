package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebDriver getDriver() {

        return driver;
    }


    //The method by which we close the Authorization Form
    public void stopAuthorization() throws InterruptedException {
        WebElement abortbutton = driver.findElement(By.className("TFAutorizacia"));
        waitAction();
        abortbutton.findElement(By.name("Закрыть")).click();

    }



}

