package Pages;

import automovelSeguro.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnvioDeCotacaoPage extends BaseTest {
    public EnvioDeCotacaoPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement email;
    @FindBy(xpath = "//input[@id=\"phone\"]")
    private WebElement telefone;
    @FindBy(xpath = "//input[@id=\"username\"]")
    private WebElement nomeDeUsuario;
    @FindBy(xpath = "//input[@id=\"password\"]")
    private WebElement senha;
    @FindBy(xpath = "//input[@id=\"confirmpassword\"]")
    private WebElement confirmarSenha;
    @FindBy(xpath = "//textarea[@id=\"Comments\"]")
    private WebElement comentarios;
    @FindBy(xpath = "//button[@id=\"prevselectpriceoption\"]")
    private WebElement retornarParaSelecaoDePreco;
    @FindBy(xpath = "//button[@id=\"sendemail\"]")
    private WebElement enviarEmail;

    public WebElement getEmail(){return email;}
    public WebElement getTelefone(){return telefone;}
    public WebElement getNomeDeUsuario(){return nomeDeUsuario;}
    public WebElement getSenha(){return senha;}
    public WebElement getConfirmarSenha(){return confirmarSenha;}
    public WebElement getComentarios(){return comentarios;}
    public WebElement getRetornarParaSelecaoDePreco(){return retornarParaSelecaoDePreco;}
    public WebElement getEnviarEmail(){return enviarEmail;}
}
