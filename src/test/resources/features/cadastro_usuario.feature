# language: pt

  @cadastro_de_usuario
  Funcionalidade: Cadastro de usuário
    Eu como usuário do sistema
    Quero me cadastrar
    Para finalizar uma compra no site

    @cadastro_usuario_sucesso
    Cenário: Nome do usuário vazio
      Dado que estou na tela de cadastro de usuário
      E preencho todos os campos obrigatórios
      Quando clico em cadastrar
      Então vejo mensagem de usuário cadastrado com sucesso
