package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginWrongPW extends TestBase {


    @Test
    public void testWrongPassword() throws Exception {
        BasePage.waitPause();
        LOG.info("Проверка авторизации если пароль не верный");
        LoginWrongDataPage.startWrongPassword();
        LOG.info("Ожидаю сообщение об ошибке :");// наименование открытого окна
        ErrorMessagePage.getMessage(driver);
        assertEquals(driver.findElement(By.className("TFMyMess")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> class name: TFMyMess]");
        LOG.info("Закрыть активное окно");
        BasePage.waitPause();
        LoginPage.stopAuthorization();


    }

}











