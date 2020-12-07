package br.com.evangelista.stepsWeb;

import br.com.evangelista.pages.CadastroPage;
import br.com.evangelista.pages.HomePage;
import com.github.javafaker.Faker;
import io.cucumber.java.pt.Quando;

import java.util.Locale;

public class CadastroSteps {

    private final HomePage homePage = new HomePage();
    private final CadastroPage cadastroPage = new CadastroPage();
    private final Faker faker = new Faker(new Locale("pt-br"));


    @Quando("clico em novo usuario")
    public void clico_em_novo_usuario() {
        homePage.criarUsuario();
    }

    @Quando("crio um usuario preenchendo corretamente os campos de cadastro")
    public void crio_um_usuario_preenchendo_corretamente_os_campos_de_cadastro() {
        cadastroPage.setNome(faker.name().firstName());
        cadastroPage.setEmail(faker.internet().emailAddress());
        cadastroPage.setSenha(faker.internet().password());
        cadastroPage.salvar();
    }

}