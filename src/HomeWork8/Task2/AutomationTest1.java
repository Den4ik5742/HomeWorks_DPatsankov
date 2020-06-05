package HomeWork8.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutomationTest1 {
    public static void main(String[] args) {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://mail.ru/");

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement loginField = webDriver.findElement(By.xpath("//input[@id='mailbox:login']"));
        loginField.sendKeys("patsankov.gamer");
        loginField.submit();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement passwordField = webDriver.findElement(By.xpath("//*[@id=\"mailbox:password\"]"));
        passwordField.sendKeys("den4ik5742");
        passwordField.submit();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement listLetters = webDriver.findElement(By.xpath("//div[@class='dataset__items']"));

        if (listLetters.isDisplayed()) {
            System.out.println("Страница с письмами открыта");
        } else {
            System.out.println("Страница с письмами не открыта");
        }
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.quit();
    }
}
