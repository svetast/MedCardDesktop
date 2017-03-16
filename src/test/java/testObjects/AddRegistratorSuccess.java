package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddRegistratorSuccess extends TestBase {

    ////User as ADMIN -- to add a new Registrator success
    @Test
    public void testAddRegistratorSuccess() throws Exception {

        BasePage.waitPause();
        LOG.info("Start LOGIN as ADMIN");
        LoginAdminPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("To add a new registrator => Иван Регистратор");
        MainPage.addRegistratorSuccess();
        LOG.info("Get name of active window:");
        ResultPage.getAddRegistrTitle(driver);
        assertEquals(driver.findElement(By.name("Список регистраторов")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Список регистраторов]");
        LOG.info("Delete a new registrator");
        MainPage.deleteNewPerson();
        LOG.info("Close the main window");
        MainPage.closeMainWindow();

    }


}










