package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AuthorizationAdmin extends TestBase {

    //Login Success as ADMIN
    @Test
    public void testAuthorizationAdmin() throws Exception {
        Thread.sleep(3000);
        LOG.info ("Begin Login Success");
        LoginPage.authorizationAdmin();
        Thread.sleep (30000);
        String f = driver.findElement (By.name ("Пользователь :: Администратор. (Администратор) 10.12.253.23 Тестовая БД->LocalHost")).toString ();
        LOG.info ("Get the title of the open window:");
        System.out.println (f);// наименование открытого окна
        assertEquals (driver.findElement (By.name ("Пользователь :: Администратор. (Администратор) 10.12.253.23 Тестовая БД->LocalHost")).toString (),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Пользователь :: Администратор. (Администратор) 10.12.253.23 Тестовая БД->LocalHost]");
        LOG.info ("start the close  of the main menu");
        MainPage.closeMainWindow();
    }





}










