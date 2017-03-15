package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginWrongUsername extends TestBase {


    // logIn with wrong USERNAME
    @Test
    public void testWrongUsername() throws Exception {
        BasePage.waitPause();
        LOG.info("Begin logIn with wrong USERNAME");
        LoginWrongDataPage.startWrongUsername();
        BasePage.waitPause();
        LOG.info("Get an error message:");// наименование открытого окна
        ErrorMessagePage.getErrorMessage(driver);
        assertEquals(driver.findElement(By.className("TFMyMess")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> class name: TFMyMess]");
        LOG.info("Stop logIn with wrong USERNAME");
        LOG.info("Close active window");
        LOG.info("Stop authorization ");
        LoginEmptyDataPage.stopEmptyLoginPassword();
        LoginPage.stopAuthorization();


    }
}
