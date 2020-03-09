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

    @Entao("^a pagina de busca retorna a listagem de produtos encontrados$")
    public void pagina_de_busca_retorna_a_listagem_de_produtos_encontrados() throws Throwable {
        CompraPage compraPage =  new CompraPage();
        compraPage.validarBusca();
    }

    @Quando("^na pagina do retorno da busca, clico sobre o produto$")
    public void na_pagina_do_retorno_da_busca_clico_sobre_o_produto() throws Throwable {
        CompraPage compraPage =  new CompraPage();
        compraPage.clickEmProduto();
    }

    @Quando("^na pagina do detalhe do produto clico no botao Comprar$")
    public void na_pagina_do_detalhe_do_produto_clico_no_botao_Comprar() throws Throwable {
        CompraPage compraPage =  new CompraPage();
        compraPage.compraProduto();
    }

    @Entao("^o usuario sera redirecionado para tela do carrinho de compra$")
    public void o_usuario_sera_redirecionado_para_tela_do_carrinho_de_compra() throws Throwable {
        CompraPage compraPage =  new CompraPage();
        compraPage.validarPaginaCarrinho();
    }

    @Entao("^nesta tela o usuario confere o produto adicionado$")
    public void nesta_tela_o_usuario_confere_o_produto_adicionado() throws Throwable {
        CompraPage compraPage =  new CompraPage();
        compraPage.validarProduto();
    }
}
