package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginEmptyFields extends TestBase {

   // Login empty Name & PW
    @Test
    public void testLoginEmpty() throws Exception {
        LOG.info ("start Login Empty Fields");
        LoginPage.startLoginEmptyAll();
           Thread.sleep (30000);
        assertEquals (driver.findElement (By.name ("Ошибка")).toString (),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        LOG.info ("stop  of Login Empty Fields");
        LoginPage.stopEmptyLoginPassword();
        LOG.info ("stop  of autentification ");
        LoginPage.stopAutentification ();


    }





}











