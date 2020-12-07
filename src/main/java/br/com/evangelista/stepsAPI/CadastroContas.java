package br.com.evangelista.stepsAPI;

import br.com.evangelista.core.restAPI.BaseRequest;
import com.github.javafaker.Faker;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Locale;

public class CadastroContas  {

    private static final Faker faker = new Faker(new Locale("pt-br"));
    private String nome_da_conta = faker.name().name();
    BaseRequest baseRequest = new BaseRequest();

    @Dado("que eu obtenha o token")
    public void que_eu_obtenha_o_token() {
        baseRequest.getToken("zawahiri@zawahiri.com.br", "1234567890");
    }

    @Quando("faco uma requisicao do tipo POST na API de contas")
    public void faco_uma_requisicao_do_tipo_post() {
        baseRequest.realizarPost("contas","{\"nome\": \"" + nome_da_conta + "\"}").then().log().all();
    }

    @Entao("valido que o status code foi {int}")
    public void valido_que_o_status_code_foi(Integer statusCode) {
        Assert.assertEquals(statusCode, baseRequest.getStatusCode());
    }

    @Entao("valido que o nome da conta foi inserido corretamente")
    public void valido_que_o_nome_da_conta_foi_inserido_corretamente() {
        Assert.assertEquals(nome_da_conta, baseRequest.getNomeDaConta());
    }

}
