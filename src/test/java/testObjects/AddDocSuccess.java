package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddDocSuccess extends TestBase {

    //User as ADMIN -- to add Doc / success
    @Test(enabled = false)
    public void testDocSuccess() throws Exception {
        BasePage.waitAction();
        LOG.info("Start Log In as ADMIN");
        LoginAdminPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("Start to add a new Doc => success");
        MainPage.addDocSuccess();
        //исправить на  pageObjects.ResultPage
        // LOG.info("Get name of active window : Список врачей ");
        assertEquals(driver.findElement(By.name("Список врачей")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Список врачей]");

        // MainPage.deleteNewPerson();
        //  LOG.info("Start close the Main window");
        // MainPage.closeMainWindow();


    }


}
