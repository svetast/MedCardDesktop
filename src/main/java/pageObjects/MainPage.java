package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }


//добавить Пациента - создать новую ЭМК - не работает , пока не работает  F5
public void startAdd(){
    WebElement menu = driver.findElement(By.name("Приложение"));
    WebElement spravochnik = driver.findElement(By.name("Справочники"));
    spravochnik.click();
}

    public void addEMC() throws AWTException {
        startAdd();
        System.out.print("Click on Spravochnik");
        Robot robot = new Robot();
        robot.delay(1000);
        //перемещение с помощью стрелки вниз до искомого пункта меню Пациенты , т.к. нет локаторов у искомого контролла
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
            }

//  метод добавления Администратора / успешно
   public void addAdminSuccess() throws AWTException, InterruptedException {
       startAdd();
       Thread.sleep(3000);
       Robot robot = new Robot();
       robot.delay(1000);
        //перемещение с помощью стрелки вниз до искомого пункта меню Администраторы , т.к. нет локаторов у искомого контролла
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        //  клик по F5 - добавить нового пользователя
        robot.keyRelease(KeyEvent.VK_F5);
        robot.keyPress(KeyEvent.VK_F5);
        // вводим ФИО Иван Иванов

        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_J);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        Thread.sleep(1000);
        WebElement readyBut = driver.findElement(By.name("Готово"));
        readyBut.click();
        Thread.sleep(2000);

    }

    //  метод добавления Администратора с пустым ФИО
    public void addEmptyAdmin() throws AWTException, InterruptedException {
        startAdd();
        Robot robot = new Robot();
        robot.delay(1000);
        //перемещение с помощью стрелки вниз до искомого пункта меню Администраторы , т.к. нет локаторов у искомого контролла
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        //  клик по F5 - добавить нового пользователя
        robot.keyRelease(KeyEvent.VK_F5);
        robot.keyPress(KeyEvent.VK_F5);
        // оставим ФИО пустым
        WebElement readyBut = driver.findElement(By.name("Готово"));
        readyBut.click();
        Thread.sleep(2000);

    }
    //  метод добавления Регистратора / успешно
    public void addRegistratorSuccess() throws AWTException, InterruptedException {
        startAdd();
        Robot robot = new Robot();
        robot.delay(1000);
        //перемещение с помощью стрелки вниз до искомого пункта меню Администраторы , т.к. нет локаторов у искомого контролла
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        //  клик по F5 - добавить нового пользователя
        robot.keyRelease(KeyEvent.VK_F5);
        robot.keyPress(KeyEvent.VK_F5);
        // вводим ФИО Иван Иванов
        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_J);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        Thread.sleep(1000);
        WebElement readyBut = driver.findElement(By.name("Готово"));
        readyBut.click();
        Thread.sleep(2000);
    }

    //  метод добавления Registrator с пустым ФИО
    public void addEmptyRegistrator() throws AWTException, InterruptedException {
        startAdd();
        Robot robot = new Robot();
        robot.delay(1000);
        //перемещение с помощью стрелки вниз до искомого пункта меню Администраторы , т.к. нет локаторов у искомого контролла
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        //  клик по F5 - добавить нового пользователя
        robot.keyRelease(KeyEvent.VK_F5);
        robot.keyPress(KeyEvent.VK_F5);
        // оставим ФИО пустым
        WebElement readyBut = driver.findElement(By.name("Готово"));
        readyBut.click();
        Thread.sleep(2000);

    }











    public  void deleteNewPerson() throws AWTException {
        Robot robot = new Robot();
        robot.delay(1000);
        //Возврат в исходное состояние - Удаление только что созданного пользователя :
        robot.keyRelease(KeyEvent.VK_F8);//нажать клавишу F8
        robot.keyPress(KeyEvent.VK_F8);// отпустить клавишу F8
        robot.keyRelease(KeyEvent.VK_ESCAPE);// нажать клавишу Ecs чтобы сбросить  лишнее окно "Добавить нового пользователя" - потом убрать этот кусок
        robot.keyPress(KeyEvent.VK_ESCAPE);//отпустить клавишу Ecs
        robot.keyRelease(KeyEvent.VK_ENTER);// нажать Да в диалоговом окне
        robot.keyPress(KeyEvent.VK_ENTER);// отпустить клавишу
        robot.keyRelease(KeyEvent.VK_ESCAPE);// нажать клавишу Ecs чтобы закрыть активное окно
        robot.keyPress(KeyEvent.VK_ESCAPE);//отпустить клавишу Ecs

    }



    // добавить Регистратора
    public void addRegistrator() throws AWTException {
        startAdd();
        Robot robot = new Robot();
        robot.delay(1000);
        //перемещение с помощью стрелки вниз до искомого пункта меню Регистраторы , т.к. нет локаторов у искомого контролла
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);

    }

    //  метод добавления Администратора / успешно
    public void addDocSuccess() throws AWTException, InterruptedException {
        startAdd();
        Robot robot = new Robot();
        robot.delay(1000);
        //перемещение с помощью стрелки вниз до искомого пункта меню Врачи , т.к. нет локаторов у искомого контролла
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        //  клик по F5 - добавить нового пользователя
        robot.keyRelease(KeyEvent.VK_F5);
        robot.keyPress(KeyEvent.VK_F5);
        // вводим ФИО Иван Иванов

        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_J);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        Thread.sleep(1000);
        WebElement activeBox = driver.findElement(By.name("Активен"));
        activeBox.click();
        WebElement notDownloadBox = driver.findElement(By.name("Не выгружать на сайт"));
        notDownloadBox.click();
        // WebElement spesialnost = driver.findElement(By.className("TEdit"));
        //spesialnost.click();
        //veprik
        // Actions actionDC = new Actions(driver);
        //spesialnost = driver.findElement(By.className("TEdit"));
        //  spesialnost.click();
        //actionDC.doubleClick(spesialnost);
        //  actionDC.doubleClick();
        //veprik
        WebElement readyBut = driver.findElement(By.name("Готово"));
        readyBut.click();
        closeActiveWindow();
        Thread.sleep(2000);
        //Actions builder = new Actions(driver);
        // builder.doubleClick().build().perform();

    }


    //метод закрытия Главного окна программы
    public void closeMainWindow() throws AWTException {
        WebElement titleBar = driver.findElement(By.id("TitleBar"));
        WebElement closeMainMenuButton = titleBar.findElement(By.name("Закрыть"));
        closeMainMenuButton.click();
        closeActiveWindow();

    }




    //имитация клика по Enter в диалоговом окне "Выйти из программы Да /Нет"
    public void closeActiveWindow() throws AWTException {
        Robot robot = new Robot();
        robot.delay(1000);
        robot.keyRelease(KeyEvent.VK_ENTER);// нажать Да (или Готово) в диалоговом окне
        robot.keyPress(KeyEvent.VK_ENTER);// отпустить клавишу Да (или Готово) в диалоговом окне

    }

    //имитация сброса - клика по клавише Esc  в активном диалоговом окне
     public void abortActiveWindow() throws AWTException {
        Robot robot = new Robot();
        robot.delay(1000);
         robot.keyRelease(KeyEvent.VK_ESCAPE);// нажать клавишу Ecs чтобы закрыть активное окно
         robot.keyPress(KeyEvent.VK_ESCAPE);//отпустить клавишу Ecs

    }


    public void addDocEmpty() throws InterruptedException, AWTException {
        startAdd();
        Robot robot = new Robot();
        robot.delay(1000);
        //перемещение с помощью стрелки вниз до искомого пункта меню Врачи , т.к. нет локаторов у искомого контролла
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        //  клик по F5 - добавить нового пользователя
        robot.keyRelease(KeyEvent.VK_F5);
        robot.keyPress(KeyEvent.VK_F5);
        Thread.sleep(3000);
        WebElement readyBut = driver.findElement(By.name("Готово"));
        readyBut.click();


    }
}
