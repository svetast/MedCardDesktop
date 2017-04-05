package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginEmptyPW extends TestBase {


// logIn with empty PASSWORD

    @Test
    public void testEmptyPassword() throws Exception {
        BasePage.waitPause();
        LOG.info("Start authorization by empty PASSWORD");
        LoginEmptyDataPage.startLoginEmptyAll();
        BasePage.waitAction();
        LOG.info("Get an error message :");// наименование открытого окна
        ErrorMessagePage.getErrorMessage(driver);
        assertEquals (driver.findElement (By.name ("Ошибка")).toString (),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        LOG.info("Stop  logIn with empty PASSWORD");
        LoginEmptyDataPage.stopEmptyLoginPassword();
        LOG.info("Stop  authorization ");
        LoginPage.stopAuthorization();
    }



}











