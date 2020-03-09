package Page;

import Map.CompraElementMap;
import Support.TestRunner;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class CompraPage extends CompraElementMap {
    public CompraPage(){
        PageFactory.initElements(TestRunner.getDriver(), this);
    }

    public void campoBusca() {
        campo_busca.isDisplayed();
    }

    public void realizarBusca() {
        campo_busca.sendKeys("Iphone X");
        lupa_pesquisar.click();
    }

    public void validarBusca() {
        identifcar_produto.isDisplayed();
        assertTrue(identifcar_produto.isDisplayed());
    }

    public void clickEmProduto() {
        selecionar_produto.click();
    }

    public void compraProduto() {
        assertTrue(nome_produto.isDisplayed());
        cep.sendKeys("31140000");
        botao_ok.click();
        WebDriverWait wait = new WebDriverWait(TestRunner.getDriver(), 20);
        wait.until(ExpectedConditions.visibilityOf(botao_comprar));
        botao_comprar.click();
        wait.until(ExpectedConditions.elementToBeClickable(botao_continuar));
        botao_continuar.click();
    }

    public void validarPaginaCarrinho() {
        assertTrue(titulo_pagina_carrinho.isDisplayed());
    }

    public void validarProduto() {
        assertTrue(produto_no_carrinho.isDisplayed());
    }
}
