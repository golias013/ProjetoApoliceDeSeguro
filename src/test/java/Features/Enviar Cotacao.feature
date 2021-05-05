#Language:en
#Author:Golias
#Encoding:UTF-8
Feature: Enviar solicitacao de cotacao
  Scenario: CT005 - Envio de cotacao com Sucesso
    Given Preencher formulario de cotacao
    When Clico no botao send na tela de cotacao
    Then Valido email enviado com sucesso