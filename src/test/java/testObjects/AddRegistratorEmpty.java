package testObjects;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRegistratorEmpty extends TestBase {




    //Add  Empty Registrator-------  добавить Регистратора с пустым ФИО
    @Test
    public void testAddEmptyRegistrator() throws Exception {
        Thread.sleep(3000);
        LOG.info("Start Log In");
        LoginPage.authorizationAdmin();
        Thread.sleep(3000);
        LOG.info("Add Empty Registrator");
        MainPage.addEmptyRegistrator();
        Thread.sleep(1000);
        LOG.info("Assert name of active window: Ошибка ");
        Assert.assertEquals(driver.findElement(By.name("Ошибка")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]"); // конец теста, далее - возврат  в исходное положение

        MainPage.closeActiveWindow();
        MainPage.abortActiveWindow();
        MainPage.abortActiveWindow();
        LOG.info("Close the Main window");
        MainPage.closeMainWindow();


    }



}
