package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddDocEmpty extends TestBase {

    //User as ADMIN -- to add Doc with empty fields

    @Test

    public void testAddDocEmpty() throws Exception {
        Thread.sleep(5000);
        LOG.info("Start LOGIN as ADMIN");
        LoginPage.authorizationAdmin();
        Thread.sleep(5000);
        LOG.info("Try to add Doc with empty fields");
        MainPage.addDocEmpty();
        Thread.sleep(5000);
        LOG.info("Check name of active window: Ошибка ");
        assertEquals(driver.findElement(By.name("Ошибка")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]"); // конец теста, далее - возврат  в исходное положение

        MainPage.closeActiveWindow();
        MainPage.abortActiveWindow();
        MainPage.abortActiveWindow();
        LOG.info("Close the Main window");
        MainPage.closeMainWindow();


    }
}