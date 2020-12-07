package br.com.evangelista.stepsWeb;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Teste {
    //    private FormularioPage getFormularioValido () {
//            FormularioPage formPage = new FormularioPage();
//            formPage.setNome(faker.name().firstName());
//            formPage.setSobrenome(faker.name().lastName());
//            formPage.setEmail(faker.internet().emailAddress());
//            formPage.setEndereco("Rua " + System.nanoTime());
//            formPage.setUniversidade("Universidade de " + faker.address());
//            formPage.setProfissao("Programador");
//            formPage.setGenero("Masculino");
//            formPage.setIdade(15);
//            return formPage;
//    }
    @Test
    public void teste() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automacaocombatista.herokuapp.com/home/index");
        driver.findElement(By.xpath("//*[@id=\"index-banner\"]/div/div[3]/a")).click();
        driver.findElement(By.xpath("//div[2]/div[1]//li")).click();
        driver.findElement(By.linkText("Criar Usuários")).click();

    }
}
