package testObjects;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationDoc extends TestBase {

    //Login Success as Doctor
    @Test
    public void testAuthorizationDoc() throws Exception {
        Thread.sleep(3000);
        LOG.info("begin Login Success sa Registrator");
        LoginPage.authorizationDoc();
        Thread.sleep(30000);
        String f = driver.findElement(By.name("Пользователь :: Сидоров Василий Владимирович. (Врач) 10.12.253.23 Тестовая БД->LocalHost")).toString();
        LOG.info("Get the title of the open window:");
        System.out.println(f);// наименование открытого окна
        Assert.assertEquals(driver.findElement(By.name("Пользователь :: Сидоров Василий Владимирович. (Врач) 10.12.253.23 Тестовая БД->LocalHost")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Пользователь :: Сидоров Василий Владимирович. (Врач) 10.12.253.23 Тестовая БД->LocalHost]");
        LOG.info("start the close  of the main menu");
        MainPage.closeMainWindow();



    }
}
