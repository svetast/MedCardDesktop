package testObjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.BeforeClass;
import pageObjects.LoginWrongDataPage;

import java.io.File;
import java.io.IOException;
import java.util.Locale;


public class TestBase {
    public static final Logger LOG = Logger.getLogger(TestBase.class);
    pageObjects.BasePage BasePage;
    pageObjects.LoginPage LoginPage;
    pageObjects.MainPage MainPage;
    pageObjects.CreateEMCardPage CreateEMCardPage;
    pageObjects.ResultPage ResultPage;
    pageObjects.ErrorMessagePage ErrorMessagePage;
    pageObjects.LoginRegistratorPage LoginRegistratorPage;
    pageObjects.LoginAdminPage LoginAdminPage;
    pageObjects.LoginDocPage LoginDocPage;
    pageObjects.LoginWrongDataPage LoginWrongDataPage;
    pageObjects.LoginEmptyDataPage LoginEmptyDataPage;




    static WiniumDriver driver = null;
    static WiniumDriverService service = null;
    static DesktopOptions options = null;


    @BeforeClass
    public void setUpEnvironment() throws IOException {

        options = new DesktopOptions(); //Instantiate Winium Desktop options
        options.setApplicationPath("d:\\Users\\Stepanova_S\\MedCard_Test 10.12.253.23_Test\\PStartMedCard.exe");// set MedCard path
        File driverPath = new File("d:\\Users\\Stepanova_S\\Winium.Desktop.Driver.exe");// set Winium driver path
        service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).
                usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
        service.start();
        driver = new WiniumDriver(service, options); // start a Winium Driver
        PropertyConfigurator.configure("src/log4j.properties");
        Locale bLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        System.out.println(bLocale.getDisplayLanguage());//получаю вывод актуальной локали в консоль


        BasePage = PageFactory.initElements(driver, pageObjects.BasePage.class);
        LoginPage = PageFactory.initElements(driver, pageObjects.LoginPage.class);
        MainPage = PageFactory.initElements(driver, pageObjects.MainPage.class);
        CreateEMCardPage = PageFactory.initElements(driver, pageObjects.CreateEMCardPage.class);
        ResultPage = PageFactory.initElements(driver, pageObjects.ResultPage.class);
        ErrorMessagePage = PageFactory.initElements(driver, pageObjects.ErrorMessagePage.class);
        LoginRegistratorPage = PageFactory.initElements(driver, pageObjects.LoginRegistratorPage.class);
        LoginAdminPage = PageFactory.initElements(driver, pageObjects.LoginAdminPage.class);
        LoginDocPage = PageFactory.initElements(driver, pageObjects.LoginDocPage.class);
        LoginWrongDataPage = PageFactory.initElements(driver, LoginWrongDataPage.class);
        LoginEmptyDataPage = PageFactory.initElements(driver, pageObjects.LoginEmptyDataPage.class);
       

    }






  /*@AfterClass
      public static void closeDriver() {
        if (driver != null) {
             driver.quit();
        }
    }*/
}