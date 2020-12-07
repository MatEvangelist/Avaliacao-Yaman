package br.com.evangelista.core.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static br.com.evangelista.core.web.DriverFactory.driver;

public class BasePage {

    /**
     * Métodos de clicar
     */

    public void clicarLink(String link) {
        driver().findElement(By.linkText(link)).click();
    }

    public void clickar(String id) {
        driver().findElement(By.id(id)).click();
    }

    public void clickar(By by) {
        driver().findElement(by).click();
    }

    public void clicarBotaoPorTexto(String texto) {
        clickar(By.xpath("//button[.='" + texto + "']"));
    }

    /**
     * Métodos de escrita
     */

    public void escreve(By by, String texto) {
        driver().findElement(by).clear();
        driver().findElement(by).sendKeys(texto);
    }

    public void escreve(String id_campo, String texto) {
        driver().findElement(By.id(id_campo)).clear();
        driver().findElement(By.id(id_campo)).sendKeys(texto);
    }

    /**
     * Métodos de obter texto
     */

    public String obterTexto(By by) {
        return driver().findElement(by).getText();
    }

    public String obterTexto(String id) {
        return obterTexto(By.id(id));
    }


    /**
     * Métodos para combo
     */

    public void selecionarCombo(String id, String valor) {
        WebElement element = driver().findElement(By.id(id));
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }

    /**
     *
     */

}
