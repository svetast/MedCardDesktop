package pageObjects;

import org.openqa.selenium.WebDriver;

public class BasePage {


    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // The method which uses for all pages
    public String getTitle() {
        return (getDriver().getTitle());
    }


    public WebDriver getDriver() {

        return driver;
    }

    public void waitAction() throws InterruptedException {

        Thread.sleep(30000);

    }

    public void waitPause() throws InterruptedException {

        Thread.sleep(15000);


    }

}




