package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProfilePage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    // определение локаторов

    //
    @FindBy(xpath = "//span[@class='compose-button__wrapper']")
    private WebElement createMail;

    public void createMessage() {
        createMail.click();
    }

    @FindBy(xpath = "//*[@class='container--H9L5q size_s--3_M-_']")
    private WebElement mailInput;

    @FindBy(xpath = "//div[@class='container--3QXHv']//div[@class='inputContainer--nsqFu']//*[@class='container--H9L5q size_s--3_M-_']")
    private WebElement themeInput;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[3]/div[4]/div/div/div[2]/div[1]/div[1]")
    private WebElement textInput;

    public void inputAll() {
        mailInput.sendKeys("makarovkirusha@yandex.ru");
        themeInput.sendKeys("Тестовое задание. Макаров");
        textInput.sendKeys(getCount());
    }

    @FindBy(xpath = "//span[@class='vkuiButton__in']")
    private WebElement sendBtn;

    public void pressSend() {
        sendBtn.click();
    }

    public String getCount() {
        int senderCount = driver.findElements(By.xpath("//span[contains(text(), 'Кирилл Макаров')]")).size();
        String count = String.valueOf(senderCount);
        System.out.println(senderCount);
        return count;
    }


    // определение локатора кнопки выхода из аккаунта

    @FindBy(xpath = "//*[contains(@class, '')]")
    private WebElement logoutBtn;

    public void userLogout() {
        logoutBtn.click();
    }
}
