package com.rcv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro.candido\\Desktop\\PEDRO\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//span[text()='From']")).click();
        WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));


        from.sendKeys("Sydney");
        Thread.sleep(2000);
        from.sendKeys(Keys.ARROW_DOWN);                 // NAVEGANDO PARA A LINHA DEBAIXO
        Thread.sleep(2000);
        from.sendKeys(Keys.ENTER);                      // CLICANDO EM ENTER
        Thread.sleep(2000);

    }
}
