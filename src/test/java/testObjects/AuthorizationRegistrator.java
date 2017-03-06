package testObjects;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorizationRegistrator extends TestBase {


    //Login Success as Registrator
    @Test
    public void testAuthorizationRegistrator() throws Exception {
        Thread.sleep(3000);
        LOG.info("begin Login Success sa Registrator");
        LoginPage.authorizationRegistrator();
        Thread.sleep(30000);
        String f = driver.findElement(By.name("Пользователь :: Петрова Алла Ивановна. (Регистратор) 10.12.253.23 Тестовая БД->LocalHost")).toString();
        LOG.info("Get the title of the open window:");
        System.out.println(f);// наименование открытого окна
        Assert.assertEquals(driver.findElement(By.name("Пользователь :: Петрова Алла Ивановна. (Регистратор) 10.12.253.23 Тестовая БД->LocalHost")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Пользователь :: Петрова Алла Ивановна. (Регистратор) 10.12.253.23 Тестовая БД->LocalHost]");
        LOG.info("start the close  of the main menu");
        Thread.sleep(3000);
        MainPage.closeMainWindow();// закрыть инфо окно, а потом главное
        MainPage.closeMainWindow();

}



    }


