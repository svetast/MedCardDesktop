package testObjects;

import org.testng.annotations.Test;

public class AddEmptyEMC extends TestBase {

    //User as ADMIN -- to add a new EMC with empty fields

    @Test(enabled = false)
    public void addEmptyEMC() throws Exception {
        LOG.info("Start logIn as ADMIN");
        LoginPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("Start to add empty EMC on the Main Page");
        MainPage.startAddEMC();
        BasePage.waitAction();
        //  MainPage.addEmptyFieldsEMC();
        //assertEquals(driver.findElement(By.name("Ошибка")).toString(),
        //  "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");
        //   MainPage.abortActiveWindow();
        //  MainPage.closeMainWindow();



    }
}
