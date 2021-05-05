package Pages;

import automovelSeguro.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DadosDoProdutoPage extends BaseTest {
    public DadosDoProdutoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id=\"startdate\"]")
    private WebElement dataDeInicio;
    @FindBy(xpath = "//select[@id=\"insurancesum\"]")
    private WebElement seguro;
    @FindBy(xpath = "//select[@id=\"meritrating\"]")
    private WebElement meritracao;
    @FindBy(xpath = "//select[@id=\"damageinsurance\"]")
    private WebElement seguroDeDanos;
    @FindBy(xpath = "//input[@id=\"EuroProtection\"]/following-sibling::span[@class=\"ideal-check\"]")
    private WebElement protecaoDeEuro;
    @FindBy(xpath = "//input[@id=\"LegalDefenseInsurance\"]")
    private WebElement seguroDeDefesaLegal;
    @FindBy(xpath = "//select[@id=\"courtesycar\"]")
    private WebElement carroCortesia;
    @FindBy(xpath = "//button[@id=\"preventerinsurancedata\"]")
    private WebElement voltarParaDadosDoSeguro;
    @FindBy(xpath = "//button[@id=\"nextselectpriceoption\"]")
    private WebElement avancarParaOpcaoDePreco;

    public WebElement getDataDeInicio(){return dataDeInicio;}
    public WebElement getSeguro(){return seguro;}
    public WebElement getMeritracao(){return meritracao;}
    public WebElement getSeguroDeDanos(){return seguroDeDanos;}
    public WebElement getProtecaoDeEuro(){return protecaoDeEuro;}
    public WebElement getSeguroDeDefesaLegal(){return seguroDeDefesaLegal;}
    public WebElement getCarroCortesia(){return carroCortesia;}
    public WebElement getVoltarParaDadosDoSeguro(){return voltarParaDadosDoSeguro;}
    public WebElement getAvancarParaOpcaoDePreco(){return avancarParaOpcaoDePreco;}
}
