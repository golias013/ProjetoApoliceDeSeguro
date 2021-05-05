#Language:en
#Author:Golias
#Encoding:UTF-8
  Feature: Cadastro de Dados do Veiculo
    Scenario: CT001 - Cadastrar Dados do Veiculo com Sucesso
      Given Preencha o formulario de dados do veiculo
      When Clico no botao next
      Then Valido formulario de dados do segurado