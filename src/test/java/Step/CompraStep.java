package Step;

import Page.CompraPage;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CompraStep {
    @Dado("^que estou no site da Americanas e desejo pesquisar um produto$")
    public void que_acesso_o_site_da_Americanas() throws Throwable {
        CompraPage compraPage =  new CompraPage();
        compraPage.campoBusca();

    }

    @Quando("^informo o nome do produto no campo de busca e clico em pesquisar$")
    public void informo_o_nome_do_produto_no_campo_de_busca_e_clico_em_pesquisar() throws Throwable {
        CompraPage compraPage =  new CompraPage();
        compraPage.realizarBusca();
    }

    @Entao("^pagina de busca retorna a listagem de produtos encontrados$")
    public void pagina_de_busca_retorna_a_listagem_de_produtos_encontrados() throws Throwable {
        CompraPage compraPage =  new CompraPage();
        compraPage.validarBusca();
    }
}
