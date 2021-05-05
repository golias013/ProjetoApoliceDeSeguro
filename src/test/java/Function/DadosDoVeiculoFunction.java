package Function;

import Pages.DadosDoVeiculoPage;
import automovelSeguro.BaseTest;
import automovelSeguro.Utils;
import org.openqa.selenium.By;

public class DadosDoVeiculoFunction extends BaseTest {
    private DadosDoVeiculoPage dadosDoVeiculoPage;
    private Utils utils;

    public DadosDoVeiculoFunction(){
        this.dadosDoVeiculoPage = new DadosDoVeiculoPage(driver);
        this.utils = new Utils();
    }

    public void preencherDadosDoVeiculo(){
        if (this.dadosDoVeiculoPage.getMarca().isEnabled()){
            System.out.println("Elemento marca encontrado");
            this.utils.selectByValue(this.dadosDoVeiculoPage.getMarca(),"BMW");
            System.out.println("Marca Selecionada como BMW");
        }
        else{
            System.out.println("Elemento marca nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getModelo().isEnabled()){
            System.out.println("Elemento modelo encontrado");
            this.utils.selectByValue(this.dadosDoVeiculoPage.getModelo(),"Scooter");
            System.out.println("Modelo Selecionada como BMW");
        }
        else{
            System.out.println("Elemento modelo nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getCapacidadeCilindrica().isEnabled()){
            System.out.println("Elemento marca encontrado");
            this.utils.preencheCampoTexto(this.dadosDoVeiculoPage.getCapacidadeCilindrica(),"1200");
            System.out.println("Capacidade Cilindrica preenchida");
        }
        else{
            System.out.println("Elemento capacidade cilindrica nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getDesempenhoMotor().isEnabled()){
            System.out.println("Elemento desempenho do motor encontrado");
            this.utils.preencheCampoTexto(this.dadosDoVeiculoPage.getDesempenhoMotor(),"1000");
            System.out.println("Desempenho do motor preenchido");
        }
        else{
            System.out.println("Elemento desempenho do motor nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getDataDeFabricacao().isEnabled()){
            System.out.println("Elemento data de fabricacao encontrado");
            this.utils.preencheCampoTexto(this.dadosDoVeiculoPage.getDataDeFabricacao(),"05/25/2001");
            System.out.println("Data de fabricacao preenchida com sucesso");
        }
        else{
            System.out.println("Elemento data de fabricacao nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getNumeroDeAssentos().isEnabled()){
            System.out.println("Elemento Numero de Assentos encontrado");
            this.utils.selectByValue(this.dadosDoVeiculoPage.getNumeroDeAssentos(),"6");
            System.out.println("Numero de assentos Selecionada como 6");
        }
        else{
            System.out.println("Elemento Numero de Aassentos nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getVolanteLadoDireitoSim().isEnabled()){
            System.out.println("Elemento volante lado direito encontrado");
           this.dadosDoVeiculoPage.getVolanteLadoDireitoSim().click();
            System.out.println("Volante lado Direito selecionado como sim");
        }
        else{
            System.out.println("Elemento volante lado direito nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getNumeroDeAssentosMotocicleta().isEnabled()){
            System.out.println("Elemento numero de assentos motocicleta encontrado");
            this.utils.selectByValue(this.dadosDoVeiculoPage.getNumeroDeAssentosMotocicleta(),"2");
            System.out.println("Assento motocicleta selecionado");
        }
        else{
            System.out.println("Elemento assentos motocicleta nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getCombustivel().isEnabled()){
            System.out.println("Elemento combustivel encontrado");
            this.utils.selectByValue(this.dadosDoVeiculoPage.getCombustivel(),"Diesel");
            System.out.println("Combustivel Selecionada como BMW");
        }
        else{
            System.out.println("Elemento combustivel nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getCarga().isEnabled()){
            System.out.println("Elemento carga encontrado");
            this.utils.preencheCampoTexto(this.dadosDoVeiculoPage.getCarga(),"800");
            System.out.println("Carga preenchida");
        }
        else{
            System.out.println("Elemento carga nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getPesoTotal().isEnabled()){
            System.out.println("Elemento peso total encontrado");
            this.utils.preencheCampoTexto(this.dadosDoVeiculoPage.getPesoTotal(),"3000");
            System.out.println("Peso total preenchido");
        }
        else{
            System.out.println("Elemento peso total nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getListaDePreco().isEnabled()){
            System.out.println("Elemento lista de preco encontrado");
            this.utils.preencheCampoTexto(this.dadosDoVeiculoPage.getListaDePreco(),"1500");
            System.out.println("lista de preco preenchida");
        }
        else{
            System.out.println("Elemento lista de preco nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getNumeroDePlaca().isEnabled()){
            System.out.println("Elemento numero de placa encontrado");
            this.utils.preencheCampoTexto(this.dadosDoVeiculoPage.getNumeroDePlaca(),"500");
            System.out.println("numero de placa preenchida");
        }
        else{
            System.out.println("Elemento numero de placa nao encontrado");
        }
        if (this.dadosDoVeiculoPage.getQuilometragem().isEnabled()){
            System.out.println("Elemento quilometragem encontrado");
            this.utils.preencheCampoTexto(this.dadosDoVeiculoPage.getQuilometragem(),"3000");
            System.out.println("quilometragem preenchida");
        }
        else{
            System.out.println("Elemento quilometragem nao encontrado");
        }
    }
    public void clicarBotaoNextDaTelaDadosDoVeiculo(){
        if(this.dadosDoVeiculoPage.getProximoInsiraOsDadosDoSeguro().isEnabled()){
            System.out.println("Elemento botao next encontrado");
            this.dadosDoVeiculoPage.getProximoInsiraOsDadosDoSeguro().click();
            System.out.println("Pagina Dados do Segurado encontrada");
        }
    }
    public String validarTituloDadosSegurado(){
        return driver.findElement(By.xpath("//li[@class=\"idealsteps-step-active\"]/child::a[@id=\"enterinsurantdata\" and @name=\"Enter Insurant Data\"]")).getText();
    }
}
