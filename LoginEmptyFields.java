package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginEmptyFields extends TestBase {

    @Test
    public void testLoginEmpty() throws Exception {
        BasePage.waitPause();
        LOG.info("Проверка авторизации если поля Имя и Пароль пустые");
        LoginEmptyDataPage.startLoginEmptyAll();
        BasePage.waitAction();
        LOG.info("Get an error message :");// наименование открытого окна
        ErrorMessagePage.getErrorMessage(driver);
        assertEquals (driver.findElement (By.name ("Ошибка")).toString (),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        LOG.info("Stop  LogIn with empty fields");
        LoginEmptyDataPage.stopEmptyLoginPassword();
        LOG.info("Stop  authorization ");
        LoginPage.stopAuthorization();


    }





}











