#language: pt
# enconding: utf-08

  Funcionalidade: API de Contas

    Cenario: Incluir conta com sucesso
      Dado que eu obtenha o token
      Quando faco uma requisicao do tipo post
      Entao valido que o status code foi 201
      E valido que o nome da conta foi inserido corretamente
