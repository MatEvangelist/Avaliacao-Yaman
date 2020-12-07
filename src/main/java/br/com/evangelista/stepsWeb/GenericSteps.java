package br.com.evangelista.stepsWeb;

import br.com.evangelista.core.web.BasePage;
import br.com.evangelista.pages.CadastroPage;
import br.com.evangelista.pages.HomePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import org.junit.Assert;

public class GenericSteps {

    private final HomePage homePage = new HomePage();
    private final BasePage basePage = new BasePage();
    private final CadastroPage cadastroPage = new CadastroPage();

    @Dado("que eu acesso o site")
    public void que_eu_acesso_o_site() {
        homePage.acessarTelaInicial();
    }

    @Então("valido que a mensagem {string} esta sendo exibida")
    public void valido_que_a_mensagem_esta_sendo_exibida(String string) {
        Assert.assertEquals(string, homePage.obterMensagemSucesso());
    }
}
