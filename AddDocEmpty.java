package testObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddDocEmpty extends TestBase {

    //User as ADMIN -- to add Doc with empty fields

    @Test
    public void testAddDocEmpty() throws Exception {
        BasePage.waitPause();
        LOG.info("Авторизация под Админом");
        LoginAdminPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("Добавить нового врача");
        MainPage.addDocEmpty();
        LOG.info("Проверка, что кнопка 'Применить' не активна");
        WebElement readyButton = driver.findElement(By.name("Применить"));
        if (driver.findElement(By.name("Применить")).isEnabled()) {
            readyButton.click();
            driver.findElement(By.name("ОК")).click();
        }
        //проверка - если работает неверно и кнопка Применить была активна и на нее нажали, и на ОК наажали - то наименование страницы изменится.
        //Если внутри цикла действия не выполнились, наименование окна не изменилось - и тест будет  pass

        ResultPage.getEmptyDocTitle(driver);
        assertEquals(driver.findElement(By.name("Регистрационная карточка сотрудника")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Регистрационная карточка сотрудника]");
        MainPage.closeActiveWindow();
        MainPage.abortActiveWindow();
        MainPage.abortActiveWindow();
        LOG.info("Закрыть главное окно программы");
        MainPage.closeMainWindow();
    }


   /* @Test   старый вариант

    public void testAddDocEmpty() throws Exception {
        BasePage.waitPause();
        LOG.info("Start ADMIN autorization");
        LoginAdminPage.authorizationAdmin();
        BasePage.waitAction();
        LOG.info("Try to add Doc with empty fields");
        MainPage.addDocEmpty();
        LOG.info("Get an error message:");// наименование открытого окна
        ErrorMessagePage.getErrorMessage(driver);
        assertEquals(driver.findElement(By.name("Ошибка")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]");

        MainPage.closeActiveWindow();
        MainPage.abortActiveWindow();
        MainPage.abortActiveWindow();
        LOG.info("Close the Main window");
        MainPage.closeMainWindow();


    }*/
}