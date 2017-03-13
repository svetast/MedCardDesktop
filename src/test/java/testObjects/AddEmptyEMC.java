package testObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddEmptyEMC extends TestBase {

    //User as ADMIN -- to add a new EMC with empty fields

    @Test(enabled = false)
    public void startCreateSuccess() throws Exception {
        LOG.info("Begin start logIn as ADMIN");
        LoginPage.authorizationAdmin();
        Thread.sleep(5000);
        assertEquals(driver.findElement(By.name("Ошибка")).toString(),
                "[[WiniumDriver:  on ANY (AwesomeSession)] -> name: Ошибка]"); // конец теста, далее - возврат  в исходное положение
        LOG.info("Begin create EMC");
        CreateEMCardPage.createEMC();


    }
}
