package testObjects;

import org.testng.annotations.Test;

public class AddEMC_Success extends TestBase {

    //User as ADMIN -- to add a new EMC success doesn't work yet

    @Test(enabled = false)
    public void testAddEMC() throws Exception {
        LOG.info("Start LogIn as ADMIN");
        LoginAdminPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("Start to add a new EMC");
        MainPage.startAddEMC();
        // MainPage.closeMainWindow();
    }





}