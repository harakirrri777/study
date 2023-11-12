package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Network;

public class Main {
    public static void main(String[] args) {
        /*
        1) Использовать Python/Java/C# (предпочтительно java), подключить библиотеку Selenium Webdriver;
        2) С помощью Selenium открыть браузер, открыть gmail.com, авторизоваться, зайти
        на почту;
        3) С помощью Selenium определить, сколько нашлось писем от другого своего почтового ящика;
        4) С помощью Selenium и интерфейса почты автоматически написать и отправить
        письмо на другой почтовый ящик, в тексте которого указать найденное в шаге 3
        количество писем. Указать тему письма "Тестовое задание. <Фамилия>", где
                <Фамилия> - это Ваша фамилия;
        5) Оформить действия пп. 2-4 в виде теста.*/

//        System.setProperty("webdriver.chrome.driver", "F:\\progs\\drivers\\chromedriver.exe"); https://passport.yandex.ru/auth

//
//        ChromeOptions chromeOptions = new ChromeOptions();
//
//        Network.UserAgent ua = new Network.UserAgent("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36");
//        chromeOptions.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/119.0.0.0 Safari/537.36");
//        chromeOptions.addArguments(ua.toString());
//
//        WebDriver driver = new ChromeDriver(chromeOptions);
//
//        driver.get("https://www.gmail.com/");
//
//        WebElement addressInput = driver.findElement(By.xpath("//input[@aria-label='Телефон или адрес эл. почты']"));
//        addressInput.sendKeys("chillyvillyeee@gmail.com");
//        addressInput.sendKeys(Keys.ENTER);
//
//        WebElement passwordInput = driver.findElement(By.xpath("//input[@aria-label='Введите пароль']"));
//        passwordInput.sendKeys("");
//        passwordInput.sendKeys(Keys.ENTER);
//
//
//
//        WebElement next = driver.findElement(By.xpath(""));
//
//        next.click();
    }
}