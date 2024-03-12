package com.rcv;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro.candido\\Desktop\\PEDRO\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

        WebElement frame1 = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("/html/body/button")).click();
        String alertText = driver.switchTo().alert().getText();
        //System.out.println(alertText);
        Thread.sleep(5000);

        Alert alertonpage = driver.switchTo().alert();
        alertonpage.sendKeys("PEDRO TESTE");
        alertonpage.accept();

        //driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
    }
}
