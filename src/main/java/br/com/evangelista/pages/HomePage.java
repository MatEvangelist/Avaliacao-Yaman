package br.com.evangelista.pages;

import br.com.evangelista.core.web.BasePage;
import org.openqa.selenium.By;

import static br.com.evangelista.core.web.DriverFactory.driver;


public class HomePage extends BasePage {

    public void acessarTelaInicial() {
        driver().get("https://srbarriga.herokuapp.com");
    }

    public void setEmail(String email) {
        escreve(By.xpath("//*[@id='email']"), email);
    }

    public void setSenha(String senha) {
        escreve(By.xpath("//*[@id='senha']"), senha);
    }

    public void setNome(String nome) {
        escreve(By.xpath("//*[@id='nome']"), nome);
    }

    public void entrar() {
        clicarBotaoPorTexto("Entrar");
    }

    public void criarUsuario() {
        clicarLink("Novo usuário?");
    }

    public String obterMensagemSucesso(){
        return obterTexto(By.xpath("//div[@class='alert alert-success']"));
    }


    public void logar(String email, String senha) {
        setEmail(email);
        setSenha(senha);
        entrar();
    }

}
