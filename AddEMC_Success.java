package testObjects;

import org.testng.annotations.Test;

public class AddEMC_Success extends TestBase {
    //User as ADMIN -- to add a new EMC success doesn't work yet

    @Test(enabled = false)
    public void testAddEMC() throws Exception {
        LOG.info("Автризация под Админом");
        LoginAdminPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("Добавить нового пациента");
        MainPage.startAddEMC();
        // MainPage.closeMainWindow();
    }





}