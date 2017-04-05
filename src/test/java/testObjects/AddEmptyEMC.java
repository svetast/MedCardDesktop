package testObjects;

import org.testng.annotations.Test;

public class AddEmptyEMC extends TestBase {

    //User as ADMIN -- to add a new EMC with empty fields

    @Test(enabled = false)
    public void addEmptyEMC() throws Exception {
        BasePage.waitPause();
        LOG.info("Start ADMIN autorization");
        LoginAdminPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("To add empty EMC on the Main Page");
        MainPage.startAddEMC();
        BasePage.waitAction();
        //  MainPage.addEmptyFieldsEMC();
        //assertEquals(driver.findElement(By.name("Ошибка")).toString(),
        //  "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        //   MainPage.abortActiveWindow();
        //  MainPage.closeMainWindow();



    }
}
