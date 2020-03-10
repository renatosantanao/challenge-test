# language: pt
# new feature
# Tags: optional


Funcionalidade: Compra

  Contexto:
    Dado que estou no site da Americanas e desejo pesquisar um produto
    Quando informo o nome do produto no campo de busca e clico em pesquisar

  @busca
  Cenario: Validar busca produto
    Entao a pagina de busca retorna a listagem de produtos encontrados

  @carrinho
  Cenario: Adiconar um produto ao carrinho
    E na pagina do retorno da busca, clico sobre o produto
    Mas na pagina do detalhe do produto, informo cep e clico no botao Comprar
    Entao o usuario sera redirecionado para tela do carrinho de compra
    E nesta tela o usuario confere o produto adicionado

  @semcep
  Cenario: Adiconar um produto ao carrinho
    E na pagina do retorno da busca, clico sobre o produto
    Mas na pagina do detalhe do produto, nao informo cep e clico no botao Comprar
    Entao o usuario sera redirecionado para tela do carrinho de compra
    E nesta tela o usuario confere o produto adicionado
