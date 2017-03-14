package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginWrongPW extends TestBase {


    // logIn with wrong PASSWORD
@Test
public void testWrongPassword() throws Exception {
    LOG.info("Start logIn as ADMIN by wrong PASSWORD");
        LoginPage.startWrongPassword();
    LOG.info("Get name of active window:");// наименование открытого окна
    ErrorMessagePage.getMessage(driver);
        assertEquals(driver.findElement(By.className("TFMyMess")).toString(),
        "[[WiniumDriver:  on ANY (AwesomeSession)] -> class name: TFMyMess]");
    LOG.info("Stop logIn with wrong PASSWORD ");
    LOG.info("Stop  authorization ");
    LoginPage.stopAuthorization();


}


        }











