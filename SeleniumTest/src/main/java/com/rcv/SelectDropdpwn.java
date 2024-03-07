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
        //driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        driver.manage().window().maximize();

        // LIDANDO COM MENU DROPDOWN PART 1 e 2
        WebElement dropdown = driver.findElement(By.name("awareness_source_c"));
        Select select = new Select(dropdown);

        // MOSTRANDO A PRIMEIRA SELEÇÃO DE OPÇÃO
        WebElement firstOption = select.getFirstSelectedOption();
        System.out.println(firstOption.getText());

        select.selectByValue("Event");
        Thread.sleep(2000);

        select.selectByVisibleText("YouTube");
        Thread.sleep(2000);


        /*selectByIndex(int index)
		   = SELECIONE A OPÇÃO NO ÍNDICE FORNCIDO*/
        select.selectByIndex(2);
        Thread.sleep(2000);


        /** deselectByIndex(int index)
		   = DESMARQUE A OPÇÃO NO ÍNDICE FORNCIDO*/
        select.deselectByIndex(2);
        Thread.sleep(2000);

        driver.quit();


    }
}
