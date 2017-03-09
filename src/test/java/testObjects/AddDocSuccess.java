package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddDocSuccess extends TestBase {

    //User as ADMIN -- to add Doc / success
    @Test
    public void testDocSuccess() throws Exception {
        Thread.sleep(3000);
        LOG.info("Start Log In as ADMIN");
        LoginPage.authorizationAdmin();
        Thread.sleep(3000);
        LOG.info("Start to add Doc success");
        MainPage.addDocSuccess();
        Thread.sleep(100);
        LOG.info("Start assert name: Список врачей ");
        assertEquals(driver.findElement(By.name("Список врачей")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Список врачей]");
        LOG.info("Start delete a new Doc");
        // MainPage.deleteNewPerson();
        //  LOG.info("Start close the Main window");
        // MainPage.closeMainWindow();


    }


}
