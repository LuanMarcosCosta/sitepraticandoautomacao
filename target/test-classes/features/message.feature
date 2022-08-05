# language: pt

@mesangem
Funcionalidade: enviar mensagem

  @envio-mensagem
  Cenario: Enviar uma Mensagem com Sucesso
    Dado que estou na tela de envio de mensagens
    E preencho todos os campos
    Quando clico em enviar mensagem
    Entao vejo feedback de mensagem enviada com sucesso