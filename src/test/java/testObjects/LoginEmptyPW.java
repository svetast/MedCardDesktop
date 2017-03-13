package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginEmptyPW extends TestBase {


// logIn with empty PASSWORD

    @Test
    public void testEmptyPassword() throws Exception {
        Thread.sleep(5000);
        LOG.info("Begin logIn with empty PASSWORD");
        LoginPage.startEmptyPassword ();
        Thread.sleep(50000);
        assertEquals (driver.findElement (By.name ("Ошибка")).toString (),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        LOG.info("Stop  logIn with empty PASSWORD");
        LoginPage.stopEmptyLoginPassword();
        LOG.info("Stop  authorization ");
        LoginPage.stopAuthorization();
    }



}











