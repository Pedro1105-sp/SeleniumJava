package com.rcv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro.candido\\Desktop\\PEDRO\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.singaporeair.com/en_UK/au/home#/book/bookflight");
        Thread.sleep(5000);

        WebElement radio1 = driver.findElement(By.id("bookFlights"));
        WebElement radio2 = driver.findElement(By.id("redeemFlights"));

        radio1.click();
        System.out.println(radio1.isSelected());
        System.out.println(radio2.isSelected());

        System.out.println(driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());


    }
}
