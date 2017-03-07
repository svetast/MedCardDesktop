package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddAdminSuccess extends TestBase {






    //User as ADMIN -- to add Admin success
    @Test
    public void testAddAdminSuccess() throws Exception {
        Thread.sleep(3000);
        LOG.info("Start Log In");
        LoginPage.authorizationAdmin();
        Thread.sleep(3000);
        LOG.info("Add Admin success");
        MainPage.addAdminSuccess();
        Thread.sleep(100);
        LOG.info("Start assert name: Список Администраторов ");
        assertEquals(driver.findElement(By.name("Список Администраторов")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Список Администраторов]");
        LOG.info("Start delete a New user");
        MainPage.deleteNewPerson();
        LOG.info("Start close the Main window");
        MainPage.closeMainWindow();
        //Thread.sleep(3000);

    }


}
