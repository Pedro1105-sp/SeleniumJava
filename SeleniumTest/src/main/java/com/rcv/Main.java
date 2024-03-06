package com.rcv;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        // OPEN BROWSER
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro.candido\\Desktop\\PEDRO\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        // NAVEGANDO ATÉ O SITE
        driver.get("http://www.ebay.com/");

        // DEIXANDO A TELA NO MÁXIMO
        driver.manage().window().maximize();

        // PROCURANDO ELEMENTO E INSERINDO DADO NESSE ELEMENTO
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");

        // PROCURANDO ELEMENTO E CLICANDO NO ELEMENTO
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

        // CLOSE BROWSER
        driver.quit();

    }
}