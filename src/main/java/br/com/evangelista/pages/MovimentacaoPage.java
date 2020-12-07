package br.com.evangelista.pages;

import br.com.evangelista.core.web.BasePage;
import org.openqa.selenium.By;

public class MovimentacaoPage extends BasePage {

    public void criarMovimentacao() {
        clicarLink("Criar Movimentação");
    }

    public void setDataMovimentacao(String data) {
        escreve("data_transacao", data);
    }

    public void setDataPagamento(String data) {
        escreve("data_pagamento", data);
    }

    public void setDescricao(String descricao) {
        escreve("descricao", descricao);
    }

    public void setInteressado(String interessado) {
        escreve("interessado", interessado);
    }

    public void setValor(String valor) {
        escreve("valor", valor);
    }

    public void setConta(String conta) {
        selecionarCombo("conta", conta);
    }

    public void setSituacaoPago() {
        clickar("status_pago");
    }

    public void salvar() {
        clickar(By.xpath("//button"));
    }


}
