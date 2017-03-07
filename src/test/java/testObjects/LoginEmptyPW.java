package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginEmptyPW extends TestBase {




    @Test
    public void testEmptyPassword() throws Exception {
        Thread.sleep(3000);
        LOG.info ("Begin Empty Password");
        LoginPage.startEmptyPassword ();
        Thread.sleep (30000);
        assertEquals (driver.findElement (By.name ("Ошибка")).toString (),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        LOG.info ("stop  of empty password");
        LoginPage.stopEmptyLoginPassword();
        LOG.info ("stop  of autentification ");
        LoginPage.stopAutentification ();
    }



}











