package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AuthorizationDoc extends TestBase {

    //Login Success as Doctor
    @Test
    public void testAuthorizationDoc() throws Exception {
        LOG.info("Start LogIn as DOC1");
        LoginPage.authorizationDoc();
        BasePage.waitAction();
        String f = driver.findElement(By.name("Пользователь :: Сидоров Василий Владимирович. (Врач) 10.12.253.23 Тестовая БД->LocalHost")).toString();
        LOG.info("Get name of active window : Пользователь :: Сидоров Василий Владимирович.");
        System.out.println(f);// наименование открытого окна
        assertEquals (driver.findElement(By.name("Пользователь :: Сидоров Василий Владимирович. (Врач) 10.12.253.23 Тестовая БД->LocalHost")).toString(),
               "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Пользователь :: Сидоров Василий Владимирович. (Врач) 10.12.253.23 Тестовая БД->LocalHost]");
        LOG.info("start the close  of the main menu");
        MainPage.closeMainWindow();



    }
}
