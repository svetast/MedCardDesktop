package testObjects;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddDoc extends TestBase {

    //Add Admin Success
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
        Assert.assertEquals(driver.findElement(By.name("Список Администраторов")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Список Администраторов]");
        LOG.info("Start delete a New user");
        MainPage.deleteNewPerson();
        LOG.info("Start close the Main window");
        MainPage.closeMainWindow();
        //Thread.sleep(3000);

    }



}
