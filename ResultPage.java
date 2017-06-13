package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ResultPage extends BasePage {
    public ResultPage(WebDriver driver) {
        super(driver);
    }


    public String resultAddAdminEmpty(WebDriver driver) throws Exception {
        return driver.findElement(By.name("Ошибка")).toString();


    }

    //a method  which getting a name of opened window
    public void getAdminTitle(WebDriver driver) {

        // вывод на печать наименование открытого окна
        System.out.println(driver.findElement(By.name("Пользователь :: Администратор. (Администратор) 10.12.253.23 Тестовая БД->LocalHost")).toString());


    }


    //a method  which getting a name of opened window
    public void getDocTitle(WebDriver driver) {

        // вывод на печать наименование открытого окна
        System.out.println(driver.findElement(By.name("Пользователь :: Сидоров Василий Владимирович. (Врач) 10.12.253.23 Тестовая БД->LocalHost")).toString());


    }


    public void getEmptyDocTitle(WebDriver driver) {

        // вывод на печать наименование открытого окна
        System.out.println(driver.findElement(By.name("Регистрационная карточка сотрудника")).toString());


    }

    //a method  which getting a name of opened window
    public void getRegistratorTitle(WebDriver driver) {

        // вывод на печать наименование открытого окна
        System.out.println(driver.findElement(By.name("Пользователь :: Петрова Алла Ивановна. (Регистратор) 10.12.253.23 Тестовая БД->LocalHost")).toString());


    }

    //a method  which getting a name of opened window
    public void getAddAdminTitle(WebDriver driver) {

        // вывод на печать наименование открытого окна
        System.out.println(driver.findElement(By.name("Список Администраторов")).toString());


    }

    public void getAddRegistrTitle(WebDriver driver) {

        // вывод на печать наименование открытого окна
        System.out.println(driver.findElement(By.name("Список регистраторов")).toString());


    }




}
