package Function;

import Pages.EnvioDeCotacaoPage;
import automovelSeguro.BaseTest;
import automovelSeguro.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnviarCotacaoFunction extends BaseTest {

    private EnvioDeCotacaoPage envioDeCotacaoPage;
    private Utils utils;

    public EnviarCotacaoFunction() {
        this.envioDeCotacaoPage = new EnvioDeCotacaoPage(driver);
        this.utils = new Utils();
        wait = new WebDriverWait(driver, 10);
    }

    public void envioDeCotacao(){
        if (this.envioDeCotacaoPage.getEmail().isEnabled()) {
            System.out.println("Elemento email encontrado");
            this.utils.preencheCampoTexto(this.envioDeCotacaoPage.getEmail(),"goliasntc@hotmail.com");
            System.out.println("Campo email preenchido");
        } else {
            System.out.println("Elemento email nao encontrado");
        }
        if (this.envioDeCotacaoPage.getTelefone().isEnabled()) {
            System.out.println("Elemento phone encontrado");
            this.utils.preencheCampoTexto(this.envioDeCotacaoPage.getTelefone(),"1396369852");
            System.out.println("Campo phone preenchido");
        } else {
            System.out.println("Elemento phone nao encontrado");
        }
        if (this.envioDeCotacaoPage.getNomeDeUsuario().isEnabled()) {
            System.out.println("Elemento nome de usuario encontrado");
            this.utils.preencheCampoTexto(this.envioDeCotacaoPage.getNomeDeUsuario(),"golias");
            System.out.println("Campo nome de usuario preenchido");
        } else {
            System.out.println("Elemento nome de usuario nao encontrado");
        }
        if (this.envioDeCotacaoPage.getSenha().isEnabled()) {
            System.out.println("Elemento senha encontrado");
            this.utils.preencheCampoTexto(this.envioDeCotacaoPage.getSenha(),"Golias161");
            System.out.println("Campo senha preenchido");
        } else {
            System.out.println("Elemento senha nao encontrado");
        }
        if (this.envioDeCotacaoPage.getConfirmarSenha().isEnabled()) {
            System.out.println("Elemento confirmar senha encontrado");
            this.utils.preencheCampoTexto(this.envioDeCotacaoPage.getConfirmarSenha(),"Golias161");
            System.out.println("Campo confirmar senha preenchido");
        } else {
            System.out.println("Elemento confirmar senha nao encontrado");
        }
        if (this.envioDeCotacaoPage.getComentarios().isEnabled()) {
            System.out.println("Elemento comentarios encontrado");
            this.utils.preencheCampoTexto(this.envioDeCotacaoPage.getComentarios(),"tudo ok");
            System.out.println("Campo comentarios preenchido");
        } else {
            System.out.println("Elemento comentarios nao encontrado");
        }
    }
    public void clicarBotaoSendDaTelaEnvioCotacao(){
        if(this.envioDeCotacaoPage.getEnviarEmail().isEnabled()){
        System.out.println("Elemento botao next encontrado");
        this.envioDeCotacaoPage.getEnviarEmail().click();
        System.out.println("Pagina de Confirmacao encontrada");
        }
    }
    public String validarEmailEnviado(){
        wait.toString().contains("Sending e-mail success");
        return driver.findElement(By.xpath("//div[@class=\"sweet-alert showSweetAlert visible\"]/child::h2[contains(text(), 'Sending e-mail success!')]")).getText();
    }
}


