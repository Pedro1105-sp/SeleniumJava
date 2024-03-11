package com.rcv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintAllLinks {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro.candido\\Desktop\\PEDRO\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sugarcrm.com/au/request-demo/");

        List<WebElement> alltags = driver.findElements(By.tagName("a"));
        System.out.println("Total de Tags são: " + alltags.size());

        for (int i=0; i<alltags.size(); i++) {
            System.out.println("Links da página são: " + alltags.get(i).getAttribute("href"));
            System.out.println("Links da página são: " + alltags.get(i).getText());
        }
    }

}
