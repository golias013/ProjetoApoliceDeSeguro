package Pages;

import automovelSeguro.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DadosDoSeguradoPage extends BaseTest {
    public DadosDoSeguradoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//input[@id=\"firstname\"]")
    private WebElement primeiroNome;
    @FindBy (xpath = "//input[@id=\"lastname\"]")
    private WebElement ultimoNome;
    @FindBy (xpath = "//input[@id=\"birthdate\"]")
    private WebElement dataDeNascimento;
    @FindBy (xpath = "//input[@id=\"gendermale\"]/following-sibling::span[@class=\"ideal-radio\"]")
    private WebElement generoMasculino;
    @FindBy (xpath = "//input[@id=\"genderfemale\"]")
    private WebElement generoFeminino;
    @FindBy (xpath = "//input[@id=\"streetaddress\"]")
    private WebElement endereco;
    @FindBy (xpath = "//select[@id=\"country\"]")
    private WebElement pais;
    @FindBy (xpath = "//input[@id=\"zipcode\"]")
    private WebElement codigoPostal;
    @FindBy (xpath = "//input[@id=\"city\"]")
    private WebElement cidade;
    @FindBy (xpath = "//select[@id=\"occupation\"]")
    private WebElement ocupacao;
    @FindBy (xpath = "//input[@id=\"speeding\"]")
    private WebElement velocidade;
    @FindBy (xpath = "//input[@id=\"bungeejumping\"]/following-sibling::span[@class=\"ideal-check\"]")
    private WebElement hobbies;
    @FindBy (xpath = "//input[@id=\"cliffdiving\"]")
    private WebElement quedaLivre;
    @FindBy (xpath = "//input[@id=\"skydiving\"]")
    private WebElement paraquedismo;
    @FindBy (xpath = "//input[@id=\"other\"]")
    private WebElement outros;
    @FindBy (xpath = "//input[@id=\"website\"]")
    private WebElement site;
    @FindBy (xpath = "//input[@id=\"picture\"]")
    private WebElement imagem;
    @FindBy (xpath = "//button[@id=\"open\"]")
    private WebElement abrirImagem;
    @FindBy (xpath = "//button[@id=\"preventervehicledata\"]")
    private WebElement retornarParaDadosDoVeiculo;
    @FindBy (xpath = "//button[@id=\"nextenterproductdata\"]")
    private WebElement avancarParaDadosDoProduto;

    public WebElement getPrimeiroNome(){return primeiroNome;}
    public WebElement getUltimoNome(){return ultimoNome;}
    public WebElement getDataDeNascimento(){return dataDeNascimento;}
    public WebElement getGeneroMasculino(){return generoMasculino;}
    public WebElement getGeneroFeminino(){return generoFeminino;}
    public WebElement getEndereco(){return endereco;}
    public WebElement getPais(){return pais;}
    public WebElement getCodigoPostal(){return codigoPostal;}
    public WebElement getCidade(){return cidade;}
    public WebElement getOcupacao(){return ocupacao;}
    public WebElement getVelocidade(){return velocidade;}
    public WebElement getHobbies(){return hobbies;}
    public WebElement getQuedaLivre(){return quedaLivre;}
    public WebElement getParaquedismo(){return paraquedismo;}
    public WebElement getOutros(){return outros;}
    public WebElement getSite(){return site;}
    public WebElement getImagem(){return imagem;}
    public WebElement getAbrirImagem(){return abrirImagem;}
    public WebElement getRetornarParaDadosDoVeiculo(){return retornarParaDadosDoVeiculo;}
    public WebElement getAvancarParaDadosDoProduto(){return avancarParaDadosDoProduto;}
}
