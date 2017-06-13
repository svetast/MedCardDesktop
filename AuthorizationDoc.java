package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AuthorizationDoc extends TestBase {
    //Login Success as Doctor
    @Test
    public void testAuthorizationDoc() throws Exception {
        BasePage.waitPause();
        LOG.info("Авторизация под врачом");
        LoginDocPage.authorizationDoc();
        BasePage.waitAction();
        LOG.info("наименование открытого окна :");
        ResultPage.getDocTitle(driver);
        assertEquals (driver.findElement(By.name("Пользователь :: Сидоров Василий Владимирович. (Врач) 10.12.253.23 Тестовая БД->LocalHost")).toString(),
               "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Пользователь :: Сидоров Василий Владимирович. (Врач) 10.12.253.23 Тестовая БД->LocalHost]");
        LOG.info("закрыть главное окно программы");
        MainPage.closeMainWindow();



    }
}
