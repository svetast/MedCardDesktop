package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddAdminEmpty extends TestBase {

    //User as ADMIN -- to add admin with empty fields
    
    @Test
    public void testAddAdminEmpty() throws Exception {
        Thread.sleep(5000);
        LOG.info("Start LogIn as ADMIN");
        LoginPage.authorizationAdmin();
        Thread.sleep(5000);
        LOG.info("Add a new ADMIN with empty fields");
        MainPage.addEmptyAdmin();
        Thread.sleep(5000);
        LOG.info("Get name of active window: Ошибка ");
        assertEquals(driver.findElement(By.name("Ошибка")).toString(),
        "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]"); // конец теста, далее - возврат  в исходное положение

        MainPage.closeActiveWindow();
        MainPage.abortActiveWindow();
        MainPage.abortActiveWindow();
        LOG.info("Close the Main window");
        MainPage.closeMainWindow();


    }
}
