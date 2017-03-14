package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginEmptyFields extends TestBase {

    // LogIn with empty fields- Name  and PW
    @Test
    public void testLoginEmpty() throws Exception {
        BasePage.waitAction();
        LOG.info("Start LogIn with empty fields- Name and PW");
        LoginEmptyDataPage.startLoginEmptyAll();
        BasePage.waitAction();
        LOG.info("Get an error message :");// наименование открытого окна
        ErrorMessagePage.getErrorMessage(driver);
        assertEquals (driver.findElement (By.name ("Ошибка")).toString (),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        LOG.info("Stop  LogIn with empty fields");
        LoginEmptyDataPage.stopEmptyLoginPassword();
        LOG.info("Stop  authorization ");
        LoginPage.stopAuthorization();


    }





}











