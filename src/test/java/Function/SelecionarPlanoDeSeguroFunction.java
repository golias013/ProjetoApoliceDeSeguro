package Function;

import Pages.SelecionarPlanoDeSeguroPage;
import automovelSeguro.BaseTest;
import automovelSeguro.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelecionarPlanoDeSeguroFunction extends BaseTest {

    private SelecionarPlanoDeSeguroPage selecionarPlanoDeSeguroPage;
    private Utils utils;

    public SelecionarPlanoDeSeguroFunction() {
        this.selecionarPlanoDeSeguroPage = new SelecionarPlanoDeSeguroPage(driver);
        this.utils = new Utils();
        wait = new WebDriverWait(driver, 10);
    }

    public void selecionarPlanoDeSeguro() {
        if (this.selecionarPlanoDeSeguroPage.getSelecionarPlanoUltimate().isEnabled()) {
            System.out.println("Elemento plano ultimate encontrado");
            this.selecionarPlanoDeSeguroPage.getSelecionarPlanoUltimate().click();
            System.out.println("Campo Plano Ultimate preenchido");
        } else {
            System.out.println("Elemento plano ultimate nao encontrado");
        }
    }

    public void clicarBotaoNextDaTelaPlanoDeSeguro(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"nextsendquote\"]")));
        //if(this.selecionarPlanoDeSeguroPage.getAvancarParaCotacao().isEnabled()){
            System.out.println("Elemento botao next encontrado");
            this.selecionarPlanoDeSeguroPage.getAvancarParaCotacao().click();
            System.out.println("Pagina de Cotacao encontrada");
    }
    public String validarTituloCotacao(){
        return driver.findElement(By.xpath("//li[@class=\"idealsteps-step-active\"]/child::a[@id=\"sendquote\" and @name=\"Send Quote\"]")).getText();
    }
}

