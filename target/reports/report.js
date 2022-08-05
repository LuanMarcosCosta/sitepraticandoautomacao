$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("message.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "enviar mensagem",
  "description": "",
  "id": "enviar-mensagem",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@mesangem"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Enviar uma Mensagem com Sucesso",
  "description": "",
  "id": "enviar-mensagem;enviar-uma-mensagem-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@envio-mensagem"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que estou na tela de envio de mensagens",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "preencho todos os campos",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "clico em enviar mensagem",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "vejo feedback de mensagem enviada com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "messageSteps.que_estou_na_tela_de_envio_de_mensagens()"
});
formatter.result({
  "duration": 8844701100,
  "status": "passed"
});
formatter.match({
  "location": "messageSteps.preencho_todos_os_campos()"
});
formatter.result({
  "duration": 680334300,
  "status": "passed"
});
formatter.match({
  "location": "messageSteps.clico_em_enviar_mensagem()"
});
