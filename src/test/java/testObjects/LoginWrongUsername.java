package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginWrongUsername extends TestBase {


    // logIn with wrong USERNAME
    @Test
    public void testWrongUsername() throws Exception {
        LOG.info("Begin logIn with wrong USERNAME");
        LoginPage.startWrongUsername();
        BasePage.waitAction();
        LOG.info("Get name of active window:");// наименование открытого окна
        ErrorMessagePage.getErrorMessage(driver);
        assertEquals(driver.findElement(By.className("TFMyMess")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> class name: TFMyMess]");
        LOG.info("Stop logIn with wrong USERNAME");
        LOG.info("Close active window");
        LOG.info("Stop authorization ");
        LoginPage.stopEmptyLoginPassword();
        LoginPage.stopAuthorization();


    }
}

