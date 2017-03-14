package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginEmptyFields extends TestBase {

    // LogIn with empty fields- Name  and PW
    @Test
    public void testLoginEmpty() throws Exception {
        LOG.info("Start LogIn with empty fields- Name  and PW");
        LoginPage.startLoginEmptyAll();
        BasePage.waitAction();
        LOG.info("Get name of active window:");// наименование открытого окна
        ErrorMessagePage.getErrorMessage(driver);
        assertEquals (driver.findElement (By.name ("Ошибка")).toString (),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        LOG.info("Stop  LogIn with empty fields");
        LoginPage.stopEmptyLoginPassword();
        LOG.info("Stop  authorization ");
        LoginPage.stopAuthorization();


    }





}











