package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddDocEmpty extends TestBase {

    //User as ADMIN -- to add Doc with empty fields

    @Test

    public void testAddDocEmpty() throws Exception {
        BasePage.waitAction();
        LOG.info("Start LOGIN as ADMIN");
        LoginAdminPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("Try to add Doc with empty fields");
        MainPage.addDocEmpty();
        LOG.info("Get an error message:");// наименование открытого окна
        ErrorMessagePage.getErrorMessage(driver);
        assertEquals(driver.findElement(By.name("Ошибка")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");

        MainPage.closeActiveWindow();
        MainPage.abortActiveWindow();
        MainPage.abortActiveWindow();
        LOG.info("Close the Main window");
        MainPage.closeMainWindow();


    }
}