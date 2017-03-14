package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ResultPage extends BasePage {
    public ResultPage(WebDriver driver) {
        super(driver);
    }


    public String resultAddAdminEmpty(WebDriver driver) throws Exception {
        return driver.findElement(By.name("Ошибка")).toString();


    }


}
