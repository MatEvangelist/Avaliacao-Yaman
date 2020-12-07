package br.com.evangelista.stepsWeb;

import br.com.evangelista.pages.HomePage;
import br.com.evangelista.pages.MovimentacaoPage;
import com.github.javafaker.Faker;
import io.cucumber.java.pt.Quando;

import java.util.Date;
import java.util.Locale;

import static br.com.evangelista.utils.DataUtils.obterDataFormatada;

public class MovimentacaoSteps {

    HomePage homePage = new HomePage();
    MovimentacaoPage moviPage = new MovimentacaoPage();
    private final Faker faker = new Faker(new Locale("pt-br"));

    @Quando("eu acesso minha conta")
    public void eu_acesso_minha_conta() {
        homePage.logar("zawahiri@zawahiri.com.br", "1234567890");
    }

    @Quando("crio uma nova movimentacao preenchendo todos os requisitos")
    public void crio_uma_nova_movimentacao_preenchendo_todos_os_requisitos() {
        moviPage.criarMovimentacao();
        moviPage.setDataMovimentacao(obterDataFormatada(new Date()));
        moviPage.setDataPagamento(obterDataFormatada(new Date()));
        moviPage.setDescricao("Movimentação do Teste");
        moviPage.setInteressado("Fulano");
        moviPage.setValor("999");
        moviPage.setConta("Conta para movimentacoes");
        moviPage.setSituacaoPago();
        moviPage.salvar();
    }
}
