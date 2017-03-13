package testObjects;

import org.testng.annotations.Test;

public class AddEMC_Success extends TestBase {

    //User as ADMIN -- to add a new EMC success doesn't work yet

    @Test(enabled = false)
    public void testAddEMC() throws Exception {
        LOG.info ("Begin Log In");
        LoginPage.authorizationAdmin();
        Thread.sleep(5000);
        LOG.info ("Begin AddMedCard");
        MainPage.addEMC();
        MainPage.closeMainWindow();
    }





}