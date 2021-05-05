#Language:en
#Author:Golias
#Encoding:UTF-8
Feature: Selecionar Plano Do Seguro
  Scenario: CT004 - Selecionar Plano de Seguro com Sucesso
    Given Selecionar plano do seguro
    When Clico no botao next na tela de plano do seguro
    Then Valido formulario de cotacao