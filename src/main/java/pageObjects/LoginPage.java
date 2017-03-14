package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;


public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver)
    {
        super(driver);
    }

    public WebDriver getDriver() {

        return driver;
    }

    // авторизация  как ADMIN
    public void authorizationAdmin() throws InterruptedException, Exception {
        WebElement pwField = driver.findElement(By.className("TEdit"));
        pwField.click();
        Robot robot = new Robot();
        robot.delay(1000);
        //фокус на поле Введите пароль
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        //перехожу к полю Введите имя
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        //удаляю данные прошлой авторизации
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_DELETE);
        //ввожу логин в поле Введите имя
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        WebElement readyButton = driver.findElement(By.name("Готово"));
        readyButton.click();
    }

    // авторизация  как REGISTRATOR
    public void authorizationRegistrator() throws InterruptedException, Exception {
        WebElement pwButton = driver.findElement(By.className("TEdit"));
        pwButton.click();
        Robot robot = new Robot();
        robot.delay(1000);
        //фокус на поле Введите пароль
        //robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
       // robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        //перехожу к полю Введите имя
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        //удаляю данные прошлой авторизации
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_DELETE);
        //ввожу логин в поле Введите имя
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        WebElement readyButton = driver.findElement(By.name("Готово"));
        readyButton.click();
        Thread.sleep(3000);
        //сообщение НЕ выгружать на сайт => клик по ДА = клик по ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }


    // авторизация  как DOCTOR
    public void authorizationDoc() throws InterruptedException, Exception {
        WebElement pwButton = driver.findElement(By.className("TEdit"));
        pwButton.click();
        Robot robot = new Robot();
        robot.delay(1000);
        //фокус на поле Введите пароль
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
           //перехов к полю Введите имя
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        //удаляю данные прошлой авторизации
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_DELETE);
        //ввожу логин в поле Введите имя
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_1);
        robot.keyRelease(KeyEvent.VK_1);
        //клик по Готово
        WebElement readyButton = driver.findElement(By.name("Готово"));
        readyButton.click();
        Thread.sleep(3000);
        //сообщение НЕ выгружать на сайт => клик по ДА = клик по ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }

    public void startWrongPassword () throws InterruptedException, Exception {
        WebElement pwButton = driver.findElement(By.className("TEdit"));
        pwButton.click();
        Robot robot = new Robot();
        robot.delay(1000);
        //фокус на поле Введите пароль

        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
                //перехожу к полю Введите имя
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        //удаляю данные прошлой авторизации
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_DELETE);
        //ввожу логин в поле Введите имя
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_M);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        WebElement readyButton = driver.findElement(By.name("Готово"));
        readyButton.click();
    }


    public void startWrongUsername () throws InterruptedException, Exception {
        WebElement pwButton = driver.findElement(By.className("TEdit"));
        pwButton.click();
        Robot robot = new Robot();
        robot.delay(1000);
        //фокус на поле Введите пароль
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        //перехожу к полю Введите имя
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        //удаляю данные прошлой авторизации
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_DELETE);
        //ввожу логин в поле Введите имя
        robot.keyPress(KeyEvent.VK_P);
        robot.keyRelease(KeyEvent.VK_P);
        WebElement readyButton = driver.findElement(By.name("Готово"));
        readyButton.click();
        Thread.sleep(3000);
        //сообщение НЕ выгружать на сайт => клик по ДА = клик по ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }


    public void startEmptyPassword () {

        WebElement readyButton = driver.findElement(By.name("Готово"));
        readyButton.click();
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

        WebElement errmess = driver.findElement (By.className ("TFMyMess"));
        WebElement titlebar = errmess.findElement (By.id ("TitleBar"));
        WebElement closebutton = titlebar.findElement (By.name ("Закрыть"));
        closebutton.click ();

    }

    public void stopAuthorization() throws InterruptedException {
        WebElement abortbutton = driver.findElement(By.className("TFAutorizacia"));
        waitAction();
        abortbutton.findElement (By.name ("Закрыть")).click ();

    }


}


