package Steps;

import Function.*;
import automovelSeguro.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutomobileInsuranceStep extends BaseTest {
    private DadosDoVeiculoFunction dadosDoVeiculoFunction;
    private DadosDoSeguradoFunction dadosDoSeguradoFunction;
    private DadosDoProdutoFunction dadosDoProdutoFunction;
    private SelecionarPlanoDeSeguroFunction planoDeSeguroFunction;
    private EnviarCotacaoFunction enviarCotacaoFunction;

    public AutomobileInsuranceStep(){
        this.dadosDoVeiculoFunction = new DadosDoVeiculoFunction();
        this.dadosDoSeguradoFunction = new DadosDoSeguradoFunction();
        this.dadosDoProdutoFunction = new DadosDoProdutoFunction();
        this.planoDeSeguroFunction = new SelecionarPlanoDeSeguroFunction();
        this.enviarCotacaoFunction = new EnviarCotacaoFunction();
    }
    @Before
    public void abrirNavegador(){
        driver.get(url);
    }

    //CT01 - Cadastro de dados do Veiculo
    //-----------------------------------------------------------------------------------

    @Given("Preencha o formulario de dados do veiculo")
    public void preencha_o_formulario_de_dados_do_veiculo() {
       this.dadosDoVeiculoFunction.preencherDadosDoVeiculo();
    }

    @When("Clico no botao next")
    public void clico_no_botao_next() {
        this.dadosDoVeiculoFunction.clicarBotaoNextDaTelaDadosDoVeiculo();
    }

    @Then("Valido formulario de dados do segurado")
    public void valido_formulario_de_dados_do_segurado() {
      this.dadosDoVeiculoFunction.validarTituloDadosSegurado();
    }

    //CT02- Cadastro de dados do Veiculo
    //-----------------------------------------------------------------------------------

    @Given("Preencha o formulario de dados do segurado")
    public void preencha_o_formulario_de_dados_do_segurado() {
        this.dadosDoVeiculoFunction.preencherDadosDoVeiculo();
        this.dadosDoVeiculoFunction.clicarBotaoNextDaTelaDadosDoVeiculo();
        this.dadosDoVeiculoFunction.validarTituloDadosSegurado();
        this.dadosDoSeguradoFunction.preencherDadosDoSegurado();
    }

    @When("Clico no botao next da tela dados do segurado")
    public void clico_no_botao_next_da_tela_dados_do_segurado() {
       this.dadosDoSeguradoFunction.clicarBotaoNextDaTelaDadosDoSegurado();
    }

    @Then("Valido formulario de dados do produto")
    public void valido_formulario_de_dados_do_produto() {
       this.dadosDoSeguradoFunction.validarTituloDadosProduto();
    }

    //CT03 - Cadastro de dados do produto
    //-----------------------------------------------------------------------------------

    @Given("Preencha o formulario de dados do produto")
    public void preencha_o_formulario_de_dados_do_produto() {
        this.dadosDoVeiculoFunction.preencherDadosDoVeiculo();
        this.dadosDoVeiculoFunction.clicarBotaoNextDaTelaDadosDoVeiculo();
        this.dadosDoVeiculoFunction.validarTituloDadosSegurado();
        this.dadosDoSeguradoFunction.preencherDadosDoSegurado();
        this.dadosDoSeguradoFunction.clicarBotaoNextDaTelaDadosDoSegurado();
        this.dadosDoSeguradoFunction.validarTituloDadosProduto();
        this.dadosDoProdutoFunction.preencherDadosDoProduto();
    }

    @When("Clico no botao next na tela de dados do produto")
    public void clico_no_botao_next_na_tela_de_dados_do_produto() {
        this.dadosDoProdutoFunction.clicarBotaoNextDaTelaDadosDoProduto();
    }

    @Then("Valido formulario de opcao de preco")
    public void valido_formulario_de_opcao_de_preco() {
        this.dadosDoProdutoFunction.validarTituloOpcaoDePreco();
    }

    //CT04 - Escolher a opcao de preco
    //-----------------------------------------------------------------------------------
    @Given("Selecionar plano do seguro")
    public void selecionar_plano_do_seguro() {
        this.dadosDoVeiculoFunction.preencherDadosDoVeiculo();
        this.dadosDoVeiculoFunction.clicarBotaoNextDaTelaDadosDoVeiculo();
        this.dadosDoVeiculoFunction.validarTituloDadosSegurado();
        this.dadosDoSeguradoFunction.preencherDadosDoSegurado();
        this.dadosDoSeguradoFunction.clicarBotaoNextDaTelaDadosDoSegurado();
        this.dadosDoSeguradoFunction.validarTituloDadosProduto();
        this.dadosDoProdutoFunction.preencherDadosDoProduto();
        this.dadosDoProdutoFunction.clicarBotaoNextDaTelaDadosDoProduto();
        this.dadosDoProdutoFunction.validarTituloOpcaoDePreco();
        this.planoDeSeguroFunction.selecionarPlanoDeSeguro();
    }

    @When("Clico no botao next na tela de plano do seguro")
    public void clico_no_botao_next_na_tela_de_plano_do_seguro() {
     this.planoDeSeguroFunction.clicarBotaoNextDaTelaPlanoDeSeguro();
    }

    @Then("Valido formulario de cotacao")
    public void valido_formulario_de_cotacao() {
      this.planoDeSeguroFunction.validarTituloCotacao();
    }

    //CT05 - Preencher formulario de cotacao
    //-----------------------------------------------------------------------------------
    @Given("Preencher formulario de cotacao")
    public void preencher_formulario_de_cotacao() {
        this.dadosDoVeiculoFunction.preencherDadosDoVeiculo();
        this.dadosDoVeiculoFunction.clicarBotaoNextDaTelaDadosDoVeiculo();
        this.dadosDoVeiculoFunction.validarTituloDadosSegurado();
        this.dadosDoSeguradoFunction.preencherDadosDoSegurado();
        this.dadosDoSeguradoFunction.clicarBotaoNextDaTelaDadosDoSegurado();
        this.dadosDoSeguradoFunction.validarTituloDadosProduto();
        this.dadosDoProdutoFunction.preencherDadosDoProduto();
        this.dadosDoProdutoFunction.clicarBotaoNextDaTelaDadosDoProduto();
        this.dadosDoProdutoFunction.validarTituloOpcaoDePreco();
        this.planoDeSeguroFunction.selecionarPlanoDeSeguro();
        this.planoDeSeguroFunction.clicarBotaoNextDaTelaPlanoDeSeguro();
        this.planoDeSeguroFunction.validarTituloCotacao();
        this.enviarCotacaoFunction.envioDeCotacao();
    }
    @When("Clico no botao send na tela de cotacao")
    public void clico_no_botao_send_na_tela_de_cotacao() {
        this.enviarCotacaoFunction.clicarBotaoSendDaTelaEnvioCotacao();
    }
    @Then("Valido email enviado com sucesso")
    public void valido_email_enviado_com_sucesso() {
        this.enviarCotacaoFunction.validarEmailEnviado();
    }
}
