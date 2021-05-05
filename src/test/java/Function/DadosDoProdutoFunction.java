package Function;

import Pages.DadosDoProdutoPage;
import automovelSeguro.BaseTest;
import automovelSeguro.Utils;
import org.openqa.selenium.By;

public class DadosDoProdutoFunction extends BaseTest {
    private DadosDoProdutoPage dadosDoProdutoPage;
    private Utils utils;

    public DadosDoProdutoFunction() {
        this.dadosDoProdutoPage = new DadosDoProdutoPage(driver);
        this.utils = new Utils();
    }

    public void preencherDadosDoProduto() {
        if (this.dadosDoProdutoPage.getDataDeInicio().isEnabled()) {
            System.out.println("Elemento data de inicio encontrado");
            this.utils.preencheCampoTexto(this.dadosDoProdutoPage.getDataDeInicio(), "06/13/2021");
            System.out.println("data de inicio preenchido");
        }
        else {
            System.out.println("Elemento data de inicio nao encontrado");
        }
        if (this.dadosDoProdutoPage.getSeguro().isEnabled()) {
            System.out.println("Elemento seguro encontrado");
            this.utils.selectByValue(this.dadosDoProdutoPage.getSeguro(), "3000000");
            System.out.println("seguro selecionado");
        }
        else {
            System.out.println("Elemento seguro nao encontrado");
        }
        if (this.dadosDoProdutoPage.getMeritracao().isEnabled()) {
            System.out.println("Elemento meritracao encontrado");
            this.utils.selectByValue(this.dadosDoProdutoPage.getMeritracao(), "Bonus 2");
            System.out.println("Meritracao selecionado");
        }
        else {
            System.out.println("Elemento meritracao nao encontrado");
        }
        if (this.dadosDoProdutoPage.getSeguroDeDanos().isEnabled()) {
            System.out.println("Elemento seguro de danos encontrado");
            this.utils.selectByValue(this.dadosDoProdutoPage.getSeguroDeDanos(), "Partial Coverage");
            System.out.println("Seguro de danos selecionado");
        }
        else {
            System.out.println("Elemento seguro de danos nao encontrado");
        }

        if (this.dadosDoProdutoPage.getProtecaoDeEuro().isEnabled()) {
            System.out.println("Elemento protecao de euro encontrado");
            this.dadosDoProdutoPage.getProtecaoDeEuro().click();
            System.out.println("Protecao de euro selecionado");
        }
        else {
            System.out.println("Elemento protecao de euro nao encontrado");
        }
        if (this.dadosDoProdutoPage.getCarroCortesia().isEnabled()) {
            System.out.println("Elemento carro cortesia encontrado");
            this.utils.selectByValue(this.dadosDoProdutoPage.getCarroCortesia(), "Yes");
            System.out.println("Carro Cortesia selecionado");
        }
        else {
            System.out.println("Elemento carro cortesia nao encontrado");
        }
    }
    public void clicarBotaoNextDaTelaDadosDoProduto(){
        if(this.dadosDoProdutoPage.getAvancarParaOpcaoDePreco().isEnabled()){
            System.out.println("Elemento botao next da tela de produto encontrado");
            this.dadosDoProdutoPage.getAvancarParaOpcaoDePreco().click();
            System.out.println("Pagina Opcao de preco encontrada");
        }
    }
    public String validarTituloOpcaoDePreco(){
        return driver.findElement(By.xpath("//li[@class=\"idealsteps-step-active\"]/child::a[@id=\"selectpriceoption\" and @name=\"Select Price Option\"]")).getText();
    }
}
