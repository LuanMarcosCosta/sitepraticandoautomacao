# language: pt

  @cadastro
  Funcionalidade: cadastro de usuario

    @cadastroSucesso
    Cenario: Registrar novo usuario com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuario
      Quando eu preencho o formulario de cadastro
      E clcio em registrar
      Entao vejo cadastro realizado com sucesso