package Page;

import Map.CompraElementMap;
import Support.TestRunner;
import org.openqa.selenium.support.PageFactory;

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
    }
}
