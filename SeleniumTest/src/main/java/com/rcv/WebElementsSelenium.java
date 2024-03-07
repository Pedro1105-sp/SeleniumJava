package com.rcv;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsSelenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro.candido\\Desktop\\PEDRO\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sugarcrm.com/au/request-demo/");



        /*sendKeys(java.lang.CharSequence... keysToSend)
		   = USE ESTE MÉTODO PARA SIMULAR A DIGITAÇÃO EM UM ELEMENTO, QUE PODE DEFINIR SEU VALOR*/
        driver.findElement(By.name("email")).sendKeys("teste@gmail.com");


        /*clear()
          = SE ESTE ELEMENTO FOR UM ELEMENTO DE ENTRADA DE TEXTO, ISSO LIMPARÁ  VALOR*/
        driver.findElement(By.name("email")).clear();


        /*getAttribute(java.lang.String name)
           = OBTENHA O VALOR DO ATRIBUTO FORNCIDO DO ELEMENTO*/
        System.out.println(driver.findElement(By.name("email")).getAttribute("class"));


        /*getCssValue(java.lang.String propertyName)
            = OBTENHA O VALOR DE UMA DETERMINADA PROPRIEDADE CSS*/
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("text-transform"));


        /*getSize()
           = QUAL É A ALTURA E LARGURA DO ELEMENTO RENDERIZADO*/
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());


        /*getLocation()
           = ONDE NA PÁGINA ESTÁ NO TOP LETF-HAND DO ELEMENTO RENDERIZADO*/
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());


        /*getText()
           = OBTENHA O TEXTO VÍSIVEL*/
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getText());


        /*getTagName()
           = OBTENHA O NOME DA TAG DESTE ELEMENTO*/
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());


        /*isDisplayed()
           = ESTE ELEMENTO É EXIBIDO OU NÃO? ESTE MÉTODO EVITA O PROBLEMA DE TER QUE ANALISAR O ATRIBUTO "STYLE" DE UM ELEMENTO*/
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());


        /*isEnabled()
          = O ELEMENTO ESTÁ HABILITADO OU NÃO? GERALMENTE, ISSO RETORNARÁ VERDADEIRO PARA TUDO, EXCETO ELEMENTOS DE ENTRADA DESABILITADOS*/
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());


        /*isSelected()
           = DETERMINE SE ESTE ELEMENTO ESTÁ SELECIONADO OU NÃO*/
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());



        driver.quit();
    }
}
