package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class LoginWrongPW extends TestBase {


    // logIn with wrong PASSWORD
@Test
public void testWrongPassword() throws Exception {
    Thread.sleep(5000);
    LOG.info("Begin logIn with wrong PASSWORD");
        LoginPage.startWrongPassword();
        assertEquals(driver.findElement(By.className("TFMyMess")).toString(),
        "[[WiniumDriver:  on ANY (AwesomeSession)] -> class name: TFMyMess]");
    LOG.info("Stop logIn with wrong PASSWORD ");
    LOG.info("Stop  authorization ");
    LoginPage.stopAuthorization();


}


        }











