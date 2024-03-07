package com.rcv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;


public class BasicMethodsWebriver {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedro.candido\\Desktop\\PEDRO\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // METHODS BASIC:

         /*get(java.lang.String url)
        	= CARREGA UMA NOVA PÁGINA DA WEB NA JANELA ATUAL DO NAVEGADOR*/
        driver.get("https://www.saucedemo.com/");



        /*manage()
          = OBTÉM A INTERFACE DE OPÇÕES*/
        driver.manage().window();


        /*getCurrentUrl()
           = OBTENHA UMA STRING REPRESENTANDO A URL ATUAL DO NAVEGADOR QUE ESTÁ VISUALIZANDO*/
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);


        /*getTitle()
           = TÍTULO DA PÁGINA ATUAL*/
        String title = driver.getTitle();
        System.out.println(title);



        /*getPageSource()
          = OBTENHA A FONTE DA ÚLTIMA PÁGINA CARREGADA*/
        String pagesource = driver.getPageSource();
        System.out.println(pagesource);


        /*navigate()
          = UMA ABSTRAÇÃO QUE PERMITE O DRIVER ACESSAR O HISTÓRICO DO NAVEGADOR E NAVEGAR ATÉ UMA DETERMINAD URL*/
        driver.navigate().to("https://www.saucedemo.com/");



        /*findElement(By by)
          = ENCONTRE O PRIMEIRO WEBELEMENT USANDO O MÉTODO FORNECIDO*/
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();


        /*findElements(By by)
          = ENCONTRE TODOS OS ELEMENTOS DA PÁGINA ATUAL USANDO O MECANISMO FORNECIDO*/
        List<WebElement> webelements = driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
        System.out.println(webelements);



        /*getWindowHandle()
            = RETORNA UM IDENTIFICADOR OPAQUE PARA ESTA JANELA QUE A IDENTIFICA EXCLUSIVAMENTE NESTA INSTÂNCIA DO DRIVER*/
        driver.navigate().to("https://www.sugarcrm.com/");
        String windowhandle = driver.getWindowHandle();
        System.out.println(windowhandle);

        
        /*getWindowHandles()
           = RETORNE UM CONJUNTO DE IDENTIFICADORORES DE JANELA QUE PODEM SER USADOS PRA ITERAR TODAS AS JANELAS ABERTAS DESTA INSTÂNCIA DO WEBDRIVER
                PASSANDO-AS PARA
                    switchTo().WebDriver.Option.Window();*/
        driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
        Set<String> windowhandles = driver.getWindowHandles();
        System.out.println(windowhandles);


        /*quit()
		   = SAI DESTE DRIVER, FECHANDO TODAS AS JANELAS ASSOCIADAS*/
        driver.quit();
    }
}
