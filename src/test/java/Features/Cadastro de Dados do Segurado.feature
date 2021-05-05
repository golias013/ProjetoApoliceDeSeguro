#Language:en
#Author:Golias
#Encoding:UTF-8
Feature: Cadastro de Dados do Segurado
  Scenario: CT002 - Cadastrar Dados do Segurado com Sucesso
    Given Preencha o formulario de dados do segurado
    When Clico no botao next da tela dados do segurado
    Then Valido formulario de dados do produto