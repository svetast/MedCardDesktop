package testObjects;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddRegistratorSuccess extends TestBase {

    ////User as ADMIN -- to add a new Registrator success
    @Test
    public void testAddRegistratorSuccess() throws Exception {
        BasePage.waitPause();
        LOG.info("Авторизация под админом");
        LoginAdminPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("Добавить нового регистратора => Иван Регистратор");
        MainPage.addRegistratorSuccess();
        LOG.info("наименование открытого окна:");
        ResultPage.getAddRegistrTitle(driver);
        assertEquals(driver.findElement(By.name("Список регистраторов")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Список регистраторов]");
        LOG.info("Удалить вновь созданного регистратора");
        MainPage.deleteNewPerson();
        LOG.info("закрытие главного окна программы");
        MainPage.closeMainWindow();

    }


}










