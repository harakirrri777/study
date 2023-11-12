package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//button[contains(text(), 'Войти')]")
    private WebElement EntryBtn;

    /**
     * определение локатора поля ввода логина
     */
    @FindBy(xpath = "//*[@name='username']")
    private WebElement loginField;

    /**
     * определение локатора кнопки входа в аккаунт
     */
    @FindBy(xpath = "//*[contains(text(), 'Ввести пароль')]") //*[contains(text(), 'Войти')]/..
    private WebElement enterPasswordBtn;

    /**
     * определение локатора поля ввода пароля
     */
    @FindBy(xpath = "//input[@name='password']") //input[@id='password'] //*[contains(@id, 'passp-field-passwd')]
    private WebElement passwdField;

    // кнопка Войти
    @FindBy(xpath = "//button[@data-test-id = 'submit-button']") //*[contains(text(), 'Войти')]/..
    private WebElement InBtn;

    /**
     * метод для ввода логина
     */
    public void inputLogin(String login) {
        int t = 10;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(t));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Имя аккаунта']")));
        loginField.sendKeys(login);
    }

    /**
     * метод для ввода пароля
     */
    public void inputPasswd(String passwd) {
       // int t = 10;
       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(t));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@id, 'passp-field-passwd')]")));
        passwdField.sendKeys(passwd);
    }

    /**
     * метод для осуществления нажатия кнопки входа в аккаунт
     */
    public void clickEntryBtn() { EntryBtn.click(); }
    public void clickInBtn() {
        InBtn.click();
    }
    public void clickLoginBtn() {
        enterPasswordBtn.click();
    }
}