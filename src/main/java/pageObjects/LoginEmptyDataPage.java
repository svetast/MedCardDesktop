package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class LoginEmptyDataPage extends BasePage {
    public LoginEmptyDataPage(WebDriver driver) {
        super(driver);
    }


    public void startLoginEmptyAll() throws Exception {
        WebElement pwButton = driver.findElement(By.className("TEdit"));
        pwButton.click();
        Robot robot = new Robot();
        robot.delay(1000);
        //удаляю логин от предыдущей авторизации:
        // кнопкой Tab передвигаюсь по полям
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        //удаляю
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_DELETE);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        //клик по Готово = клик по ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }


    // analogically this method can use during case log In with a wrong PASSWORD
    public void stopEmptyLoginPassword() {

        WebElement errmess = driver.findElement(By.className("TFMyMess"));
        WebElement titlebar = errmess.findElement(By.id("TitleBar"));
        WebElement closebutton = titlebar.findElement(By.name("Закрыть"));
        closebutton.click();

    }
}
