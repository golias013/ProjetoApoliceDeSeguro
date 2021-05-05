#Language:en
#Author:Golias
#Encoding:UTF-8
Feature: Cadastro de Dados do Produto
  Scenario: CT001 - Cadastrar Dados do Produto com Sucesso
    Given Preencha o formulario de dados do produto
    When Clico no botao next na tela de dados do produto
    Then Valido formulario de opcao de preco