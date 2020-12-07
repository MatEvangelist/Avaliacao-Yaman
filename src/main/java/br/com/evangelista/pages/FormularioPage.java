package br.com.evangelista.pages;

import br.com.evangelista.core.web.BasePage;
import org.openqa.selenium.By;

public class FormularioPage extends BasePage {

    public void criar() {
        clickar(By.xpath("//*[@name='commit']"));
    }

    public void setNome(String nome) {
        escreve("user_name", nome);
    }

    public void setSobrenome(String sobrenome) {
        escreve("user_lastname", sobrenome);
    }

    public void setEmail(String email) {
        escreve("user_email", email);
    }

    public void setEndereco(String endereco) {
        escreve("user_address", endereco);

    }

    public void setUniversidade(String universidade) {
        escreve("user_university", universidade);

    }

    public void setProfissao(String profissao) {
        escreve("user_profile", profissao);

    }

    public void setGenero(String genero) {
        escreve("user_gender", genero);

    }

    public void setIdade(int idade) {
        escreve("user_age", String.valueOf(idade));

    }
}
