package com.rcv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdpwn {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro.candido\\Desktop\\PEDRO\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.manage().window().maximize();

        // LIDANDO COM MENU DROPDOWN PART 1
        WebElement dropdown = driver.findElement(By.name("awareness_source_c"));
        Select select = new Select(dropdown);

        select.selectByValue("Event");
        Thread.sleep(2000);

        select.selectByVisibleText("YouTube");
        Thread.sleep(2000);

        select.selectByIndex(2);
        Thread.sleep(2000);


    }
}
