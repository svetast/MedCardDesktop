package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AuthorizationAdmin extends TestBase {

    //Login Success as ADMIN
    @Test
    public void testAuthorizationAdmin() throws Exception {
        BasePage.waitPause();
        LOG.info("Авторизация под админом");
        LoginAdminPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("наименование открытого окна:");
        // наименование открытого окна
        ResultPage.getAdminTitle(driver);
        assertEquals (driver.findElement (By.name ("Пользователь :: Администратор. (Администратор) 10.12.253.23 Тестовая БД->LocalHost")).toString (),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Пользователь :: Администратор. (Администратор) 10.12.253.23 Тестовая БД->LocalHost]");
        LOG.info("закрытие главного окна программы ");
        MainPage.closeMainWindow();
    }





}









