package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginEmptyPW extends TestBase {


// logIn with empty PASSWORD

    @Test
    public void testEmptyPassword() throws Exception {

        LOG.info("Begin logIn with empty PASSWORD");
        LoginPage.startEmptyPassword ();
        BasePage.waitAction();
        LOG.info("Get name of active window:");// наименование открытого окна
        ErrorMessagePage.getErrorMessage(driver);
        assertEquals (driver.findElement (By.name ("Ошибка")).toString (),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        LOG.info("Stop  logIn with empty PASSWORD");
        LoginPage.stopEmptyLoginPassword();
        LOG.info("Stop  authorization ");
        LoginPage.stopAuthorization();
    }



}











