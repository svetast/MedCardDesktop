package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorMessagePage extends BasePage {
    public ErrorMessagePage(WebDriver driver) {
        super(driver);
    }

    public void getErrorMessage(WebDriver driver) {

        System.out.println(driver.findElement(By.name("Ошибка")).toString());// наименование открытого окна

    }
    public void getMessage(WebDriver driver) {

        System.out.println(driver.findElement(By.name("Сообщение")).toString());// наименование открытого окна

    }
}
