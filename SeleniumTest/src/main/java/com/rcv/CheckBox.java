package com.rcv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro.candido\\Desktop\\PEDRO\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        Thread.sleep(5000);

        WebElement radio = driver.findElement(By.id("doi0"));
        Actions actions = new Actions(driver);
        actions.moveToElement(radio);
        actions.perform();

        driver.findElement(By.name("doi")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("doi")).click();
    }
}
