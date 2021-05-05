package Pages;

import automovelSeguro.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelecionarPlanoDeSeguroPage extends BaseTest {
    public SelecionarPlanoDeSeguroPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id=\"selectsilver\"]")
    private WebElement selecionarPlanoPrata;
    @FindBy(xpath = "//input[@id=\"selectgold\"]")
    private WebElement selecionarPlanoOuro;
    @FindBy(xpath = "//input[@id=\"selectplatinum\"]")
    private WebElement selecionarPlanoPlatina;
    @FindBy(xpath = "//input[@id='selectultimate']/following-sibling::span[@class='ideal-radio']")
    private WebElement selecionarPlanoUltimate;
    @FindBy(xpath = "//button[@id=\"preventerproductdata\"]")
    private WebElement retornarParaDadosDoProduto;
    @FindBy(xpath = "//button[@id=\"nextsendquote\"]")
    private WebElement avancarParaCotacao;

    public WebElement getSelecionarPlanoPrata(){return selecionarPlanoPrata;}
    public WebElement getSelecionarPlanoOuro(){return selecionarPlanoOuro;}
    public WebElement getSelecionarPlanoPlatina(){return selecionarPlanoPlatina;}
    public WebElement getSelecionarPlanoUltimate(){return selecionarPlanoUltimate;}
    public WebElement getRetornarParaDadosDoProduto(){return retornarParaDadosDoProduto;}
    public WebElement getAvancarParaCotacao(){return avancarParaCotacao;}
}
