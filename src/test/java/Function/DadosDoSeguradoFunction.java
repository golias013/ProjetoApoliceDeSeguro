package Function;

import Pages.DadosDoSeguradoPage;
import automovelSeguro.BaseTest;
import automovelSeguro.Utils;
import org.openqa.selenium.By;

public class DadosDoSeguradoFunction extends BaseTest {
    private DadosDoSeguradoPage dadosDoSeguradoPage;
    private Utils utils;

    public DadosDoSeguradoFunction() {
        this.dadosDoSeguradoPage = new DadosDoSeguradoPage(driver);
        this.utils = new Utils();
    }

    public void preencherDadosDoSegurado() {
        if (this.dadosDoSeguradoPage.getPrimeiroNome().isEnabled()) {
            System.out.println("Elemento primeiro nome encontrado");
            this.utils.preencheCampoTexto(this.dadosDoSeguradoPage.getPrimeiroNome(), "golias");
            System.out.println("primeiro nome preenchido");
        } else {
            System.out.println("Elemento primeiro nome nao encontrado");
        }
        if (this.dadosDoSeguradoPage.getUltimoNome().isEnabled()) {
            System.out.println("Elemento ultimo nome encontrado");
            this.utils.preencheCampoTexto(this.dadosDoSeguradoPage.getUltimoNome(), "hugo");
            System.out.println("ultimo nome preenchido");
        } else {
            System.out.println("Elemento ultimo nome nao encontrado");
        }
        if (this.dadosDoSeguradoPage.getDataDeNascimento().isEnabled()) {
            System.out.println("Elemento data de nascimento encontrado");
            this.utils.preencheCampoTexto(this.dadosDoSeguradoPage.getDataDeNascimento(), "06/13/1997");
            System.out.println("data de nascimento preenchido");
        } else {
            System.out.println("Elemento data de nascimento nao encontrado");
        }
        if (this.dadosDoSeguradoPage.getGeneroMasculino().isEnabled()) {
            System.out.println("Elemento genero encontrado");
            this.dadosDoSeguradoPage.getGeneroMasculino().click();
            System.out.println("genero preenchido");
        } else {
            System.out.println("Elemento genero nao encontrado");
        }
        if (this.dadosDoSeguradoPage.getEndereco().isEnabled()) {
            System.out.println("Elemento endereco encontrado");
            this.utils.preencheCampoTexto(this.dadosDoSeguradoPage.getEndereco(), "rua do abacaxi");
            System.out.println("endereco preenchido");
        } else {
            System.out.println("Elemento endereco nao encontrado");
        }
        if (this.dadosDoSeguradoPage.getPais().isEnabled()) {
            System.out.println("Elemento pais encontrado");
            this.utils.selectByValue(this.dadosDoSeguradoPage.getPais(), "Brazil");
            System.out.println("pais selecionado");
        } else {
            System.out.println("Elemento pais nao encontrado");
        }
        if (this.dadosDoSeguradoPage.getCodigoPostal().isEnabled()) {
            System.out.println("Elemento codigo postal encontrado");
            this.utils.preencheCampoTexto(this.dadosDoSeguradoPage.getCodigoPostal(), "38011540");
            System.out.println("codigo postal preenchido");
        } else {
            System.out.println("Elemento codigo postal nao encontrado");
        }
        if (this.dadosDoSeguradoPage.getCidade().isEnabled()) {
            System.out.println("Elemento cidade encontrado");
            this.utils.preencheCampoTexto(this.dadosDoSeguradoPage.getCidade(), "zimbabue");
            System.out.println("cidade preenchido");
        } else {
            System.out.println("Elemento cidade nao encontrado");
        }
        if (this.dadosDoSeguradoPage.getOcupacao().isEnabled()) {
            System.out.println("Elemento ocupacao encontrado");
            this.utils.selectByValue(this.dadosDoSeguradoPage.getOcupacao(), "Employee");
            System.out.println("ocupacao selecionada");
        } else {
            System.out.println("Elemento ocupacao nao encontrado");
        }
        if (this.dadosDoSeguradoPage.getHobbies().isEnabled()) {
            System.out.println("Elemento hobbies encontrado");
            this.dadosDoSeguradoPage.getHobbies().click();
            System.out.println("hobbies selecionada");
        } else {
            System.out.println("Elemento hobbies nao encontrado");
        }
    }

    public void clicarBotaoNextDaTelaDadosDoSegurado(){
        if(this.dadosDoSeguradoPage.getAvancarParaDadosDoProduto().isEnabled()){
            System.out.println("Elemento botao next da tela de Segurado encontrado");
            this.dadosDoSeguradoPage.getAvancarParaDadosDoProduto().click();
            System.out.println("Pagina Dados do Produto encontrada");
        }
    }
    public String validarTituloDadosProduto(){
        return driver.findElement(By.xpath("//li[@class=\"idealsteps-step-active\"]/child::a[@id=\"enterproductdata\" and @name=\"Enter Product Data\"]")).getText();
    }
    }
