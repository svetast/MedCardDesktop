package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginEmptyPW extends TestBase {



    @Test
    public void testEmptyPassword() throws Exception {
        BasePage.waitPause();
        LOG.info("Проверка авторизации с пустым полем Пароль");
        LoginEmptyDataPage.startLoginEmptyAll();
        BasePage.waitAction();
        LOG.info("Ожидаю сообщение об ошибке");// наименование открытого окна
        ErrorMessagePage.getErrorMessage(driver);
        assertEquals (driver.findElement (By.name ("Ошибка")).toString (),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        LoginEmptyDataPage.stopEmptyLoginPassword();
        LoginPage.stopAuthorization();
    }



}











