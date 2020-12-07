package br.com.evangelista.pages;

import br.com.evangelista.core.web.BasePage;
import org.openqa.selenium.By;

public class CadastroPage extends BasePage {

    public void setEmail(String email) {
        escreve(By.xpath("//*[@id='email']"), email);
    }

    public void setSenha(String senha) {
        escreve(By.xpath("//*[@id='senha']"), senha);
    }

    public void setNome(String nome) {
        escreve(By.xpath("//*[@id='nome']"), nome);
    }

    public void salvar() {
        clickar(By.xpath("//*[@value='Cadastrar']"));
    }
}
