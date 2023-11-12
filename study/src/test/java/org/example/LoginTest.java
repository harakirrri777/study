package org.example;
import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class LoginTest {

    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;

    @BeforeClass
    public static void setupAll() {

        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(ConfProperties.getProperty("loginpage"));

        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);

    }

    @Test
    public void loginTest() {

        loginPage.clickEntryBtn();

        loginPage.inputLogin(ConfProperties.getProperty("login"));

        //нажимаем кнопку входа
        loginPage.clickLoginBtn();

        //вводим пароль
        loginPage.inputPasswd(ConfProperties.getProperty("password"));

        loginPage.clickInBtn();

        //получаем отображаемый логин
        //String user = profilePage.getUserName();
        //и сравниваем его с логином из файла настроек
        //Assert.assertEquals(ConfProperties.getProperty("login"), user);
    }

    @AfterClass
    public static void tearDown() {
        profilePage.entryMenu();
        //profilePage.userLogout();
        //driver.quit();
    }
}

