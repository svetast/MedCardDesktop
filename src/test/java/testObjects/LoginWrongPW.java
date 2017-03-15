package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginWrongPW extends TestBase {


    // logIn with wrong PASSWORD
@Test
public void testWrongPassword() throws Exception {
    BasePage.waitPause();
    LOG.info("Start logIn as ADMIN by wrong PASSWORD");
    LoginWrongDataPage.startWrongPassword();
    LOG.info("Get an error message :");// наименование открытого окна
    ErrorMessagePage.getMessage(driver);
        assertEquals(driver.findElement(By.className("TFMyMess")).toString(),
        "[[WiniumDriver:  on ANY (AwesomeSession)] -> class name: TFMyMess]");
    LOG.info("Stop logIn with wrong PASSWORD ");
    LOG.info("Stop  authorization ");
    LoginPage.stopAuthorization();


}


        }











