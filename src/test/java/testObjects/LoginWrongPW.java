package testObjects;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginWrongPW extends TestBase {


// wrong password
@Test
public void testWrongPassword() throws Exception {
        Thread.sleep(3000);
        LOG.info ("Begin Wrong Password");
        LoginPage.startWrongPassword();
        Assert.assertEquals(driver.findElement(By.className("TFMyMess")).toString(),
        "[[WiniumDriver:  on ANY (AwesomeSession)] -> class name: TFMyMess]");
        LOG.info ("stop wrong password");
        LOG.info ("stop  of autentification ");
        LoginPage.stopAutentification();


}


        }











