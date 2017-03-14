package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AuthorizationRegistrator extends TestBase {


    //Login Success as Registrator
    @Test
    public void testAuthorizationRegistrator() throws Exception {
        BasePage.waitAction();
        LOG.info("Begin LogIn as Registrator - success");
        LoginRegistratorPage.authorizationRegistrator();
        BasePage.waitAction();
        LOG.info("Get name of active window: ");
        // наименование открытого окна
        ResultPage.getRegistratorTitle(driver);
        assertEquals(driver.findElement(By.name("Пользователь :: Петрова Алла Ивановна. (Регистратор) 10.12.253.23 Тестовая БД->LocalHost")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Пользователь :: Петрова Алла Ивановна. (Регистратор) 10.12.253.23 Тестовая БД->LocalHost]");
        LOG.info("start the close  of the main menu");
        MainPage.closeMainWindow();

}



    }


