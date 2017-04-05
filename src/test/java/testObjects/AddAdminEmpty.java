package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddAdminEmpty extends TestBase {   //User as ADMIN -- to add admin with empty fields

    @Test
    public void testAddAdminEmpty() throws Exception {
        BasePage.waitPause();
        LOG.info("Start ADMIN authorization");
        LoginAdminPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("Add a new ADMIN with empty fields");
        MainPage.addEmptyAdmin();
        LOG.info("Get an error message :");// наименование открытого окна
        ErrorMessagePage.getErrorMessage(driver);
        //checking result of the test by pageObject.ResultPage:
        assertEquals(ResultPage.resultAddAdminEmpty(driver), "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        //checking result of the test without pageObject.ResultPage:
        assertEquals(driver.findElement(By.name("Ошибка")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        MainPage.closeActiveWindow();
        MainPage.abortActiveWindow();
        MainPage.abortActiveWindow();
        LOG.info("Close the Main window");
        MainPage.closeMainWindow();


    }


}
