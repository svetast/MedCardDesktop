package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AuthorizationAdmin extends TestBase {

    //Login Success as ADMIN
    @Test
    public void testAuthorizationAdmin() throws Exception {

        LOG.info("Begin LogIn as ADMIN");
        LoginPage.authorizationAdmin();
        BasePage.waitAction();
        String f = driver.findElement (By.name ("Пользователь :: Администратор. (Администратор) 10.12.253.23 Тестовая БД->LocalHost")).toString ();
        LOG.info("Get name of active window:");
        System.out.println (f);// наименование открытого окна
        assertEquals (driver.findElement (By.name ("Пользователь :: Администратор. (Администратор) 10.12.253.23 Тестовая БД->LocalHost")).toString (),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Пользователь :: Администратор. (Администратор) 10.12.253.23 Тестовая БД->LocalHost]");
        LOG.info("Close  of the main window");
        MainPage.closeMainWindow();
    }





}










