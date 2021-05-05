package Pages;

import automovelSeguro.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DadosDoVeiculoPage extends BaseTest {

    public DadosDoVeiculoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@id=\"make\"]")
    private WebElement marca;
    @FindBy(xpath = "//select[@id=\"model\"]")
    private WebElement modelo;
    @FindBy(xpath = "//input[@id=\"cylindercapacity\"]")
    private WebElement capacidadeCilindrica;
    @FindBy(xpath = "//input[@id=\"engineperformance\"]")
    private WebElement desempenhoMotor;
    @FindBy(xpath = "//input[@id=\"dateofmanufacture\"]")
    private WebElement dataDeFabricacao;
    @FindBy(xpath = "//select[@id=\"numberofseats\"]")
    private WebElement numeroDeAssentos;
    @FindBy(xpath = "//input[@id=\"righthanddriveyes\"]/following-sibling::span[@class=\"ideal-radio\"]")
    private WebElement volanteLadoDireitoSim;
    @FindBy(xpath = "//input[@id=\"righthanddriveno\"]")
    private WebElement volanteLadoDireitoNao;
    @FindBy(xpath = "//select[@id=\"numberofseatsmotorcycle\"]")
    private WebElement numeroDeAssentosMotocicleta;
    @FindBy(xpath = "//select[@id=\"fuel\"]")
    private WebElement combustivel;
    @FindBy(xpath = "//input[@id=\"payload\"]")
    private WebElement carga;
    @FindBy(xpath = "//input[@id=\"totalweight\"]")
    private WebElement pesoTotal;
    @FindBy(xpath = "//input[@id=\"listprice\"]")
    private WebElement listaDePreco;
    @FindBy(xpath = "//input[@id=\"licenseplatenumber\"]")
    private WebElement numeroDePlaca;
    @FindBy(xpath = "//input[@id=\"annualmileage\"]")
    private WebElement quilometragem;
    @FindBy(xpath = "//button[@id=\"nextenterinsurantdata\"]")
    private WebElement proximoInsiraOsDadosDoSeguro;

    public WebElement getMarca(){return marca;}
    public WebElement getModelo(){return modelo;}
    public WebElement getCapacidadeCilindrica(){return capacidadeCilindrica;}
    public WebElement getDesempenhoMotor(){return desempenhoMotor;}
    public WebElement getDataDeFabricacao(){return dataDeFabricacao;}
    public WebElement getNumeroDeAssentos(){return numeroDeAssentos;}
    public WebElement getVolanteLadoDireitoSim(){return volanteLadoDireitoSim;}
    public WebElement getVolanteLadoDireitoNao(){return volanteLadoDireitoNao;}
    public WebElement getNumeroDeAssentosMotocicleta(){return numeroDeAssentosMotocicleta;}
    public WebElement getCombustivel(){return combustivel;}
    public WebElement getCarga(){return carga;}
    public WebElement getPesoTotal(){return pesoTotal;}
    public WebElement getListaDePreco(){return listaDePreco;}
    public WebElement getNumeroDePlaca(){return numeroDePlaca;}
    public WebElement getQuilometragem(){return quilometragem;}
    public WebElement getProximoInsiraOsDadosDoSeguro(){return proximoInsiraOsDadosDoSeguro;}
}
