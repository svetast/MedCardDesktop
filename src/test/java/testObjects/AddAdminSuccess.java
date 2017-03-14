package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddAdminSuccess extends TestBase {






    //User as ADMIN -- to add Admin success
    @Test
    public void testAddAdminSuccess() throws Exception {
        BasePage.waitAction();
        LOG.info("Start LogIn as ADMIN");
        LoginAdminPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("Add a new ADMIN => Иван Иванов");
        MainPage.addAdminSuccess();
        LOG.info("Get name of active window:");
        ResultPage.getAddAdminTitle(driver);
        assertEquals(driver.findElement(By.name("Список Администраторов")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Список Администраторов]");
        //Return the test to the initial state
        LOG.info("Delete a new user (ADMIN)");
        MainPage.deleteNewPerson();
        LOG.info("Start close the Main window");
        MainPage.closeMainWindow();


    }


}
