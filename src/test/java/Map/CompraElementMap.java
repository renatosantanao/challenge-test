package Map;

import cucumber.api.java.en_lol.WEN;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompraElementMap {
    @FindBy(css = "#h_search-input")
    protected WebElement campo_busca;
    @FindBy(css = "#h_search-btn")
    protected WebElement lupa_pesquisar;
    @FindBy(xpath = "//div//img[contains(@alt,\"iPhone X\")]")
    protected WebElement identifcar_produto;
    @FindBy(xpath = "//div//img[contains(@alt,\"iPhone X\")]")
    protected WebElement selecionar_produto;
    @FindBy(xpath = "//h1[contains(text(),\"iPhone X\")]")
    protected WebElement nome_produto;
    @FindBy(css = "#freight-field")
    protected WebElement cep;
    @FindBy(xpath = "//span[contains(text(),'Ok')]")
    protected WebElement botao_ok;
    @FindBy(id = "btn-buy")
    protected WebElement botao_comprar;
    @FindBy(xpath = "//span[contains(text(),'Continuar')][1]")
    protected WebElement botao_continuar;
    @FindBy(linkText = "Iphone X 64gb Cinza-espacial")
    protected WebElement produto_no_carrinho;
    @FindBy(xpath = "//h2[contains(text(),\"Minha cesta\")]")
    protected WebElement titulo_pagina_carrinho;
}
