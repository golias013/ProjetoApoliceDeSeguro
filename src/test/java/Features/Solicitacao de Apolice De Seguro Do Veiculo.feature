#Language:en
#Author:Golias
#Encoding:UTF-8
Feature: Selecionar Plano Do Seguro
  Scenario: CT006 - Solicitacao de Apolice de Seguro Do Veiculo
    Given Preencher formulario de dados do veiculo
    And  Preencher formulario de dados do segurado
    And  Preencher formulario de dados do produto
    And  Selecionar um plano para o seguro do veiculo
    And  Preencher formulario de envio de cotacao
    When Clico no botao enviar cotacao
    Then Valido a mensagem de email enviado com sucesso