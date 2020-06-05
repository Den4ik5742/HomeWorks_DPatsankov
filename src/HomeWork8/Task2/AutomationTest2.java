package HomeWork8.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutomationTest2 {
    public static void main(String[] args) throws InterruptedException {
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
        WebElement writeButton = webDriver.findElement(By.xpath("//*[@href=\"/compose/\"]"));
        writeButton.click();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement getterLetter = webDriver.findElement(By.xpath("//input[@class='container--H9L5q size_s--3_M-_'][1]"));
        getterLetter.sendKeys("patsankov.gamer@mail.ru");

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement header = webDriver.findElement(By.xpath("//input[@class='container--H9L5q size_s--3_M-_'][@name='Subject']"));
        header.sendKeys("AutomationTest2");

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement text = webDriver.findElement(By.xpath("//div[@role='textbox']"));
        text.sendKeys("test text");

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement sendButton = webDriver.findElement(By.xpath("//span[@class='button2 button2_base button2_primary button2_hover-support js-shortcut']"));
        sendButton.click();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement closeButton = webDriver.findElement(By.xpath("//span[@class='button2__wrapper'][@tabindex='1000']"));
        closeButton.click();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.navigate().refresh();

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement newMessage = webDriver.findElement(By.xpath("//div[@class='llc__content']"));
        newMessage.click();

        if (webDriver.getPageSource().contains("AutomationTest2")) {
            System.out.println("Письмо получено и открыто");
        } else {
            System.out.println("Письмо не получено");
        }
        webDriver.quit();
    }
}
