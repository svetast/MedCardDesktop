package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddRegistratorSuccess extends TestBase {

    ////User as ADMIN -- to add a new Registrator success
    @Test
    public void testAddRegistratorSuccess() throws Exception {
        Thread.sleep(3000);
        LOG.info("Start Log In");
        LoginPage.authorizationAdmin();
        Thread.sleep(3000);
        LOG.info("Add a new Registrator success");
        MainPage.addRegistratorSuccess();
        Thread.sleep(100);
        LOG.info("Start assert name: Список регистраторов  ");
        assertEquals(driver.findElement(By.name("Список регистраторов")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Список регистраторов]");
        LOG.info("Start delete a New Registrator");
        MainPage.deleteNewPerson();
        LOG.info("Start close the Main window");
        MainPage.closeMainWindow();

    }






}
