package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }


//добавить Пациента - создать новую ЭМК - не работает , пока не работает  F5
public void startAdd(){
    WebElement menu = driver.findElement(By.name("Приложение"));
    menu.click();
    WebElement spravochnik = driver.findElement(By.name("Справочники"));
    spravochnik.click();
}

    public void startAddEMC() throws AWTException, InterruptedException {
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
        WebElement patientList = driver.findElement(By.className("TDBGridEh"));
        Actions actions = new Actions(driver);
        actions.contextClick(patientList).build().perform();
        //дальше не выполняется




            }


    public void addEmptyFieldsEMC() throws AWTException {
        Robot robot = new Robot();
        robot.delay(1000);
        WebElement readyButton = driver.findElement(By.name("Готово"));
        readyButton.click();
    }




//  метод добавления Администратора / успешно
   public void addAdminSuccess() throws AWTException, InterruptedException {
       startAdd();
       Thread.sleep(2000);
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
       // вводим ФИО иван администратор

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
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
       robot.keyPress(KeyEvent.VK_L);
       robot.keyRelease(KeyEvent.VK_L);
       robot.keyPress(KeyEvent.VK_V);
       robot.keyRelease(KeyEvent.VK_V);
       robot.keyPress(KeyEvent.VK_B);
       robot.keyRelease(KeyEvent.VK_B);
       robot.keyPress(KeyEvent.VK_Y);
       robot.keyRelease(KeyEvent.VK_Y);
       robot.keyPress(KeyEvent.VK_B);
       robot.keyRelease(KeyEvent.VK_B);
       robot.keyPress(KeyEvent.VK_C);
       robot.keyRelease(KeyEvent.VK_C);
       robot.keyPress(KeyEvent.VK_N);
       robot.keyRelease(KeyEvent.VK_N);
       robot.keyPress(KeyEvent.VK_H);
       robot.keyRelease(KeyEvent.VK_H);
       robot.keyPress(KeyEvent.VK_F);
       robot.keyRelease(KeyEvent.VK_F);
       robot.keyPress(KeyEvent.VK_N);
       robot.keyRelease(KeyEvent.VK_N);
       robot.keyPress(KeyEvent.VK_J);
       robot.keyRelease(KeyEvent.VK_J);
       robot.keyPress(KeyEvent.VK_H);
       robot.keyRelease(KeyEvent.VK_H);
       Thread.sleep(3000);
       WebElement readyButton = driver.findElement(By.name("Готово"));
       readyButton.click();

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
        Thread.sleep(2000);
        // оставим ФИО пустым
        WebElement readyButton = driver.findElement(By.name("Готово"));
        readyButton.click();


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
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);
        robot.keyPress(KeyEvent.VK_B);
        robot.keyRelease(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyRelease(KeyEvent.VK_J);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        Thread.sleep(2000);
        WebElement readyButton = driver.findElement(By.name("Готово"));
        readyButton.click();

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
        Thread.sleep(2000);
        // оставим ФИО пустым
        WebElement readyButtton = driver.findElement(By.name("Готово"));
        readyButtton.click();


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
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyRelease(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_F);
        robot.keyRelease(KeyEvent.VK_F);
        robot.keyPress(KeyEvent.VK_X);
        robot.keyRelease(KeyEvent.VK_X);
        Thread.sleep(1000);
        WebElement activeBox = driver.findElement(By.name("Активен"));
        activeBox.click();
        WebElement notDownloadBox = driver.findElement(By.name("Не выгружать на сайт"));
        notDownloadBox.click();
        Thread.sleep(2000);
        WebElement readyButton = driver.findElement(By.name("Готово"));
        readyButton.click();
        closeActiveWindow();
        Thread.sleep(2000);
        // срабатывает на другом элементе TEdit - их три с таким локатором
        WebElement spesialnost = driver.findElement(By.className("TEdit"));
        Actions builder = new Actions(driver);
        builder.moveToElement(spesialnost).doubleClick().build().perform();



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
        Thread.sleep(2000);
        WebElement readyButton = driver.findElement(By.name("Готово"));
        readyButton.click();


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
        robot.delay(2000);
        robot.keyRelease(KeyEvent.VK_ENTER);// нажать Да (или Готово) в диалоговом окне
        robot.keyPress(KeyEvent.VK_ENTER);// отпустить клавишу Да (или Готово) в диалоговом окне

    }

    //имитация сброса - клика по клавише Esc  в активном диалоговом окне
    public void abortActiveWindow() throws AWTException {
        Robot robot = new Robot();
        robot.delay(2000);
        robot.keyRelease(KeyEvent.VK_ESCAPE);// нажать клавишу Ecs чтобы закрыть активное окно
        robot.keyPress(KeyEvent.VK_ESCAPE);//отпустить клавишу Ecs

    }





}
