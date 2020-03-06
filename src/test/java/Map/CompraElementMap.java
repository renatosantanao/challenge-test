package Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompraElementMap {
    @FindBy(css = "#h_search-input")
    protected WebElement campo_busca;
    @FindBy(css = "#h_search-btn")
    protected WebElement lupa_pesquisar;
    @FindBy(xpath = "//div//img[contains(@alt,\"iPhone X\")]")
    protected WebElement identifcar_produto;
}
