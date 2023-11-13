package org.example;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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
    public void loginTest() throws InterruptedException {

        loginPage.clickEntryBtn();

        //Переключаемся на выплюнотое окошко
        WebElement frame = driver.findElement(By.xpath("//*[@class= 'ag-popup__frame__layout__iframe']"));
        driver.switchTo().frame(frame);

        loginPage.inputLogin(ConfProperties.getProperty("login"));

        loginPage.clickLoginBtn();

        loginPage.inputPasswd(ConfProperties.getProperty("password"));

        loginPage.clickInBtn();

        driver.switchTo().defaultContent();

        Thread.sleep(Duration.ofSeconds(5));

        //String count = profilePage.getCount();

        profilePage.createMessage();

        Thread.sleep(Duration.ofSeconds(5));

        profilePage.inputAll();

        profilePage.pressSend();

    }

    @AfterClass
    public static void tearDown() {

        profilePage.userLogout();
        driver.quit();
    }
}

